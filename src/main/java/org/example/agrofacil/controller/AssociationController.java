package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/association")
public class AssociationController {
    // GET que retorna uma lista com todas as associações registradas
    // GET que recebe um id e retorna a sua associação correspondente
    // GET que recebe o id de um grupo de agricultores e retorna a associação a qual integra
    // GET que recebe o id de um agricultor e retorna a associação a qual integra
    // GET que retorna todos os grupos de agricultores vinculados à associação
    // GET que retorna todos os agricultores vinculados à associação
    // POST que cadastra uma nova associação
    // PUT que atualiza uma associação existente
    // DELETE que remove uma associação existente
}