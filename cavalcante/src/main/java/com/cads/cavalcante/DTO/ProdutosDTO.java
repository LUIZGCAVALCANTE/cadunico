package com.cads.cavalcante.DTO;

import com.cads.cavalcante.entities.Produtos;

public class ProdutosDTO {


    private String Nome;



public ProdutosDTO(){



}


public ProdutosDTO(String Nome){

this.Nome=Nome;


}

public ProdutosDTO(Produtos entity){

    Nome=entity.getNome();

}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    } }
