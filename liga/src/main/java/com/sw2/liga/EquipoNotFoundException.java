package com.sw2.liga;

public class EquipoNotFoundException extends RuntimeException {
	
	EquipoNotFoundException(Long id) {
	    super("No se ha encontrado un empleado con id:  " + id);
	}
	

}
