package com.senai.infoa.rental_eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.rental_eventos.models.Movimentacao;
import com.senai.infoa.rental_eventos.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {
    
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public Long contarMovimentacoes(){
        return movimentacaoRepository.count();
    }

    public Movimentacao buscarMovimentacao(Integer id){
        return movimentacaoRepository.findById(id).get();
    }

    public List<Movimentacao> listarMovimentacoes(){
        return movimentacaoRepository.findAll();
    }

    public Boolean deletarMovimentacoes(Integer id){
        if(movimentacaoRepository.existsById(id)) {
            return true;
        }
        return false;
    }

    public Movimentacao cadastrarMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao atualizarMovimentacao(Integer id, Movimentacao movimentacao){
        Movimentacao movimentacaoRecuperada = buscarMovimentacao(id);
        if(movimentacaoRecuperada != null){
            movimentacaoRecuperada.setId(id);
            if(movimentacao.getDataMovimentacao()!= null) {
                movimentacaoRecuperada.setDataMovimentacao(movimentacao.getDataMovimentacao());
            }
            movimentacaoRecuperada.setQuantidade(movimentacao.getQuantidade());
            return movimentacaoRepository.save(movimentacaoRecuperada);
        }
        return null;
    }
}
