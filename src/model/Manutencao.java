/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author patri
 */
public class Manutencao {
    private String maquina;
    private String supervisor;
    private Calendar data;
    private Calendar datainicio;
    private Calendar datafim;

    public Manutencao(String maquina, String supervisor) {
        this.maquina = maquina;
        this.supervisor = supervisor;
                
        data = Calendar.getInstance();
        
        datafim = Calendar.getInstance();
        datafim.add(Calendar.DAY_OF_MONTH, 15);
        
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Calendar datainicio) {
        this.datainicio = datainicio;
    }

    public Calendar getDatafim() {
        return datafim;
    }

    public void setDatafim(Calendar datafim) {
        this.datafim = datafim;
    }

    

    @Override
    public String toString() {
        return this.maquina;
    }
    
        
}
