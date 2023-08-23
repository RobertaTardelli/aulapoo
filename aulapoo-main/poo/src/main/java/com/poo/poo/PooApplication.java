package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Aluno;
import com.poo.poo.classes.Conta;
import com.poo.poo.classes.Veiculo;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		Aluno aluno1 = new Aluno();

		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getDatanasc());
		System.out.println(aluno1.getMatricula());

		Aluno aluno2 = new Aluno();

		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getDatanasc());
		System.out.println(aluno2.getMatricula());
		

	}
}
