package com.nttdata.bootcamp.proyectoprueba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="estados")
public class EstadoEndPoint {
	private List<String> listado = new ArrayList<>();
	
	@ReadOperation
	public List<String>estados(){
		return listado;
	}
	
	@WriteOperation
	public void deleteOperation(@Selector String estadoNuevo) {
		listado.add(estadoNuevo);
	}
	
	@DeleteOperation
	public void deleteOpertaion(@Selector String estadoBorrar) {
		listado.remove(estadoBorrar);
	}
	
}
