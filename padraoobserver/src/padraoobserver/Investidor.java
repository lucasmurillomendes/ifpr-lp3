/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author lucas
 */
public class Investidor implements Observer{

    private String nome;
    private Double oferta;

    public Investidor(String nome, Double oferta) {
        this.nome = nome;
        this.oferta = oferta;
    }
    
    public void comprarAcao(Acao acao){
        System.out.println("Investidor " + nome + " comprou a ação: " 
                + acao.getSimbolo() + " por " + acao.getValor());
        acao.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object o1) {
        Acao acao = (Acao) o;
        if (acao.getValor().compareTo(oferta) <= 0) {
            comprarAcao(acao);
        }else{
            System.out.println("Investidor " + nome + " Aguardando");
        }
    }

    
}
