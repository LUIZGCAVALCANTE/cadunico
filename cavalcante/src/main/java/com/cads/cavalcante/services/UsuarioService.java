package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.UsuarioDTO;
import com.cads.cavalcante.entities.Usuario;
import com.cads.cavalcante.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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





}
