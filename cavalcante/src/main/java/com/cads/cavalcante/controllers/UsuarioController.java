package com.cads.cavalcante.controllers;

import com.cads.cavalcante.DTO.UsuarioDTO;
import com.cads.cavalcante.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
        @Autowired
        UsuarioService userService;



    @PostMapping ("/new")
    public UsuarioDTO insert(@RequestBody UsuarioDTO userDTO){
        return this.userService.insert(userDTO);
    }


    @GetMapping("/uall")
    public List<UsuarioDTO> findAll(){

        return userService.findAll();

    }

    //


    @GetMapping("single/{id}")
    public UsuarioDTO findById(@PathVariable Long id){


        return userService.findById(id);
    }

@DeleteMapping ("del/{id}")
public void delete(@PathVariable Long id){

        userService.delete(id);

}

@PutMapping ("att/{id}")
public UsuarioDTO update(@PathVariable UsuarioDTO userDTO, Long id){

        return userService.update(userDTO,  id);

}


}
