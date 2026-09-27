package com.cads.cavalcante.controllers;

import com.cads.cavalcante.DTO.UsuarioDTO;
import com.cads.cavalcante.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioController {
        @Autowired
        UsuarioService userService;
    @PostMapping
    public UsuarioDTO insert(UsuarioDTO userDTO){
        return this.userService.insert(userDTO);
    }





}
