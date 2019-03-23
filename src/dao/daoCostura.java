/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Costura;

/**
 *
 * @author patri
 */
public class daoCostura {
    
    private static List<Costura> costuras = new ArrayList();

    public static void adicionar(Costura costura) {
        costuras.add(costura);
    }

    public static void remover(Costura costura) {
        costuras.remove(costura);
    }

    public static List<Costura> getCosturas() {
        return costuras;
    }
    
    
}
