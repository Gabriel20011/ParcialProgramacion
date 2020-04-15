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
<form action="get">
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
	<c:forEach items="${nombres}" var="nombre">

		</c:forEach>
							
		
	</table>
	Nombre: <input type="text"><br>
	Documento de identificación: <input type="text"><br>
	<button>Buscar</button><br>
<pre>Nombre:                                                                    Semestre:<br>
Documento de identificaion:                                                Promedio Ponderado:<br>
Carrera:                                                                   Estado:<br>
	                                                                       fecha:<br>
	                                                                       IP:</pre>
	                                     
</form>
</body>
</html>