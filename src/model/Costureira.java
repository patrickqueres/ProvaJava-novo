/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author patri
 */
public class Costureira extends Funcionario{
    private Double salario;
    private Boolean disponibilidade;
    private List<Supervisor> supervisor;
    private List<Costura> costura;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<Supervisor> getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(List<Supervisor> supervisor) {
        this.supervisor = supervisor;
    }

    public List<Costura> getCostura() {
        return costura;
    }

    public void setCostura(List<Costura> costura) {
        this.costura = costura;
    }
    
    
          
    
     public Costureira(String matricula, String nome, Double salario) {
        super(nome, matricula);
        this.salario = salario;
    }


     
     
     
   
   @Override
    public String toString() {
        return this.nome + " (" + this.matricula + ")";
    }
    
    
}
