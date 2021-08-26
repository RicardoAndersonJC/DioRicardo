package com.dio.projectAPI.Service;

import com.dio.projectAPI.Repository.EmpresaRepository;

import com.dio.projectAPI.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;


    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }
    public Optional<Empresa> findById(long id){
        return empresaRepository.findById(id);
    }
    public void delId(long id){
        empresaRepository.deleteById(id);
    }
    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}
