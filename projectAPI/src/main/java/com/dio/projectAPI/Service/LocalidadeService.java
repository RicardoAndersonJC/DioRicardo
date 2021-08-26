package com.dio.projectAPI.Service;


import com.dio.projectAPI.Repository.LocalidadeRepository;
import com.dio.projectAPI.model.Localidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    @Autowired
    LocalidadeRepository localidadeRepository;


    public Localidade saveLocalidade(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }
    public Optional<Localidade> findById(long id){
        return localidadeRepository.findById(id);
    }
    public void delId(long id){
        localidadeRepository.deleteById(id);
    }
    public Localidade updateLocalidade(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }
}
