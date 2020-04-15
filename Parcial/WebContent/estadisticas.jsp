<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Estadisticas</title>
	
</head>
<body>
	<h1>Programa Academico</h1> <br>
	<h2>LISTADO ESTUDIANTES POR PROGRAMA</h2> <br>
	<h4>Programa academico</h4>
	<select id = "ProgAcademico" name="ProgAcademico">
		<option>Ingenieria Ambiental</option>
		<option>Ingenieria de Sistemas</option>
		<option>Ingenieria Electronica</option>
		<option>Ingenieria Industrial</option>
		<option>Bioingenieria</option>
	</select> <br>
	<form accept="Estadistica" >
		<button id="buscar">Consultar</button>
	</form>
	<h4>Carrera Seleccionada :</h4> <br>
	<h4>Promedio de la Carrera: ${promedio}</h4> <br>
	<h2>Numero de estudiantes inscritos: ${nEstudiantesInscritos}</h2>
	<h2># Estado Normal: ${nEstadoNormal}</h2>
	<h2># Estado En Prueba Academica: ${nEstadoPruebaAcademica}</h2>
	<h2>Numero de hombres: ${nHombres}</h2>
	<h2>Numero de mujeres: ${nMujeres}</h2>
	<h2>Numero de Estudiantes (EDAD < 18 AÑOS): ${nMenores}</h2>
	<h2>Numero de Estudiantes (EDAD > 18 AÑOS): ${nMayores}</h2>
	<h2>Fecha: ${fecha}</h2>
	<h2>Ip: ${ip}</h2>
	
</body>
</html>