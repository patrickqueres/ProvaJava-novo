/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Costura;
import model.Peca;

/**
 *
 * @author patri
 */
public class daoPeca {
    
    private static List<Peca> pecas = new ArrayList();

    public static void adicionar(Peca peca) {
        pecas.add(peca);
    }

    public static void remover(Peca peca) {
        pecas.remove(peca);
    }

    public static List<Peca> getPecas() {
        return pecas;
    }
    
    
    
    
}
