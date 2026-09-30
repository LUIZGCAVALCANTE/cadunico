package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.DepartamentoDTO;
import com.cads.cavalcante.entities.Departamento;
import com.cads.cavalcante.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService  {

    @Autowired
private DepartamentoRepository departRepository;

//criar departamento
public DepartamentoDTO insert(DepartamentoDTO departamentoDTO){

    Departamento depart = new Departamento ();

    depart.setSetor(departamentoDTO.getSetor());
    depart.setUnidade(departamentoDTO.getUnidade());

    depart = departRepository.save(depart);

    return new DepartamentoDTO(depart.getSetor(), depart.getUnidade());

}

// atualizar departamento

    public DepartamentoDTO update(DepartamentoDTO departDTO, Long id){

        Departamento depart = departRepository.getReferenceById(id);

        depart.setSetor(departDTO.getSetor());
        depart.setUnidade(departDTO.getUnidade());


        return new DepartamentoDTO(depart.getSetor(), depart.getUnidade());


    }

//deletar usuario

    public void delete(Long id){


    departRepository.deleteById(id);

    }




    
}
