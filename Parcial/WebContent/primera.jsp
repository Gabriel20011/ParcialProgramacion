<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E.P. -C2</title>
</head>
<body>
<form action="Controller">
<h1 align="center">EXAMEN PRÁCTICO CORTE No.2</h1>
<h1 align="center">U. EL BOSQUE: Seguimiento Estudiantes</h1>
<img align="left" src="imag/ubosque.png">

<input type= "submit" name= "listadoCompleto" id= "listadoCompleto" >ver listado completo / consultar</input><br>
<input type= "submit" name= "estadisticas" id = "estadisticas">estadistica por programa</input><br>
Gabriel Alejandro Ortega Maricuto   <b>Fecha:</b>${fecha}<br>
Juan David Quintero Gaona           <b>IP</b>${IP}<br>
</form>
</body>
</html>