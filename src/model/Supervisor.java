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
public class Supervisor extends Funcionario {
    
    private Double salario;
    
    public Supervisor(String matricula, String nome) {
         super(nome, matricula);
         
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.nome + " (" + this.matricula + ")";
    }
   
    
    
   
}
