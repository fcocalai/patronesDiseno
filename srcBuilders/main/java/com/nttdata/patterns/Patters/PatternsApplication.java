package com.nttdata.patterns.Patters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.patterns.Patters.singleton.BuilderPersona1;
import com.nttdata.patterns.Patters.singleton.Persona;

@SpringBootApplication
public class PatternsApplication implements CommandLineRunner{
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		BuilderPersona1 b=new BuilderPersona1();
		b.constructor("batman");
		b.constructor3("hombre/murcielago");
		
		Persona p=b.getPersona();
		
		System.out.println(p);
		
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("asdasdasdadsa");
	}

}
