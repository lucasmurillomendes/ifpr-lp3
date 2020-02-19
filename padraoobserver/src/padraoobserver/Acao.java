/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Observable;

/**
 *
 * @author lucas
 */
public class Acao extends Observable{
    
    private Simbolo simbolo;
    private Double valor;

    public Acao(Simbolo simbolo, Double valor) {
        this.simbolo = simbolo;
        this.valor = valor;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
        setChanged();
        notifyObservers();
    }
    
    
}
