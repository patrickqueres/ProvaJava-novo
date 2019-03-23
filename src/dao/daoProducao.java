/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Producao;

/**
 *
 * @author Silvana
 */
public class daoProducao {
    
    private static List<Producao> producoes = new ArrayList();

    public static void adicionar(Producao producao) {
        producoes.add(producao);
    }

    public static void remover(Producao producao) {
        producoes.remove(producao);
    }

    public static List<Producao> getProducoes() {
        return producoes;
    }
    
}
