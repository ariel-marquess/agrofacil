package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planting")
public class PlantingController extends ManagementController {
    // GET que retorna uma lista com todos os plantios cadastrados
    // GET que recebe um id e retorna o plantio correspondente
    // POST que cadastra um novo plantio
    // PUT que atualiza um plantio existente
    // DELETE que remove um plantio
}