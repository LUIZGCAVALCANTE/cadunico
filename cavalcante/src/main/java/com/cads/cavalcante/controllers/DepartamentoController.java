package com.cads.cavalcante.controllers;

import com.cads.cavalcante.DTO.DepartamentoDTO;
import com.cads.cavalcante.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depart")
public class DepartamentoController {

    @Autowired
    DepartamentoService departService;


    @GetMapping("/departall")
    public List<DepartamentoDTO> findAll(){


        return departService.findAll();
    }


        @PostMapping("/departin")
    public DepartamentoDTO insert(@RequestBody DepartamentoDTO departDTO){


        return departService.insert(departDTO);

    }




}
