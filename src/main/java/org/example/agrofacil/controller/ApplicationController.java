package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationController extends ManagementController {
    // GET que retorna uma lista com todas as aplicações de insumos cadastradas
    // GET que recebe um id e retorna a aplicação de insumos correspondente
    // POST que cadastra uma nova aplicação de insumos
    // PUT que atualiza uma aplicação de insumos existente
    // DELETE que remove uma aplicação de insumos existente
}
