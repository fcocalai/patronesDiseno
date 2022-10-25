package com.nttdata.patterns.Patters.singleton;

public class BuilderPersona1 implements Builder{
	
	private String dni;
	private String nombre;
	private String sexo;
	private int age;

	@Override
	public Persona constructor(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona constructor2(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona constructor3(String sexo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona constructor4(int edad) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Persona getPersona() {
		return new Persona(this.dni,this.nombre,this.age,this.sexo); 
	}

}
