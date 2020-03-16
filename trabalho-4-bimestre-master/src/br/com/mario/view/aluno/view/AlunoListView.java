 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.view.aluno.view;

import br.com.mario.model.Aluno;
import br.com.mario.util.CellButtonRender;
import br.com.mario.util.tablemodel.AlunoTableModel;
import br.com.mario.view.aluno.form.AlunoFormView;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author mario
 */


public class AlunoListView extends javax.swing.JFrame {

    private final AlunoListController controller;
    private final AlunoTableModel alunoTableModel;

    /**
     * Creates new form EstadoView
     */
    public AlunoListView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Lista de Alunos");

        controller = new AlunoListController(this);

        alunoTableModel = new AlunoTableModel(new ArrayList<>());
        tbAlunos.setModel(alunoTableModel);

        tbAlunos.setRowHeight(30);
        tbAlunos.getColumn("Editar").setCellRenderer(new CellButtonRender("Editar", "src/resources/ic_edit.png"));
        tbAlunos.getColumn("Remover").setCellRenderer(new CellButtonRender("Remover", "src/resources/ic_remove.png"));

        controller.loadAlunos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbNovo.setBackground(new java.awt.Color(0, 153, 51));
        jbNovo.setForeground(new java.awt.Color(255, 255, 255));
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        edit(null);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void tbAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlunosMouseClicked
        int rowSelect = tbAlunos.getSelectedRow();

        AlunoTableModel tableModel = (AlunoTableModel) tbAlunos.getModel();

        if (rowSelect != -1) {

            Aluno aluno = tableModel.getValueAtRow(rowSelect);

            //Edit
            if (tbAlunos.getSelectedColumn() == 7) {
                edit(aluno);
            }
            //Remove
            if (tbAlunos.getSelectedColumn() == 8) {
                remove(aluno);
            }
        }
    }//GEN-LAST:event_tbAlunosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbNovo;
    private javax.swing.JTable tbAlunos;
    // End of variables declaration//GEN-END:variables

    /**
     * Função responsavel pela remoção
     *
     * @param aluno
     */
    private void remove(Aluno aluno) {
        controller.remove(aluno);
        controller.loadAlunos();
    }

    /*/*
     Função responsavel pela edição
     */
    private void edit(Aluno aluno) {
        boolean closeDialog;
        try {
            closeDialog = new AlunoFormView(this, true, aluno).openDialog();
            if (closeDialog) {
                controller.loadAlunos();
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public AlunoTableModel getTurmaTableModel() {
        return alunoTableModel;
    }

    public JButton getJbNovo() {
        return jbNovo;
    }

}
