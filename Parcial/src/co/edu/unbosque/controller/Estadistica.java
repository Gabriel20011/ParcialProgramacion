package co.edu.unbosque.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.unbosque.model.Estudiante;

/**
 * Servlet implementation class Estadistica
 */
@WebServlet("/Estadistica")
public class Estadistica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Estudiante> estudiantes;
	private DTO dto;
	private int muj;
	private int hom;
	private int menos18;
	private int mas18;
	private int normal;
	private int academica;
	private double prom;
	private int numeroEstudiantes;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Estadistica() {
        super();
    	estudiantes = new ArrayList<Estudiante>();
		dto = new DTO();
		dto.CargarEstudientes(estudiantes);
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		System.out.println(request.getParameter("ProgAcademico"));
		filtrar(request.getParameter("ProgAcademico"));
		String ip = request.getRemoteAddr();
		Date fecha = new Date();
		request.setAttribute("fecha", fecha);
		request.setAttribute("IP", ip);
		request.setAttribute("promedio", prom);
		request.setAttribute("mujeres", muj);
		request.setAttribute("hombre", hom);
		request.setAttribute("menos", menos18);
		request.setAttribute("mas", mas18);
		request.setAttribute("normal", normal);
		request.setAttribute("academica", academica);
		request.setAttribute("numero", numeroEstudiantes);
		request.setAttribute("fecha", fecha);
		request.setAttribute("ip", ip);
		RequestDispatcher miDis = request.getRequestDispatcher("/estadisticas.jsp");
		miDis.forward(request, response);
	}
	public void filtrar(String carrera) {
		for (Estudiante i : estudiantes) {
			if (i.getCarrera().equals(carrera)){
				prom += Double.parseDouble(i.getPromedio());
				numeroEstudiantes++;
				if(i.getGenero()=="M") {
					muj++;
				}else {
					hom++;
				}
				if(i.getEstado()=="NORMAL") {
					normal++;
				}else {
					academica++;
				}
				if(Integer.parseInt(i.getEdad())<18) {
					menos18++;
				}else {
					mas18++;
				}
			}
		}
		prom = prom/numeroEstudiantes;
	}

}
