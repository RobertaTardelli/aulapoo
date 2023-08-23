package com.poo.poo.classes;

import java.util.Scanner;

public class Conta {
    private String titular;
    private int numeroDaConta;
    private String senha;
    public static int contador = 1000;

    public Conta (String nome) {
        System.out.println("Escreva o nome do titular: ");
        Scanner sc = new Scanner(System.in);
        this.setTitular(sc.nextLine());
        this.setNumeroDaConta(contador);
        contador++;

        this.senha = geraSenhaAleatoria();
        // Envia um email com uma senha padrao
    }
    public Conta(){
        
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static String geraSenhaAleatoria () {
        String senhaAleatoria = "12345";
        return senhaAleatoria;
    }

}
