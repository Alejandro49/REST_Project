package com.sw2.liga;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "equipos")
interface EquipoRepository extends CrudRepository<Equipo, Long> {

}
