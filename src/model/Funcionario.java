/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author patri
 */
public abstract class Funcionario {
    String nome;
    String matricula;
    private Double salariominimo;
    
      public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
      
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalariominimo() {
        return salariominimo;
    }

    public void setSalariominimo(Double salariominimo) {
        this.salariominimo = salariominimo;
    }
    
    
    
}
