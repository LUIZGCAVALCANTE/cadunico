package com.cads.cavalcante.DTO;

import com.cads.cavalcante.entities.Departamento;
import com.cads.cavalcante.entities.Usuario;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "setor","unidade" })

public class DepartamentoDTO {

private Long id;
private String setor;
private String unidade;





public DepartamentoDTO(){


}


public DepartamentoDTO( String setor, String unidade,Long id){
this.id=id;
this.setor = setor;
this.unidade = unidade;

}


public DepartamentoDTO(Departamento entity){

    setor = entity.getSetor();
    unidade = entity.getUnidade();

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
}
