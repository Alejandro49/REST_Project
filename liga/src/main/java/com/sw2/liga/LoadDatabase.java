package com.sw2.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EquipoRepository repoEquipo, LigaRepository ligaRepo) {

    return args -> {
    	// Inicializamos el Servicio Web con dos Ligas, dos equipos por Liga.
    	Liga laLiga = new Liga("Liga Santander", "España");
    	ligaRepo.save(laLiga);
    	
    	Equipo madrid = new Equipo("Real Madrid", "Zidedine Zidane", 104);
    	madrid.setLiga(laLiga);
    	Equipo barsa = new Equipo("F.C Barcelona", "Ronald Koeman", 77);
    	barsa.setLiga(laLiga);
    	
    	laLiga.addEquipo(madrid);
    	laLiga.addEquipo(barsa);
    	ligaRepo.save(laLiga);
    	repoEquipo.save(madrid);
    	repoEquipo.save(barsa);
    	
    	Liga premier = new Liga("Premier League", "Inglaterra");
    	ligaRepo.save(premier);
    	
    	Equipo chelsea = new Equipo("Chelsea", "Thomas Tuchel", 25);
    	chelsea.setLiga(premier);
    	Equipo liverpool = new Equipo("Liverpool", "Jurgen Klopp", 56);
    	liverpool.setLiga(premier);
    	
    	premier.addEquipo(chelsea);
    	premier.addEquipo(liverpool);
    	ligaRepo.save(premier);
    	repoEquipo.save(chelsea);
    	repoEquipo.save(liverpool);
    	
    	
    };
    
  }
}