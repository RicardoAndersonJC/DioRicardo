package com.dio.projectAPI.Service;


import com.dio.projectAPI.Repository.MovimentacaoRepository;
import com.dio.projectAPI.model.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    MovimentacaoRepository movimentacaoRepository;


    public Movimentacao saveMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }
    public Optional<Movimentacao> findById(long id){
        return movimentacaoRepository.findById(id);
    }
    public void delId(long id){
        movimentacaoRepository.deleteById(id);
    }
    public Movimentacao updateMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }
}
