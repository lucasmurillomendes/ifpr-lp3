/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.view.matricula.form;

import br.com.mario.model.Aluno;
import br.com.mario.model.Matricula;
import br.com.mario.model.Turma;
import br.com.mario.util.GenericComboBoxModel;
import static br.com.mario.util.Util.convertToString;
import java.sql.Date;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author mario
 */
public class MatriculaFormView extends javax.swing.JDialog {

    private final MatriculaFormController controller;
    private final MaskFormatter mfDataMatricula;
    private final GenericComboBoxModel<Turma> turmaModel;
    private final GenericComboBoxModel<Aluno> alunoModel;

    /**
     * Creates new form EstadoFormView1
     *
     * @param parent
     * @param modal
     * @param matricula
     * @throws java.text.ParseException
     */
    public MatriculaFormView(java.awt.Frame parent, boolean modal, Matricula matricula) throws ParseException {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cadastro de Matricula");

        mfDataMatricula = new MaskFormatter("##/##/####");
        mfDataMatricula.setPlaceholderCharacter('_');
        mfDataMatricula.install(tfDataMatricula);
        tfDataMatricula.setText(convertToString(new Date(new java.util.Date().getTime())));

        controller = new MatriculaFormController(this);

        turmaModel = new GenericComboBoxModel<>();
        cbTurma.setModel(turmaModel);
        controller.loadTurmas();

        alunoModel = new GenericComboBoxModel<>();
        cbAluno.setModel(alunoModel);
        controller.loadAlunos();

        if (matricula != null) {
            controller.edit(matricula);
        }

    }

    public boolean openDialog() {
        this.setVisible(true);
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        cbTurma = new javax.swing.JComboBox();
        tfDataMatricula = new javax.swing.JFormattedTextField();
        cbAluno = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(0, 153, 51));
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        cbTurma.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));

        tfDataMatricula.setBackground(new java.awt.Color(214, 217, 223));
        tfDataMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Matricula"));
        tfDataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        cbAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("Aluno"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 504, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (controller.merge()) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Esse aluno já está matriculado \n nesta turma!");
        }

    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAluno;
    private javax.swing.JComboBox cbTurma;
    private javax.swing.JFormattedTextField tfDataMatricula;
    // End of variables declaration//GEN-END:variables

    public GenericComboBoxModel<Turma> getTurmaModel() {
        return turmaModel;
    }

    public GenericComboBoxModel<Aluno> getAlunoModel() {
        return alunoModel;
    }

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public JButton getBtSalvar() {
        return btSalvar;
    }

    public JFormattedTextField getTfDataMatricula() {
        return tfDataMatricula;
    }

}
