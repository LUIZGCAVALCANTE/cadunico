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
    private String FGTS;
    private String INSS;
    private String CLT;
    private String ESTADO;
    private String CARTAO;
    private String FEDERAL;

    public Produtos(String FGTS, String INSS, String CLT, String ESTADO, String FEDERAL, String CARTAO) {
        this.FGTS = FGTS;
        this.INSS = INSS;
        this.CLT = CLT;
        this.ESTADO = ESTADO;
        this.FEDERAL = FEDERAL;
        this.CARTAO = CARTAO;
    }

    @ManyToMany(mappedBy= "produtos")
    private List<Usuario> usuario = new ArrayList<>();



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

    public String getFEDERAL() {
        return FEDERAL;
    }

    public void setFEDERAL(String FEDERAL) {
        this.FEDERAL = FEDERAL;
    }


    public List<Usuario> getUsuarios() {
        return usuario;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuario= usuarios;
    }

    public Produtos(){

    }


    @Override
    public String toString() {
        return "Produtos{" +
                "Id=" + Id +
                ", FGTS='" + FGTS + '\'' +
                ", INSS='" + INSS + '\'' +
                ", CLT='" + CLT + '\'' +
                ", CARTAO='" + CARTAO + '\'' +
                ", ESTADO='" + ESTADO + '\'' +
                ", FEDERAL='" + FEDERAL + '\'' +
                '}';
    }
}
