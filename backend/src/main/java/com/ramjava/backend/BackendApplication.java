package com.ramjava.backend;

import com.ramjava.backend.entity.Funcionario;
import com.ramjava.backend.repository.RepositorioDeFuncionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Autowired
	private RepositorioDeFuncionarios repositorioDeFuncionarios;
	@Override
	public void run(String... args) throws Exception {
		Funcionario funcionario1 = Funcionario.builder()
				.primeiroNome("Siber")
				.sobrenome("Saint")
				.email("siber@yahoo.com")
				.build();
		Funcionario funcionario2 = Funcionario.builder()
				.primeiroNome("Doray")
				.sobrenome("Saint")
				.email("doray@yahoo.com")
				.build();
		Funcionario funcionario3 = Funcionario.builder()
				.primeiroNome("Mowkree")
				.sobrenome("Saint")
				.email("mowkree@yahoo.com")
				.build();
		repositorioDeFuncionarios.save(funcionario1);
		repositorioDeFuncionarios.save(funcionario2);
		repositorioDeFuncionarios.save(funcionario3);
	}
}
