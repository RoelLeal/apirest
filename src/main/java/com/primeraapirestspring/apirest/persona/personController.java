package com.primeraapirestspring.apirest.persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class personController {

    private final personService personService;
    
    @PostMapping
    public void createPersona(@RequestBody person person) {
        personService.createPersona(person);
    }

}
