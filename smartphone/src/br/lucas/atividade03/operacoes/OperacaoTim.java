/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lucas.atividade03.operacoes;

/**
 *
 * @author lucas
 */
public class OperacaoTim implements Operacao{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando Tim, numero:" + numero);
    }

    @Override
    public void enviarMensagem(String numero) {
        System.out.println("Mensagem Tim, numero:" + numero);
    }
    
}
