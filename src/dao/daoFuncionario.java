/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Costureira;
import model.Funcionario;
import model.Supervisor;

/**
 *
 * @author patri
 */
public class daoFuncionario {
    
    private static List<Funcionario> funcionarios = new ArrayList();
    private static List<Costureira> costureiras = new ArrayList();
    private static List<Supervisor> supervisores = new ArrayList();

   public static void adicionar(Supervisor supervisor) {
        supervisores.add(supervisor);
        funcionarios.add(supervisor);
    }

    public static void adicionar(Costureira costureira) {
        costureiras.add(costureira);
        funcionarios.add(costureira);
    }

    public static void remover(Supervisor supervisor) {
        supervisores.remove(supervisor);
        funcionarios.remove(supervisor);
    }

    public static void remover(Costureira costureira) {
        costureiras.remove(costureira);
        funcionarios.remove(costureira);
    }

    public static List<Costureira> getCostureiras() {
        return costureiras;
    }

    public static List<Supervisor> getSupervisores() {
        return supervisores;
    }

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

}    

