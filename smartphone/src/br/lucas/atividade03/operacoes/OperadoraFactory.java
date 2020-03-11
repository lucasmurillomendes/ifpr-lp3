/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lucas.atividade03.operacoes;

import br.lucas.atividade03.Operadora;

/**
 *
 * @author lucas
 */
public class OperadoraFactory {
    
    private static OperadoraFactory factory;

    private OperadoraFactory() {
    
    }
   
    public Operacao getOperacao(Operadora operadora) {

        switch (operadora) {
            case OI:
                return new OperacaoOi();
            case VIVO:
                return new OperacaoVivo();
            case CLARO:
                return new OperacaoClaro();
            case TIM:
                return new OperacaoTim();
            default:
                System.out.println("Nada relacionado foi passado!");
                return null;
        }
    }
    
    public static OperadoraFactory getInstance(){
        if (factory == null) {
            return factory = new OperadoraFactory();
        }
        return factory;
    }
    
    
}
