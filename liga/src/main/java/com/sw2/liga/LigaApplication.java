package com.sw2.liga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LigaApplication {

	public static void main(String... args) {
		SpringApplication.run(LigaApplication.class, args);
		/*Equipo eq = new Equipo();
		eq.setId(1);
		eq.setNombre("Madrid");
		eq.setPais("España");
		eq.setTitulos(33);
		System.out.println(eq);*/
	}

}
