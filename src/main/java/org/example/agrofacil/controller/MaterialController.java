package org.example.agrofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
public class MaterialController {
    // GET que retorna uma lista com todos os materiais cadastrados
    // GET que recebe um id e retorna o material correspondente
    // GET que recebe o id de um insumo e retorna todos os materiais vinculados a ele
    // POST que cadastra um novo material
    // PUT que atualiza um material existente
    // DELETE que remove um material
}