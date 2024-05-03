package com.ramjava.backend.repository;

import com.ramjava.backend.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDeFuncionarios extends JpaRepository<Funcionario, Long> {
}
