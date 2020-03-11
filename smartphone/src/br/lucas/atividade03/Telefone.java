/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lucas.atividade03;

import br.lucas.atividade03.operacoes.Operacao;
import br.lucas.atividade03.operacoes.OperadoraFactory;

/**
 *
 * @author lucas
 */
public class Telefone {
    private final Contato contato;
    private final OperadoraFactory factory = OperadoraFactory.getInstance();

    public Telefone(Contato contato) {
        this.contato = contato;
    }
    
    public void ligar(){
        System.out.println("Contato " + contato.getNome() + " ligando");
        Operacao operadora = factory.getOperacao(contato.getOperadora());
        operadora.ligar(contato.getNumero());
    }
    public void enviarMensagem(){
        System.out.println("Contato " + contato.getNome() + " mensagem");
        Operacao operadora = factory.getOperacao(contato.getOperadora());
        operadora.enviarMensagem(contato.getNumero());
    }
}
