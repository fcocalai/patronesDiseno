package com.nttdata.patterns.Patters.singleton;

public class PersonaSingleton {
	private static Persona persona;
	
	private PersonaSingleton() {}
	
	public static Persona getInstance() {
		if (persona == null) {
            persona = new Persona();
        }
        return persona;
	}
	
	public void singletonOpertation() {
		System.out.println("Siuuuuuu");
	}
}
