/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lucas.atividade03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class BancoContatos {

    private static BancoContatos bancoContatos;
    private List<Contato> contatos;

    private BancoContatos() {
        this.contatos = new ArrayList<>();
    }

    public static BancoContatos getInstance() {
        if (bancoContatos == null) {
            return bancoContatos = new BancoContatos();
        }
        return bancoContatos;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarContato(String nome) {      
        return contatos.stream()
                .filter(contato -> contato.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

}
