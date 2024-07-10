package com.lojavirtual.apploja.domain.services;

import com.lojavirtual.apploja.domain.model.Acesso;
import com.lojavirtual.apploja.domain.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso salvar(Acesso acesso){
        return acessoRepository.save(acesso);
    }
}
