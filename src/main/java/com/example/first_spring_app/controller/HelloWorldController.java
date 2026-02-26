package com.example.first_spring_app.controller;

import com.example.first_spring_app.domain.User;
import com.example.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// STATEFULL - O servidor armazena dados da sessão do cliente, como status de login, itens do carrinho de compras ou progresso de uma transação bancária, na sua memória ou banco de dados local entre requisições.
// STATELESS - O servidor não retém nenhuma informação sobre interações anteriores com o cliente. Cada requisição é independente e deve conter todos os dados necessários (como credenciais ou tokens de autenticação) para ser processada.


@RestController
  // @Controller
  // @ResponseBody
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head

    @Autowired
    private HelloWorldService helloWorldService;

    // GET /hello-world
    @GetMapping()
    public String helloWorld() {
        return helloWorldService.helloWorld("Samuel");
    }

    @PostMapping("/{id}")
    public String gelloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "none") String filter, @RequestBody User body) {
        return "Hello, " + body.getName() + "! \nSeu email é: " + body.getEmail() + "\nSeu ID é: " + id + "\nFiltro: " + filter;
    }

}
