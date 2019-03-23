/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import dao.ManipulaColecao;

/**
 *
 * @author patri
 */
public class Peca{
    private String nome;
    private List<Costura> costuras;

    public Peca(String nome) {
        this.nome = nome;
       
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Costura> getCosturas() {
        return costuras;
    }

    public void setCosturas(List<Costura> costuras) {
        this.costuras = costuras;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
}

    