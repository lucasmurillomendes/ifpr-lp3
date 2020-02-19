/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author lucas
 */
public class Aluno implements Observer {

    private String nome;
    private Curso curso;

    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void registrarCurso(Curso curso) {
        curso = this.curso;
    }

    @Override
    public void update(Observable o, Object o1) {
        Professor p = (Professor) o;
        if (p.getDataProva() != null && curso != null) {
            registrarCurso(curso);
            System.out.println("Aluno " + nome + " prova: " + p.getDataProva());
        }

    }
}
