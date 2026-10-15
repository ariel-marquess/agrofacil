package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handling")
public class ManagementController {
    // GET que retorna uma lista com todos os manejos cadastrados
    // GET que recebe um id e retorna o manejo correspondente
    // GET que recebe o id de um lote e retorna todos os manejos vinculados a ele
    // POST que cadastra um novo manejo
    // PUT que atualiza um manejo existente
    // DELETE que remove um manejo existente
}