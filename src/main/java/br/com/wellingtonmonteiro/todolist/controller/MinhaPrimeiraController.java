package br.com.wellingtonmonteiro.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Camada entre a lógica e a view
// @Controller // Utiliza quando é criado uma estrutura com páginas, retorno de template, ou seja, flexibilidade maior de retorno
@RestController // Retorno de API Rest
@RequestMapping("/primeiraRota") // Responsável por informa ou estruturar a rota
public class MinhaPrimeiraController {
    /**
     * Métodos de acesso do HTTP
     * GET - Buscar uma informção
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     **/

    //Método (Funcionalidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
