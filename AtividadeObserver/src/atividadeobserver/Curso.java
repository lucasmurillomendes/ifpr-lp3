/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeobserver;

/**
 *
 * @author lucas
 */
public class Curso {
    
    private String nome;
    private Professor professor;

    public Curso(String texto, Professor professor) {
        this.nome = texto;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
