package com.ramjava.backend.controller;

import com.ramjava.backend.entity.Funcionario;
import com.ramjava.backend.repository.RepositorioDeFuncionarios;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081")
public class ControladorDeFuncionarios {
    private RepositorioDeFuncionarios repositorioDeFuncionarios;
    public ControladorDeFuncionarios(RepositorioDeFuncionarios repositorioDeFuncionarios) {
        this.repositorioDeFuncionarios = repositorioDeFuncionarios;
    }
    @GetMapping("/funcionario")
    public List<Funcionario> fetchFuncionarios() {
        return repositorioDeFuncionarios.findAll();
    }
}
