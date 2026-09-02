package com.senai.infoa.rental_eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.rental_eventos.models.Equipamento;
import com.senai.infoa.rental_eventos.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public Long contarEquipamentos() {
        return equipamentoRepository.count();
    }

    public Equipamento buscarEquipamento(Integer id) {
        return equipamentoRepository.findById(id).get();
    }

    public List<Equipamento> listarEquipamentos() {
        return equipamentoRepository.findAll();
    }

    public Boolean deletarEquipamentos(Integer id) {
        if (equipamentoRepository.existsById(id)) {
            equipamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Equipamento cadastrarEquipamento(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento atualizarEquipamento(Integer id, Equipamento equipamento) {
        Equipamento equipamentoRecuperado = buscarEquipamento(id);
        if (equipamentoRecuperado != null) {
            equipamentoRecuperado.setId(id);
            if (equipamento.getMarca() != null) {
                equipamentoRecuperado.setMarca(equipamento.getMarca());
            }
            if (equipamento.getModelo() != null) {
                equipamentoRecuperado.setModelo(equipamento.getModelo());
            }
            if (equipamento.getCategoria() != null) {
                equipamentoRecuperado.setCategoria(equipamento.getCategoria());
            }
            if (equipamento.getMaterial() != null) {
                equipamentoRecuperado.setMaterial(equipamento.getMaterial());
            }
            if (equipamento.getPeso() != null) {
                equipamentoRecuperado.setPeso(equipamento.getPeso());
            }
            if (equipamento.getCor() != null) {
                equipamentoRecuperado.setCor(equipamento.getCor());
            }
            if (equipamento.getQuantidadeMinima() != null) {
                equipamentoRecuperado.setQuantidadeMinima(equipamento.getQuantidadeMinima());
            }
            if (equipamento.getQuantidadeDisponivel() != null) {
                equipamentoRecuperado.setQuantidadeDisponivel(equipamento.getQuantidadeDisponivel());
            }
            return equipamentoRepository.save(equipamentoRecuperado);
        }
        return null;
    }
}
