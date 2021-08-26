package com.dio.projectAPI.Service;

import com.dio.projectAPI.Repository.BancoHorasRepository;
import com.dio.projectAPI.model.BancoHoras;
import com.dio.projectAPI.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;
    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }
    public BancoHoras saveJornada(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll(){
        return bancoHorasRepository.findAll();
    }
    public Optional<BancoHoras> findById(long id){
        return bancoHorasRepository.findById(id);
    }
    public void delId(long id){
        bancoHorasRepository.deleteById(id);
    }
    public BancoHoras update(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }
}
