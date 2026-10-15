package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {
    // GET que retorna a lista de todas as cidades cadastradas
    // GET que recebe um id e retorna a cidade correspondente
    // GET que recebe o nome da cidade e verifica se ela realmente existe no banco, caso exista, envia como resposta a cidade correspondente
    // GET que recebe o id de um estado e retorna todas as cidades vinculadas ao mesmo
    // POST que cadastra uma nova cidade
    // PUT que atualiza uma cidade existente
    // DELETE que remove uma cidade existente
}