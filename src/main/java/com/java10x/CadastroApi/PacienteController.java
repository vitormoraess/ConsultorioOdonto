package com.java10x.CadastroApi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PacienteController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";



    }



}
