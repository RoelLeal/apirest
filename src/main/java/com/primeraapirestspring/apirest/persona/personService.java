package com.primeraapirestspring.apirest.persona;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class personService {

    private final personRepository personRepository;
    
    public void createPersona(person person) {
        personRepository.save(person);
    }
}