package com.pedroanjos.crudclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedroanjos.crudclients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
