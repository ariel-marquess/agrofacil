package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmer")
public class FarmerController {
    // GET que retorna uma lista com todos os agricultores cadastrados
    // GET que recebe um id e retorna o agricultor correspondente
    // GET que recebe o id de uma propriedade e retorna o agricultor que trabalha com ela
    // GET que retorna todas as propriedades que o agricultor trabalha
    // POST que cadastra um novo agricultor
    // PUT que atualiza um agricultor existente
    // DELETE que remove um agricultor existente
}