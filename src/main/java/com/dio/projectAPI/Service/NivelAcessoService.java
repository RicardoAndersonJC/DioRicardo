package com.dio.projectAPI.Service;


import com.dio.projectAPI.Repository.NivelAcessoRepository;
import com.dio.projectAPI.model.NivelAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcesso saveNivel(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }
    public List<NivelAcesso> findAll(){
        return nivelAcessoRepository.findAll();
    }
    public Optional<NivelAcesso> findById(long id){
        return nivelAcessoRepository.findById(id);
    }
    public void delId(long id){
        nivelAcessoRepository.deleteById(id);
    }
    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }
}
