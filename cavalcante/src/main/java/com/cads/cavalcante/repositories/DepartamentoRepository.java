package com.cads.cavalcante.repositories;

import com.cads.cavalcante.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartamentoRepository extends JpaRepository <Departamento, Long> {

    Optional<Departamento> findBySetorAndUnidade(String setor, String unidade);

}
