package com.cads.cavalcante.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name="tb_role")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    String authority;

    public Role(){
    }
@OneToOne(mappedBy = "role")
private Usuario usuario;
    public Role(Long id, String authority){

        this.id=id;
        this.authority= authority;
    }

    public Long getId() {
        return id;
    }


    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Role role)) return false;

        return Objects.equals(getId(), role.getId()) && Objects.equals(getAuthority(), role.getAuthority());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getId());
        result = 31 * result + Objects.hashCode(getAuthority());
        return result;
    }
}
