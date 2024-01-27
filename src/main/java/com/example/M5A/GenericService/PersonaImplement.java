package com.example.M5A.GenericService;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.M5A.Models.Persona;
import com.example.M5A.Repository.PersonaRepository;

@Service

public class PersonaImplement extends GenericServiceImpl<Persona,Long> implements PersonaService{
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }
}
