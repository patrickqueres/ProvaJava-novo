/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author patri
 */
public class Producao {
    
    private Boolean disponibilidade;
    private String costureiras;
    private String pecas;
    private String maquina;
    
    private Calendar data;
    private Calendar datafim;
    private Float preco;

    public Producao(String maquina, String costureiras, String pecas) {
        this.maquina = maquina;
        this.costureiras = costureiras;
        this.pecas = pecas;
                
        data = Calendar.getInstance();
        
        datafim = Calendar.getInstance();
        datafim.add(Calendar.DAY_OF_MONTH, 15);
        
    }

 
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getCostureiras() {
        return costureiras;
    }

    public void setCostureiras(String costureiras) {
        this.costureiras = costureiras;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getDatafim() {
        return datafim;
    }

    public void setDatafim(Calendar datafim) {
        this.datafim = datafim;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    
    
   

    @Override
    public String toString() {
         return this.pecas + " (" + this.costureiras + ")";
    }
    
}
