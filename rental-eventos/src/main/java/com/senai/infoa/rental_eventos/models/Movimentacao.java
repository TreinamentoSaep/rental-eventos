package com.senai.infoa.rental_eventos.models;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="movimentacao")
public class Movimentacao {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="data_movimentacao")
    private LocalDate dataMovimentacao;

    @Column(name="tipo_movimentacao")
    private String tipoMovimentacao;

    @Column(name="quantidade")
    private int quantidade;

    @Column(name="observacao")
    private String observacao;

    @ManyToMany
    @JoinTable(
        name = "movimentacao_equipamento",
        joinColumns = @JoinColumn(name = "movimentacao_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "equipamento_id", referencedColumnName = "id")
    )
    private Set<Equipamento> equipamento;

    public Movimentacao (){}

    public Movimentacao(Integer id, LocalDate dataMovimentacao, String tipoMovimentacao, int quantidade,
            String observacao) {
        this.id = id;
        this.dataMovimentacao = dataMovimentacao;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }







}
