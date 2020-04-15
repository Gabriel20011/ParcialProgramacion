package co.edu.unbosque.model;

public class Estudiante {
	private String nombre;
	private String edad;
	private String genero;
	private String documento;
	private String carrera;
	private String semestre;
	private String promedio;
	private String estado;
	public Estudiante(String nombre, String edad, String genero, String documento, String carrera, String semestre,
			String promedio, String estado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.documento = documento;
		this.carrera = carrera;
		this.semestre = semestre;
		this.promedio = promedio;
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getPromedio() {
		return promedio;
	}
	public void setPromedio(String promedio) {
		this.promedio = promedio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String toString() {
		String res = "";
		res = nombre.toUpperCase()+ ";" + edad.toUpperCase()+ ";" + genero.toUpperCase()+ ";" + documento.toUpperCase()+ ";" + carrera.toUpperCase()
		+ ";" + semestre.toUpperCase()+ ";" + promedio.toUpperCase()+ ";" +estado.toUpperCase();
		return res;
	}
}
