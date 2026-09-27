package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.UsuarioDTO;
import com.cads.cavalcante.entities.Usuario;
import com.cads.cavalcante.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
@Autowired
private UsuarioRepository userRepository;

// criar usuario

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

// atualizar usuario

    public UsuarioDTO update(UsuarioDTO userDTO, Long id){

        Usuario user = userRepository.getReferenceById(id);

    user.setNome(userDTO.getNome());
    user.setCPF(userDTO.getCPF());
    user.setEmail(userDTO.getEmail());
    user.setPassword(userDTO.getPassword());
    user.setCargo(userDTO.getCargo());
        return new UsuarioDTO(user.getNome(),user.getCPF(),user.getEmail(),user.getPassword(),user.getCargo());

    }


    public void delete(Long id){

     userRepository.deleteById(id);


}
// buscar por id
public UsuarioDTO findById(Long id){

    Optional<Usuario> result = userRepository.findById(id);

     if (result.isEmpty()){

        throw new RuntimeException("Usuario não localizado" + id);

     }

     Usuario usuario = result.get();
     return new UsuarioDTO(usuario.getNome(), usuario.getCPF(),usuario.getEmail(),usuario.getPassword(),usuario.getCargo());
}


//buscar todos usuarios
    public List<UsuarioDTO> findAll(){

     List<Usuario> usuarios = userRepository.findAll();
     List<UsuarioDTO> users = new ArrayList<>();

     for( Usuario usuario : usuarios){

         UsuarioDTO userDTO =  new UsuarioDTO ( usuario.getNome(), usuario.getCPF(), usuario.getEmail(),
                 usuario.getPassword(), usuario.getCargo());
         users.add(userDTO);


    }

     return users;
}







}


