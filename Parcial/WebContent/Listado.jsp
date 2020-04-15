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
	<tr>
	<c:forEach items="${nombres}" var="nombre">
		<td>${nombre}</td>
	</c:forEach>
	<c:forEach items="${edad}" var="edad">
		<td>${edad}</td>
	</c:forEach><c:forEach items="${genero}" var="genero">
		<td>${genero}</td>
	</c:forEach><c:forEach items="${documento}" var="doc">
		<td>${doc}</td>
	</c:forEach><c:forEach items="${carrera}" var="car">
		<td>${car}</td>
	</c:forEach><c:forEach items="${semestre}" var="sem">
		<td>${sem}</td>
	</c:forEach><c:forEach items="${promedio}" var="pro">
		<td>${pro}</td>
	</c:forEach><c:forEach items="${estado}" var="est">
		<td>${est}</td>
	</c:forEach>
		</tr>
	

	
	
	</table>
</form>
</body>
</html>