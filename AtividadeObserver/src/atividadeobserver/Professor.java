/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

import java.util.Date;
import java.util.Observable;

/**
 *
 * @author lucas
 */
public class Professor extends Observable {

    private String nome;
    private Date dataProva;

    public Professor(String texto, Date dataProva) {
        this.nome = texto;
        this.dataProva = dataProva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String texto) {
        this.nome = texto;
    }

    public Date getDataProva() {
        return dataProva;
    }

    public void setDataProva(Date dataProva) {
        this.dataProva = dataProva;
        setChanged();
        notifyObservers();
    }

}
