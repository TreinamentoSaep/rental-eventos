package com.senai.infoa.rental_eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.rental_eventos.models.Movimentacao;


@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{
    
}
