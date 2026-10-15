package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lot")
public class LotController {
    // GET que retorna uma lista com todos os lotes cadastrados
    // GET que recebe um id e retorna o lote correspondente
    // GET que recebe o id de uma propriedade e retorna todos os lotes vinculados a ela
    // POST que cadastra um novo lote
    // PUT que atualiza um lote existente
    // DELETE que remove um lote existente
}