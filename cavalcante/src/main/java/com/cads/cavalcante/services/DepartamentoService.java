package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.DepartamentoDTO;
import com.cads.cavalcante.entities.Departamento;
import com.cads.cavalcante.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
// busca de departamento por id

public DepartamentoDTO findByid(Long id){

    Optional<Departamento> result = departRepository.findById(id);

    if(result.isEmpty()){

        throw new RuntimeException("Departamento não localizado" + id);



    }


    Departamento depart = result.get();

    return new DepartamentoDTO(depart.getSetor(), depart.getUnidade());

}



// buscar todos os departamentos


    public List<DepartamentoDTO> findAll(){

        List<Departamento> departs = departRepository.findAll();
        List<DepartamentoDTO> deparDTO= new ArrayList<>();


        for(Departamento depart: departs){

            DepartamentoDTO departDTO = new DepartamentoDTO (depart.getSetor(), depart.getUnidade());

            deparDTO.add(departDTO);

        }
return deparDTO;




    }

}
