package com.cads.cavalcante.DTO;

import com.cads.cavalcante.entities.Produtos;

public class ProdutosDTO {



private String FGTS;
private String INSS;
private String CLT;
private String ESTADO;
private String CARTAO;
private String Federal;


public ProdutosDTO(){



}


public ProdutosDTO(String FGTS, String INSS, String CLT, String ESTADO, String CARTAO,String Federal){

this.FGTS=FGTS;
this.INSS=INSS;
this.CLT=CLT;
this.ESTADO=ESTADO;
this.CARTAO=CARTAO;
this.Federal=Federal;
}


public ProdutosDTO(Produtos entity){


    FGTS=entity.getFGTS();
    INSS=entity.getINSS();
    CLT=entity.getCLT();
    ESTADO=entity.getESTADO();
    CARTAO=entity.getCARTAO();
    Federal=entity.getFEDERAL();

}

    public String getFGTS() {
        return FGTS;
    }

    public void setFGTS(String FGTS) {
        this.FGTS = FGTS;
    }

    public String getINSS() {
        return INSS;
    }

    public void setINSS(String INSS) {
        this.INSS = INSS;
    }

    public String getCLT() {
        return CLT;
    }

    public void setCLT(String CLT) {
        this.CLT = CLT;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getCARTAO() {
        return CARTAO;
    }

    public void setCARTAO(String CARTAO) {
        this.CARTAO = CARTAO;
    }

    public String getFederal() {
        return Federal;
    }

    public void setFederal(String federal) {
        Federal = federal;
    }
}
