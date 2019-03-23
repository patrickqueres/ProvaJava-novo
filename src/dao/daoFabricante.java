/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Fabricante;


/**
 *w
 * @author patri
 */
public class daoFabricante {
    
    private static List<Fabricante> fabricantes = new ArrayList();

    public static void adicionar(Fabricante fabricante) {
        fabricantes.add(fabricante);
    }

    public static void remover(Fabricante fabricante) {
        fabricantes.remove(fabricante);
    }

    public static List<Fabricante> getFabricantes() {
        return fabricantes;
    }
    
}
