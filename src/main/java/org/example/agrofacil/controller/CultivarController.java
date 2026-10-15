package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cultivar")
public class CultivarController {
    // GET que retorna uma lista com todas as cultivares cadastradas
    // GET que recebe um id e retorna a cultivar correspondente
    // GET que recebe o id de um lote e retorna todas as cultivares vinculadas a ele
    // GET que recebe o id de um manejo e retorna todas as cultivares vinculadas a ele
    // GET que recebe o id de uma categoria e retorna todas as cultivares vinculadas a ela
    // POST que cadastra uma nova cultivar
    // PUT que atualiza uma cultivar existente
    // DELETE que remove uma cultivar existente
}