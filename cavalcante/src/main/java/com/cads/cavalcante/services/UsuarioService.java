package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.UsuarioDTO;
import com.cads.cavalcante.entities.Usuario;
import com.cads.cavalcante.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
@Autowired
private UsuarioRepository userRepository;



 public UsuarioDTO insert (UsuarioDTO usuarioDTO){

        Usuario user = new Usuario();

        user.setNome(usuarioDTO.getNome());
        user.setCPF(usuarioDTO.getCPF());
        user.setEmail(usuarioDTO.getEmail());
        user.setPassword(usuarioDTO.getPassword());
        user.setCargo(usuarioDTO.getCargo());
    user=  userRepository.save(user);

        return new UsuarioDTO(user.getNome(),user.getCPF(),user.getEmail(),user.getPassword(),user.getCargo());
    }

public void delete(Long id){
     
     userRepository.deleteById(id);


}

    public List<UsuarioDTO> findAll(){

     List<Usuario> usuarios = userRepository.findAll();
     List<UsuarioDTO> users = new ArrayList<>();

     for( Usuario usuario : usuarios){

         UsuarioDTO userDTO =  new UsuarioDTO ( usuario.getNome(), usuario.getCPF(), usuario.getEmail(),
                 usuario.getPassword(), usuario.getCargo());
         users.add(userDTO);


    }

     return users;
}}


