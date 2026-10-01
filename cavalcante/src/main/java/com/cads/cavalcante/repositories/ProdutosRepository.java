package com.cads.cavalcante.repositories;

import com.cads.cavalcante.entities.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
}
