/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Manutencao;

/**
 *
 * @author aluno
 */
public class daoManutencao {
    
    private static List<Manutencao> manutencoes = new ArrayList();

    public static void adicionar(Manutencao manutencao) {
        manutencoes.add(manutencao);
    }

    public static void remover(Manutencao manutencao) {
        manutencoes.remove(manutencao);
    }

    public static List<Manutencao> getManutencoes() {
        return manutencoes;
    }
    
    
    
}
