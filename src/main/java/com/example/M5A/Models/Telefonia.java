package com.example.M5A.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "telefonia")
@Data
public class Telefonia {
	private String tipotelefonia;
	private String telefono;

}
