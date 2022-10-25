package com.nttdata.patterns.Patters.singleton;

public interface Builder {
	public Persona constructor(String nombre);
	
	public Persona constructor2(String dni);
	
	public Persona constructor3(String sexo);
	
	public Persona constructor4(int edad);
}
