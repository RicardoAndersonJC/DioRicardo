package com.dio.projectAPI.Service;

import com.dio.projectAPI.Repository.JornadaRepository;
import com.dio.projectAPI.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }
    public Optional<JornadaTrabalho> findById(long id){
        return jornadaRepository.findById(id);
    }
    public void delId(long id){
        jornadaRepository.deleteById(id);
    }
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }
}
