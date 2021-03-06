/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.view.instrutor.form;

import br.com.mario.model.Instrutor;
import br.com.mario.model.Telefone;
import br.com.mario.util.CellButtonRender;
import br.com.mario.util.tablemodel.TelefoneTableModel;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author mario
 */
public class InstrutorFormView extends javax.swing.JDialog {

    private final InstrutorFormController controller;
    private final MaskFormatter mfData;
    private final TelefoneTableModel telefoneTableModel;

    /**
     * Creates new form EstadoFormView1
     *
     * @param parent
     * @param modal
     * @param instrutor
     */
    public InstrutorFormView(java.awt.Frame parent, boolean modal, Instrutor instrutor) throws ParseException {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cadastro de Instrutor");

        mfData = new MaskFormatter("##/##/####");
        mfData.setPlaceholderCharacter('_');
        mfData.install(tfNascimento);

        telefoneTableModel = new TelefoneTableModel(new ArrayList<>());
        tbTelefones.setModel(telefoneTableModel);

        tbTelefones.setRowHeight(30);
        tbTelefones.getColumn("Remover").setCellRenderer(new CellButtonRender("Remover", "src/resources/ic_remove.png"));

        controller = new InstrutorFormController(this);

        if (instrutor != null) {
            controller.edit(instrutor);
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

        tfNome = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        tfRg = new javax.swing.JTextField();
        tfTitulacao = new javax.swing.JTextField();
        tfNascimento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTelefones = new javax.swing.JTable();
        tfNumeroTelefone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btAdicionar = new javax.swing.JButton();
        cbTipoTelefone = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(717, 507));

        tfNome.setBackground(new java.awt.Color(214, 217, 223));
        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

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

        tfRg.setBackground(new java.awt.Color(214, 217, 223));
        tfRg.setBorder(javax.swing.BorderFactory.createTitledBorder("RG"));

        tfTitulacao.setBackground(new java.awt.Color(214, 217, 223));
        tfTitulacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulação"));

        tfNascimento.setBackground(new java.awt.Color(214, 217, 223));
        tfNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Nascimento"));
        tfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        tbTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTelefones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTelefonesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTelefones);

        tfNumeroTelefone.setBackground(new java.awt.Color(214, 217, 223));
        tfNumeroTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        btAdicionar.setBackground(new java.awt.Color(0, 153, 51));
        btAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        cbTipoTelefone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fixo", "Celular" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTitulacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNascimento))
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(0, 0, 0)
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
        controller.merge();
        dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed

        if (!getTipoTelefoneSelect().isEmpty() && !tfNumeroTelefone.getText().isEmpty()) {
            controller.adicionarTelefone(getTipoTelefoneSelect(), tfNumeroTelefone.getText());
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os dados por favor!");
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void tbTelefonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTelefonesMouseClicked
        int rowSelect = tbTelefones.getSelectedRow();

        TelefoneTableModel tableModel = (TelefoneTableModel) tbTelefones.getModel();

        if (rowSelect != -1) {

            Telefone telefone = tableModel.getValueAtRow(rowSelect);

            //Remove
            if (tbTelefones.getSelectedColumn() == 3) {
                remove(telefone);
            }
        }
    }//GEN-LAST:event_tbTelefonesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbTipoTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbTelefones;
    private javax.swing.JFormattedTextField tfNascimento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroTelefone;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTitulacao;
    // End of variables declaration//GEN-END:variables

    public TelefoneTableModel getTelefoneTableModel() {
        return telefoneTableModel;
    }

    public JButton getBtAdicionar() {
        return btAdicionar;
    }

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public JButton getBtSalvar() {
        return btSalvar;
    }

    public JComboBox getCbTipoTelefone() {
        return cbTipoTelefone;
    }

    public JFormattedTextField getTfNascimento() {
        return tfNascimento;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfNumeroTelefone() {
        return tfNumeroTelefone;
    }

    public JTextField getTfRg() {
        return tfRg;
    }

    public JTextField getTfTitulacao() {
        return tfTitulacao;
    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=METODOS=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--\\
    private void limpar() {
        tfNumeroTelefone.setText("");
        cbTipoTelefone.getModel().setSelectedItem(null);
        controller.loadTelefones();
    }

    private void remove(Telefone telefone) {
        controller.remove(telefone);
        controller.loadTelefones();
    }


    public String getTipoTelefoneSelect() {
        return (String) cbTipoTelefone.getSelectedItem();
    }

}
