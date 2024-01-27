package com.example.M5A.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "contactos")
@Data
public class Contactos {
	private String correo;
	private String celular;

}
