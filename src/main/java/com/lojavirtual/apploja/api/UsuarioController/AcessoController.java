package com.lojavirtual.apploja.api.UsuarioController;

import com.lojavirtual.apploja.domain.model.Acesso;
import com.lojavirtual.apploja.domain.services.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/V1/lojavirtual")
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @PostMapping("/acesso")
    public ResponseEntity<Acesso> salvarAcesso(@RequestParam Acesso acesso){

        var acessoNovo = acessoService.salvar(acesso);

        return new ResponseEntity<Acesso>(acessoNovo, HttpStatus.CREATED);
    }
}
