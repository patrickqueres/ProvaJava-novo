/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ManipulaColecao;
import java.util.List;

/**
 *
 * @author patri
 */
public class Maquina implements ManipulaColecao{
    private String codigo;
    private String localizacao;
    private Boolean disponibilidade;
    private List<Fabricante> fabricantes;
    private List<Costura> costuras;

    public Maquina(String codigo, String localizacao) {
        this.codigo = codigo;
        this.localizacao = localizacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(List<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public List<Costura> getCosturas() {
        return costuras;
    }

    public void setCosturas(List<Costura> costuras) {
        this.costuras = costuras;
    }

    @Override
    public void adicionar(Object objeto) {
        fabricantes.add((Fabricante) objeto);
    }

    @Override
    public void remover(Object objeto) {
        fabricantes.remove((Fabricante) objeto);
    }

    @Override
    public String toString() {
        return this.codigo + " (" + this.localizacao + ")";
    }
    
    
}
