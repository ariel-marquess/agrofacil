package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/neighborhood")
public class NeighborhoodController {
    // GET que retorna a lista de todos os bairros cadastrados
    // GET que recebe um id e retorna o bairro correspondente
    // GET que recebe o nome do bairro e verifica se ele realmente existe no banco, caso exista, envia como resposta o bairro correspondente
    // GET que recebe o id de uma cidade e retorna todos os bairros vinculados à mesma
    // POST que cadastra um novo bairro
    // PUT que atualiza um bairro existente
    // DELETE que remove um bairro existente
}