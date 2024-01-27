package com.example.M5A.Models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Document(collection = "persona")
@Data
public class Persona {
	@Id 
	private Long id;
	private String nombre;
	private String apellido;
	private String direccion;
	private Contactos contactos;
	private List<Telefonia> listTelefonia;
}
