package com.nttdata.patterns.Patters.singleton;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	
	public Persona () {}
	
	public Persona(Builder builder) {}
	
	public Persona(String dni,String nombre,int edad,String sexo) {
		this.dni=dni;
		this.edad=edad;
		this.nombre=nombre;
		this.sexo=sexo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + "]";
	}
	
	
}
