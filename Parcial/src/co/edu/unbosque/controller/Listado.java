package co.edu.unbosque.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.unbosque.model.Estudiante;

/**
 * Servlet implementation class Listado
 */
@WebServlet("/Listado")
public class Listado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Estudiante> estudiantes;
	private DTO dto;


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listado() {
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
		response.setContentType("text/html");
		request.setAttribute("nombres", separarPorNombre());
		request.setAttribute("edad", separarPorEdad());
		request.setAttribute("genero", separarPorGenero());
		request.setAttribute("documento", separarPorNombre());
		request.setAttribute("carrera", separarPorNombre());
		request.setAttribute("semestre", separarPorNombre());
		request.setAttribute("promedio", separarPorNombre());
		request.setAttribute("estado", separarPorNombre());
		RequestDispatcher iDis = request.getRequestDispatcher("/Listado.jsp");
		iDis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public ArrayList<String> separarPorNombre(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getNombre());
		}
		return nombres;
	}
	public ArrayList<String> separarPorEdad(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getEdad());
		}
		return nombres;
	}
	public ArrayList<String> separarPorGenero(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getGenero());
		}
		return nombres;
	}
	public ArrayList<String> separarPorCarrera(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getCarrera());
		}
		return nombres;
	}
	public ArrayList<String> separarPorDocumento(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getDocumento());
		}
		return nombres;
	}
	public ArrayList<String> separarPorSemestre(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getSemestre());
		}
		return nombres;
	}
	public ArrayList<String> separarPorPromedio(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getPromedio());
		}
		return nombres;
	}
	public ArrayList<String> separarPorEstado(){
		ArrayList<String> nombres = new ArrayList<String>();
		for (Estudiante i : estudiantes) {
			nombres.add(i.getEstado());
		}
		return nombres;
	}

}
