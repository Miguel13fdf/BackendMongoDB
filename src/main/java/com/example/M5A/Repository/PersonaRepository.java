package com.example.M5A.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.M5A.Models.Persona;

public interface PersonaRepository extends MongoRepository<Persona, Long> {
}