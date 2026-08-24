package com.senai.infoa.rental_eventos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipamento")
public class Equipamento {
    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="marca")
    private String marca;

    @Column(name="modelo")
    private String modelo;

    @Column(name="categoria")
    private String categoria;

    @Column(name="material")
    private String material;

    @Column(name="peso")
    private int peso;

    @Column(name="cor")
    private String cor;

    @Column(name="quantidade_disponivel")
    private int quantidadeDisponivel;

    @Column(name="quantidade_minima")
    private int quantidadeMinima;

    public Equipamento (){}

    public Equipamento(Integer id, String marca, String modelo, String categoria, String material, int peso, String cor,
            int quantidadeDisponivel, int quantidadeMinima) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.material = material;
        this.peso = peso;
        this.cor = cor;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.quantidadeMinima = quantidadeMinima;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    
    
}
