package com.cads.cavalcante.controllers;

import com.cads.cavalcante.DTO.ProdutosDTO;
import com.cads.cavalcante.repositories.ProdutosRepository;
import com.cads.cavalcante.services.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prod")
public class ProdutosController {

    @Autowired
     ProdutosService prodservice;


    @GetMapping("/all")
    public List<ProdutosDTO> findAll(){

        return prodservice.findAll();

    }



    @PostMapping("/new")
    public ProdutosDTO insert (@RequestBody ProdutosDTO prodDTO) {
        return prodservice.insert(prodDTO);

    }





}
