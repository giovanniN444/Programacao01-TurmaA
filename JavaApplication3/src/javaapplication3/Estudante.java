/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Date;

/**
 *
 * @author aluno
 */


    /**
     * @param args the command line arguments
     */
    public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;

    public Estudante() {
        this.nome = "Nobody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;

        //logica para calcular idade
        return idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String _nome){
        this.nome = _nome;
    }
    }