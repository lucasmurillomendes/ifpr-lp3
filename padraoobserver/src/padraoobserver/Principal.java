/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Principal {
    public static void main(String[] args) {
        Acao acao = new Acao(Simbolo.PETR4, 21.0);
       
        Investidor investidor = new Investidor("Lucas", 19.0);
        Investidor investidor2 = new Investidor("Mario", 17.30);
        
        acao.addObserver(investidor);
        acao.addObserver(investidor2);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ação -> " + acao.getSimbolo() + " Valor: " + acao.getValor());
            Random random = new Random(-10);
            Double variacao = random.nextGaussian();
            
            Double atual = acao.getValor();
            acao.setValor(atual + variacao);
        }
    }
}
