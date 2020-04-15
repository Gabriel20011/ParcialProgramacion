package co.edu.unbosque.controller;

import java.sql.*;
import java.util.ArrayList;

import co.edu.unbosque.model.Estudiante;

public class DTO {

	public void CargarEstudientes(ArrayList<Estudiante> estudiantes) {

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			String coneccion = "jdbc:mysql://remotemysql.com:3306/bYdGSrecoi?user=bYdGSrecoi&password=LlAfTpBNxB";
			con = DriverManager.getConnection(coneccion);

			statement = con.createStatement();

			resultSet = statement.executeQuery("SELECT * FROM estudiantes");


			while(resultSet.next()) {
				String nombre = resultSet.getString("NOMBRE") ;
				String carrera = resultSet.getString("CARRERA");
				String ide = resultSet.getString("DOCUMENTOIDENTIFICACION");
				String edad = resultSet.getString("EDAD");
				String genero = resultSet.getString("GENERO");
				String semestre = resultSet.getString("SEMESTRE");
				String promPond =  resultSet.getString("PROMEDIOPONDERADO");
				String estado = resultSet.getString("ESTADO");

				estudiantes.add(new Estudiante(nombre, edad, genero, ide, carrera, semestre, promPond, estado));
			}

		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ah listo");
	}

}
