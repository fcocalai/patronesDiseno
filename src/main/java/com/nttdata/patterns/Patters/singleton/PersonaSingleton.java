package com.nttdata.patterns.Patters.singleton;

public class PersonaSingleton {
	private Persona persona;
	
	private PersonaSingleton() {}
	
	public Persona getInstance() {
		if (persona == null) {
            persona = new Persona();
        }
        return persona;
	}
	
	public void singletonOpertation() {
		System.out.println("Siuuuuuu");
	}
}
