package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {
    // GET que retorna uma liasta com todos os grupos de agricultores registrados
    // GET que recebe um id e retorna o grupo de agricultores correspondente
    // GET que recebe o id de um agricultor e retorna o grupo de agricultores a qual pertence
    // GET que retorna todos os agricultores que fazem parte de um grupo de agricultores
    // POST que cadastra um novo grupo de agricultores
    // PUT que atualiza um grupo de agricultores existente
    // DELETE que remove um grupo de agricultores existente
}