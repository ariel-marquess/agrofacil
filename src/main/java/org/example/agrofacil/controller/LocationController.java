package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    // GET que retorna a lista de todas as localizações cadastradas
    // GET que recebe um id e retorna a localização correspondente
    // GET que recebe o id de uma propriedade e retorna a sua localização correspondente
    // GET que recebe o id de uma associação e retorna a sua localização correspondente
    // POST que cadastra uma nova localização
    // PUT que atualiza uma localização existente
    // DELETE que remove uma localização existente
}