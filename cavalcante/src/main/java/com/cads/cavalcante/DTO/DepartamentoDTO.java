package com.cads.cavalcante.DTO;

import com.cads.cavalcante.entities.Departamento;
import com.cads.cavalcante.entities.Usuario;

public class DepartamentoDTO {

private String setor;
private String unidade;





public DepartamentoDTO(){


}


public DepartamentoDTO( String setor, String unidade){

this.setor = setor;
this.unidade = unidade;

}


public DepartamentoDTO(Departamento entity){

    setor = entity.getSetor();
    unidade = entity.getUnidade();

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
