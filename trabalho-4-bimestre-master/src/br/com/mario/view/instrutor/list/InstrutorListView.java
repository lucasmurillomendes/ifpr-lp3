/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.view.instrutor.list;

import br.com.mario.model.Instrutor;
import br.com.mario.util.CellButtonRender;
import br.com.mario.util.tablemodel.InstrutorTableModel;
import br.com.mario.view.instrutor.form.InstrutorFormView;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author mario
 */
public class InstrutorListView extends javax.swing.JFrame {

    private final InstrutorListController controller;
    private InstrutorTableModel instrutorTableModel;

    /**
     * Creates new form EstadoView
     */
    public InstrutorListView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Lista de Instrutores");

        controller = new InstrutorListController(this);

        instrutorTableModel = new InstrutorTableModel(new ArrayList<>());
        tbInstrutor.setModel(instrutorTableModel);

        tbInstrutor.setRowHeight(30);
        tbInstrutor.getColumn("Editar").setCellRenderer(new CellButtonRender("Editar", "src/resources/ic_edit.png"));
        tbInstrutor.getColumn("Remover").setCellRenderer(new CellButtonRender("Remover", "src/resources/ic_remove.png"));

        controller.loadInstrutores();
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
        tbInstrutor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbNovo.setBackground(new java.awt.Color(0, 153, 51));
        jbNovo.setForeground(new java.awt.Color(255, 255, 255));
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        tbInstrutor.setModel(new javax.swing.table.DefaultTableModel(
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
        tbInstrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInstrutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInstrutor);

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

    private void tbInstrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInstrutorMouseClicked
        int rowSelect = tbInstrutor.getSelectedRow();

        InstrutorTableModel tableModel = (InstrutorTableModel) tbInstrutor.getModel();

        if (rowSelect != -1) {

            Instrutor instrutor = tableModel.getValueAtRow(rowSelect);

            //Edit
            if (tbInstrutor.getSelectedColumn() == 5) {
                edit(instrutor);
            }
            //Remove
            if (tbInstrutor.getSelectedColumn() == 6) {
                remove(instrutor);
            }
        }
    }//GEN-LAST:event_tbInstrutorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbNovo;
    private javax.swing.JTable tbInstrutor;
    // End of variables declaration//GEN-END:variables

    /**
     * Função responsavel pela remoção
     *
     * @param instrutor
     */
    private void remove(Instrutor instrutor) {
        controller.remove(instrutor);
        controller.loadInstrutores();
    }

    /*/*
     Função responsavel pela edição
     */
    private void edit(Instrutor instrutor) {
        boolean closeDialog;
        try {
            closeDialog = new InstrutorFormView(this, true, instrutor).openDialog();
            if (closeDialog) {
                controller.loadInstrutores();
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public JButton getJbNovo() {
        return jbNovo;
    }

    public void setJbNovo(JButton jbNovo) {
        this.jbNovo = jbNovo;
    }

    public JTable getTbEstados() {
        return tbInstrutor;
    }

    public void setTbEstados(JTable tbEstados) {
        this.tbInstrutor = tbEstados;
    }

    public InstrutorTableModel getInstrutorTableModel() {
        return instrutorTableModel;
    }

    public void setInstrutorTableModel(InstrutorTableModel instrutorTableModel) {
        this.instrutorTableModel = instrutorTableModel;
    }

}