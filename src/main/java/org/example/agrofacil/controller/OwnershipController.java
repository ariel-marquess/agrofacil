package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ownership")
public class OwnershipController {
    // GET que retorna uma lista com todas as propriedades cadastradas
    // GET que recebe um id e retorna a propriedade correspondente
    // GET que recebe o id de um agricultor e retorna todas as propriedades que ele possui
    // GET que retorna todos os lotes vinculados a uma propriedade
    // POST que cadastra uma nova propriedade
    // PUT que atualiza uma propriedade existente
    // DELETE que remove uma propriedade existente
}