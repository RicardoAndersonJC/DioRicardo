package com.dio.projectAPI.Service;

import com.dio.projectAPI.Repository.CalendarioRepository;
import com.dio.projectAPI.model.Calendario;
import com.dio.projectAPI.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    @Autowired
    CalendarioRepository calendarioRepository;


    public Calendario saveCalendario(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAll(){
        return calendarioRepository.findAll();
    }
    public Optional<Calendario> findById(long id){
        return calendarioRepository.findById(id);
    }
    public void delId(long id){
        calendarioRepository.deleteById(id);
    }
    public Calendario updateJornada(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }
}
