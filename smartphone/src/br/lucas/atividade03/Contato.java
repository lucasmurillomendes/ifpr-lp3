/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lucas.atividade03;

import java.util.Objects;

/**
 *
 * @author lucas
 */
public class Contato {

    private String nome;
    private String numero;
    private Operadora operadora;

    public Contato(String nome, String numero, Operadora operadora) {
        this.nome = nome;
        this.numero = numero;
        this.operadora = operadora;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.operadora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (this.operadora != other.operadora) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + ", operadora=" + operadora + '}';
    }    
}
