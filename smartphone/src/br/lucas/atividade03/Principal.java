/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lucas.atividade03;

/**
 *
 * @author lucas
 */
public class Principal {
    public static void main(String[] args) {
        
        Contato c1 = new Contato("Lucas", "(44) 9 88461691", Operadora.CLARO);
        Contato c2 = new Contato("Mario", "(44) 9 91653245", Operadora.VIVO);
        Contato c3 = new Contato("Junior", "(44) 9 99856325", Operadora.TIM);
        
        BancoContatos bc = BancoContatos.getInstance();
        bc.adicionarContato(c1);
        bc.adicionarContato(c2);
        bc.adicionarContato(c3);
        
        System.out.println(bc.buscarContato("pedro"));
        
        Telefone t = new Telefone(c3);
        t.enviarMensagem();
        t.ligar();
    }
}
