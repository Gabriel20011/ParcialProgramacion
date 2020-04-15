<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E.P. -C2</title>
</head>
<body>
	<h1 align="center">EXAMEN PRÁCTICO CORTE No.2</h1>
	<h1 align="center">LISTADO COMPLETO DE ESTUDIANTES </h1>
	<h1 align="center">FACULTAD DE INGENIERÍA </h1>
	<table>
	<tr>
	<td>NOMBRE</td>
	<td>EDAD</td>
	<td>GÉNERO</td>
	<td>DOCUMENTO DE IDENTIFICACION</td>
	<td>CARRERA PRINCIPAL</td>
	<td>SEMESTRE</td>
	<td>PROMEDIO PONDERADO</td>
	<td>ESTADO</td>
	</tr>
	<%
	ArrayList<String> nombres = (ArrayList<String>)request.getAttribute("nombres");
	ArrayList<String> edades = (ArrayList<String>)request.getAttribute("edades");
	ArrayList<String> generos = (ArrayList<String>)request.getAttribute("generos");
	ArrayList<String> documentos = (ArrayList<String>)request.getAttribute("documentos");
	ArrayList<String> carreras = (ArrayList<String>)request.getAttribute("carreras");
	ArrayList<String> semestres = (ArrayList<String>)request.getAttribute("semestres");
	ArrayList<String> promedios = (ArrayList<String>)request.getAttribute("promedios");
	ArrayList<String> estados = (ArrayList<String>)request.getAttribute("estados");
	
	 for (int i = 0 ; i < nombres.size() ; i++){
		 out.print("<tr>");
		 out.print("<td>"+ nombres.get(i)+"</td>");
		 out.print("<td>"+ edades.get(i)+"</td>");
		 out.print("<td>"+ generos.get(i)+"</td>");
		 out.print("<td>"+ documentos.get(i)+"</td>");
		 out.print("<td>"+ carreras.get(i)+"</td>");
		 out.print("<td>"+ semestres.get(i)+"</td>");
		 out.print("<td>"+ promedios.get(i)+"</td>");
		 out.print("<td>"+ estados.get(i)+"</td>");
		 out.print("</tr>");
	 }
	%>
</table>
	
<form action="Listado" method="POST">
	<input type="text" id="bNombre" name = "bNombre">
	<input type="text" id="bDocumento" name="bDocumento">
	<input type="submit" value="Buscar">
</form>

Nombre  ${Nombre}
Genero ${Genero}
Documento:  ${nID}
Promedio: ${Promedio}
Edad: ${Edad}
Carrera: ${Carrera}
Semestre: ${Semestre}
Estado : ${Estado} </br>
</br>
<%= "Fecha: " %>                              
</body>
</html>