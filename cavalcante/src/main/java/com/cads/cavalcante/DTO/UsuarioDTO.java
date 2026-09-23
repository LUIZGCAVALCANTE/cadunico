package com.cads.cavalcante.DTO;

import com.cads.cavalcante.entities.Usuario;

public class UsuarioDTO {


    private Long id;
    private String Nome;
    private String CPF;
    private String email;
    private String password;
    private String cargo;


    public UsuarioDTO(Long id, String Nome, String CPF, String email, String password, String cargo){


    this.id=id;
    this.Nome= Nome;
    this.CPF = CPF;
    this.email= email;
    this.password = password;
    this.cargo=cargo;

    }


    public UsuarioDTO(Usuario entity) {

        id =entity.getId();
        Nome=entity.getNome();
        CPF = entity.getCPF();
        email=entity.getEmail();
        password=entity.getPassword();
        cargo=entity.getCargo();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
