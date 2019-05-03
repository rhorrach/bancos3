package Entidades;

public class Banco {
	
	String nombre;
	String identificador;
	
	public Banco() {
		
	}
	
	
	public Banco(String nombre, String identificador) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	
	
	
	

}
