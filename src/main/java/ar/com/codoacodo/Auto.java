package ar.com.codoacodo;



public class Auto {
	
	/*
	 atributos
	 */
	
	boolean encendido;
	float velocidadActual;
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	//constructor por defecto explicito
	Auto(){
		this.encendido = false;		
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	Auto(final float velocidadMaxima){
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
		
	}
	
	//metodos
	
	void encender() {
		if(!encendido) {
			
			System.out.println("se ha encendido");
		encendido = true;
		}else {
			System.out.println("ya esta encendido");
		}
		
	}
	void apagar() {
		
	}
	void acelerar() {
		if(encendido) {
			
			if (this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}else {
			System.out.println("se quema el auto");
		}
		}else {
			System.out.println("debe encender el auto");
		}
		
}
	void frenar() {
		if (this.encendido) {
			if(this.velocidadActual > 0) {
				System.out.println("frenando");
				this.velocidadActual--;
			}
			
		}
		
	}
	
	void mosytarInfo() {
		System.out.println("encendido:" + encendido);
	}
}
