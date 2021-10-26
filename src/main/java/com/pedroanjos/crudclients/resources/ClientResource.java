package com.pedroanjos.crudclients.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedroanjos.crudclients.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "05265716084", 3000.0, Instant.parse("2001-10-13T11:25:30.00Z"), 2));
		list.add(new Client(2L, "Pablo", "19365941024", 1700.0, Instant.parse("1998-07-30T17:05:10.00Z"), 1));
		list.add(new Client(3L, "Juca", "97335640016", 4500.0, Instant.parse("1992-02-17T01:52:39.00Z"), 3));
		return ResponseEntity.ok().body(list);
	}
}
