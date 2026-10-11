package com.cads.cavalcante.DTO;

public class UsuarioCadastroDTO {


    private UsuarioDTO usuario;
    private DepartamentoDTO departamento;

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public DepartamentoDTO getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoDTO departamento) {
        this.departamento = departamento;
    }
}
