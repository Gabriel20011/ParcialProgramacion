package co.edu.unbosque.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.unbosque.model.Estudiante;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ArrayList<Estudiante> estudiantes;
	private DTO dto;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
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
		String ip = request.getRemoteAddr();
		Date fecha = new Date();
		request.setAttribute("fecha", fecha);
		request.setAttribute("IP", ip);
		String botonPresionado = request.getParameter("submit");
		if (botonPresionado == null) {
			RequestDispatcher miDis = request.getRequestDispatcher("/primera.jsp");
			miDis.forward(request, response);
		}
		if (botonPresionado.equals("listadoCompleto")) {
			

		}
		else if (botonPresionado.equals("estadisticas")){
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


}
