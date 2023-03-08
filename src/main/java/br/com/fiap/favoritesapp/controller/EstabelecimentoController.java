package br.com.fiap.favoritesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstabelecimentoController {

    @GetMapping("api/estabelecimentos")
    public String estabelecimento(){
        return "Estabelecimento";
    }
}
