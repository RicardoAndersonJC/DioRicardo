package com.dio.projectAPI.Service;


import com.dio.projectAPI.Repository.TipoDataRepository;
import com.dio.projectAPI.model.JornadaTrabalho;
import com.dio.projectAPI.model.TipoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    @Autowired
    TipoDataRepository tipoDataRepository;


    public TipoData saveTipoData(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll(){
        return tipoDataRepository.findAll();
    }
    public Optional<TipoData> findById(long id){
        return tipoDataRepository.findById(id);
    }
    public void delId(long id){
        tipoDataRepository.deleteById(id);
    }
    public TipoData updateTipoData(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }
}
