package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    // GET que retorna uma lista com todos os equipamentos cadastrados
    // GET que recebe um id e retorna o equipamento correspondente
    // GET que recebe o id de um manejo e retorna todos os equipamentos vinculados a ele
    // POST que cadastra um novo equipamento
    // PUT que atualiza um equipamento existente
    // DELETE que remove um equipamento
}