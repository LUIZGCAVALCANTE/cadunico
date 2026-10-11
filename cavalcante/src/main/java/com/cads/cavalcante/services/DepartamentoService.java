package com.cads.cavalcante.services;

import com.cads.cavalcante.DTO.DepartamentoDTO;
import com.cads.cavalcante.DTO.UsuarioDTO;
import com.cads.cavalcante.entities.Departamento;
import com.cads.cavalcante.entities.Usuario;
import com.cads.cavalcante.repositories.DepartamentoRepository;
import com.cads.cavalcante.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService  {

    @Autowired
private DepartamentoRepository departRepository;



    @Autowired
    private UsuarioRepository userRepository;

//criar departamento
public DepartamentoDTO insert(DepartamentoDTO departamentoDTO){

    Departamento depart = new Departamento ();

    depart.setSetor(departamentoDTO.getSetor());
    depart.setUnidade(departamentoDTO.getUnidade());

    depart = departRepository.save(depart);

    return new DepartamentoDTO(depart.getSetor(), depart.getUnidade(), depart.getId());

}

// atualizar departamento

    public DepartamentoDTO update(DepartamentoDTO departDTO, Long id){

        Departamento depart = departRepository.getReferenceById(id);

        depart.setSetor(departDTO.getSetor());
        depart.setUnidade(departDTO.getUnidade());


        return new DepartamentoDTO(depart.getSetor(), depart.getUnidade(), depart.getId());


    }

//deletar departamento

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

    return new DepartamentoDTO(depart.getSetor(), depart.getUnidade(), depart.getId());

}



// buscar todos os departamentos


    public List<DepartamentoDTO> findAll(){

        List<Departamento> departs = departRepository.findAll();
        List<DepartamentoDTO> deparDTO= new ArrayList<>();


        for(Departamento depart: departs){

            DepartamentoDTO departDTO = new DepartamentoDTO (depart.getSetor(), depart.getUnidade(), depart.getId());

            deparDTO.add(departDTO);

        }
return deparDTO;




    }
    public Departamento findBySetorAndUnidade(String setor, String unidade) {


    return departRepository.findBySetorAndUnidade(setor, unidade).orElseThrow(()->
                new RuntimeException ("departamento inexistente"));

    }
    //depart&funcionarios

    public List<DepartamentoDTO> findALL() {

        List<Departamento> departs = departRepository.findAll();
        List<DepartamentoDTO> deptDTO = new ArrayList<>();




        for (Departamento depart : departs) {
            DepartamentoDTO departDTO = new DepartamentoDTO(depart.getSetor(),
                    depart.getUnidade(), depart.getId());
            deptDTO.add(departDTO);
        }
        return deptDTO;

    }


    public Departamento findByNome(String setor, String unidade) {



        System.out.println("Setor recebido: [" + setor + "]");
        System.out.println("Unidade recebida: [" + unidade + "]");
        return departRepository.findBySetorAndUnidade(setor, unidade)
                .orElseThrow(() ->
                        new RuntimeException("Departamento inexistente")
                );
    }



}

