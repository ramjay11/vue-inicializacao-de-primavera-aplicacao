package com.ramjava.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "primeiro_nome", nullable = false)
    private String primeiroNome;
    @Column(name = "sobrenome")
    private String sobrenome;
    @Column(name = "email")
    private String email;

}

// Convert it to Record
//public record Funcionario(long id, String primeiroNome, String sobrenome, String email) {}