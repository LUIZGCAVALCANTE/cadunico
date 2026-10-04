package com.cads.cavalcante.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="tb_produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private String Nome;


    public Produtos(){

    }

    public Produtos(String nome) {
        Nome = nome;
    }

    @ManyToMany(mappedBy= "produtos")
    private List<Usuario> usuario = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuario;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuario= usuarios;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
