<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E.P. -C2</title>
</head>
<body>
<h1 align="center">EXAMEN PR�CTICO CORTE No.2</h1>
<h1 align="center">U. EL BOSQUE: Seguimiento Estudiantes</h1>
<img align="left" src="imag/ubosque.png">
<form action="Listado" action= "GET">
<button name= "listadoCompleto" id= "listadoCompleto" >ver listado completo / consultar</button><br>
</form>
<button name= "estadisticas" id = "estadisticas" onclick="self.location.href = 'estadisticas.jsp'" >estadistica por programa</button><br>
Gabriel Alejandro Ortega Maricuto   <b>Fecha:</b>${fecha}<br>
Juan David Quintero Gaona           <b>IP</b>${IP}<br>
</body>
</html>