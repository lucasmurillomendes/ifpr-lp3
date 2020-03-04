/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Principal {

    public static void main(String[] args) {

        Professor p1 = new Professor("Joao", new Date());
        Professor p2 = new Professor("Pedro", new Date());

        Curso curso = new Curso("ADS", p1);
        Curso curso2 = new Curso("Biológicas", p2);

        Aluno a1 = new Aluno("Lucas", curso);
        Aluno a2 = new Aluno("João", curso2);
        Aluno a3 = new Aluno("Paulo", null);

        p1.addObserver(a1);
        p1.addObserver(a2);
        p1.addObserver(a3);

        p1.setDataProva(new Date());
        p2.setDataProva(new Date());

    }
}
