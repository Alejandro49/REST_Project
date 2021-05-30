package com.sw2.liga;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipoController {
	
	private final EquipoRepository repository;

	  EquipoController(EquipoRepository repository) {
	    this.repository = repository;
	  }


	  // Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/equipos")
	  List<Equipo> all() {
	    return repository.findAll();
	  }
	  // end::get-aggregate-root[]

	  @PostMapping("/equipos")
	  Equipo nuevoEquipo(@RequestBody Equipo nuevoEquipo) {
	    return repository.save(nuevoEquipo);
	  }

	  // Single item
	  
	  @GetMapping("/equipos/{id}")
	  EntityModel<Equipo> one(@PathVariable Long id) {

	    Equipo equipo = repository.findById(id) //
	        .orElseThrow(() -> new EquipoNotFoundException(id));

	    return EntityModel.of(equipo, //
	        WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(EquipoController.class).one(id)).withSelfRel(),
	        WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(EquipoController.class).all()).withRel("equipos"));
	  }
	  
	  
	  @PutMapping("/equipos/{id}")
	  Equipo reemplazarEquipo(@RequestBody Equipo equipoNuevo, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(equipo -> {
	    	
	    	equipo.setNombre(equipoNuevo.getNombre());
	    	equipo.setPais(equipoNuevo.getPais());
	    	equipo.setTitulos(equipoNuevo.getTitulos());
	        
	        return repository.save(equipo);
	      })
	      .orElseGet(() -> {
	        equipoNuevo.setId(id);
	        return repository.save(equipoNuevo);
	      });
	  }

	  @DeleteMapping("/equipos/{id}")
	  void borrarEquipo(@PathVariable Long id) {
	    repository.deleteById(id);
	  }

}
