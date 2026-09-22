package com.cads.cavalcante.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private  String setor;
    private  String unidade;

    @OneToMany(mappedBy="departamento")
    private List < Usuario > usuario = new ArrayList<>();

    public Departamento(){


    }

    public Departamento(Long id, String setor, String unidade) {
        this.id = id;
        this.setor = setor;
        this.unidade = unidade;
    }

    public Long getId() {
        return id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }


    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", setor='" + setor + '\'' +
                ", unidade='" + unidade + '\'' +
                '}';
    }
}
