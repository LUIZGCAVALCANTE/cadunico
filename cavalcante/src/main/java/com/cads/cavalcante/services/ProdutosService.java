package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.ProdutosDTO;
import com.cads.cavalcante.entities.Produtos;
import com.cads.cavalcante.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ProdutosService {


    @Autowired
    private ProdutosRepository productRepository;



// service de criacao de novos produtos

    public ProdutosDTO insert(ProdutosDTO productDTO ){

        Produtos product = new Produtos();
        product.setNome(productDTO.getNome());

        product = productRepository.save(product);

        return new ProdutosDTO (product.getId(), product.getNome());

    }


//atualizar produtos
    public ProdutosDTO update(ProdutosDTO productDTO, Long id){

        Produtos produtos = productRepository.getReferenceById(id);

        produtos.setNome(productDTO.getNome());


        return new ProdutosDTO( produtos.getId(), produtos.getNome());

    }
        //dell produtos
        public void delete(Long id){

        productRepository.deleteById(id);
        }


        //buscar por id
        public ProdutosDTO findById(Long id){

            Optional<Produtos> result = productRepository.findById(id);

            if (result.isEmpty()){

            throw new RuntimeException("Produto inexistente"+ id);


            }

            Produtos products = result.get();

            return new ProdutosDTO(products.getId(), products.getNome());

        }

    //buscar todos os produtos




    public List<ProdutosDTO> findAll() {

        List<Produtos> produt = productRepository.findAll();
        List<ProdutosDTO> pdto = new ArrayList<>();


        for (Produtos produto : produt) {
            ProdutosDTO produtDTO = new ProdutosDTO(produto.getId(), produto.getNome()  );
            pdto.add(produtDTO);
        }
        return pdto;
    }


}
