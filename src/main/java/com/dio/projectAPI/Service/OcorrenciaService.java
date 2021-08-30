package com.dio.projectAPI.Service;


import com.dio.projectAPI.Repository.OcorrenciaRepository;
import com.dio.projectAPI.model.JornadaTrabalho;
import com.dio.projectAPI.model.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAll(){
        return ocorrenciaRepository.findAll();
    }
    public Optional<Ocorrencia> findById(long id){
        return ocorrenciaRepository.findById(id);
    }
    public void delId(long id){
        ocorrenciaRepository.deleteById(id);
    }
    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }
}
