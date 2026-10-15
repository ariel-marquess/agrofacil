package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/harvest")
public class HarvestController extends ManagementController {
    // GET que retorna uma lista com todas as colheitas cadastradas
    // GET que recebe um id e retorna a colheita correspondente
    // POST que cadastra uma nova colheita
    // PUT que atualiza uma colheita existente
    // DELETE que remove uma colheita existente
}