package com.cads.cavalcante.DTO;

import com.cads.cavalcante.entities.Produtos;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({ "id", "Nome" })
public class ProdutosDTO {

    private Long id;
    private String Nome;



public ProdutosDTO(){



}

    @JsonPropertyOrder({ "id", "Nome" })

public ProdutosDTO( Long id, String Nome){
this.id=id;
this.Nome=Nome;


}

public ProdutosDTO(Produtos entity){

    id = entity.getId();
    Nome=entity.getNome();

}

    public Long getId() {
        return id;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    } }
