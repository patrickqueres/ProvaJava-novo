/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Maquina;
import model.Fabricante;
import model.Costura;

/**
 *
 * @author patri
 */
public class daoMaquina {
    
    private static List<Maquina> maquinas = new ArrayList();

    public static void adicionar(Maquina maquina) {
        maquinas.add(maquina);
    }

    public static void remover(Maquina maquina) {
        maquinas.remove(maquina);
    }

    public static List<Maquina> getMaquinas() {
        return maquinas;
    }
    
}
