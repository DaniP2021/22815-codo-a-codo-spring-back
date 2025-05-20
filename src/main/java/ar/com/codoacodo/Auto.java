package ar.com.codoacodo;

public class Auto {
	
	/*
	 atributos
	 */
	
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	//constructor por defecto explicito
	Auto(){
		
		encendido = false;
	}
	
	//metodos
	
	void encender() {
		
		encendido = true;
		
	}
	void apagar() {
		
	}
	void acelerar() {
		
	}
	void frenar() {
		
	}
	
	void mosytarInfo() {
		System.out.println("encendido:" + encendido);
	}
}
