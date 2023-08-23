package com.poo.poo.classes;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int  datanasc;
    private int matricula;

    public static int contador = 100;

    public Aluno () {
        System.out.println("Escreva o nome do aluno:");
        Scanner sc = new Scanner(System.in);
        this.setAluno(sc.nextLine());
        System.out.println("Escreva sua data de nascimento: ");
        this.setDatanasc(sc.nextInt());
        this.setMatricula(contador);
        contador++;
        
    }
    
    public String getNome() {
        return  nome;
    }
    public void setAluno(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getDatanasc() {
        return datanasc;
    }
    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

}

