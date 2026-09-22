package com.cads.cavalcante.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String Nome;
    private String CPF;
    private String email;
    private String password;
    private String cargo;




    @ManyToMany
    @JoinTable(
            name="usuario_produto",
            joinColumns =@JoinColumn(name="usuario_id"),
            inverseJoinColumns = @JoinColumn(name="produtos_id")
    )
    private List<Produtos> produtos = new ArrayList();







    @OneToOne
    @JoinColumn(name ="departamento_id")
    private Departamento departamento;




    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @OneToOne
    @JoinColumn(name="role_id")
    private Role role;

    public Usuario(){


    }




    public Usuario(String nome, String CPF, String email, String password, String cargo) {
        Nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.password = password;
        this.cargo = cargo;
    }



    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Usuario usuario)) return false;

        return getId().equals(usuario.getId()) && getNome().equals(usuario.getNome()) && getCPF().equals(usuario.getCPF()) && getEmail().equals(usuario.getEmail()) && getPassword().equals(usuario.getPassword()) && getCargo().equals(usuario.getCargo());
    }






    public Long getId() {
        return id;
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


    //PRODUTOS

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

//DEPAR
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento)
    {
        this.departamento = departamento;
    }




    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getNome().hashCode();
        result = 31 * result + getCPF().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getCargo().hashCode();
        return result;
    }

}
