package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workers")
public class WorkersController {
    // GET que retorna uma lista com todos os trabalhadores cadastrados
    // GET que recebe um id e retorna o trabalhador correspondente
    // GET que recebe o id de um agricultor e retorna todos os trabalhadores que trabalham com ele
    // GET que retorna todos os agricultores que participam de um grupo de trabalhadores
    // POST que cadastra um novo trabalhador
    // PUT que atualiza um trabalhador existente
    // DELETE que remove um trabalhador existente
}