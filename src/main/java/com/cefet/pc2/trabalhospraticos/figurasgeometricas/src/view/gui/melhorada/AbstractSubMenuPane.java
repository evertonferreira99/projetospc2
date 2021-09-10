/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.melhorada;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.control.gu_melhorada.ISubMenuController;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.IFormulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 * @author Everton
 */
public abstract class AbstractSubMenuPane extends javax.swing.JPanel implements ITabela {

    protected List<String> nomeColunas;
    private String menuName;
    protected IFormulario form;
    protected ISubMenuController controller;
    protected DefaultTableModel tablemodel;

    /**
     * Creates new form AbstractSubMenuPane
     *
     * @param nomeColunas O nome das Colunas na Tabela;
     * @param nomeMenu    O nome do menu
     */
    public AbstractSubMenuPane(String nomeMenu, List<String> nomeColunas) {
        initComponents();
        this.menuName = nomeMenu;
        this.nomeColunas = nomeColunas;
        this.labelMenuName.setText(this.menuName);
        this.tablemodel = (DefaultTableModel) this.tabelaObjetos.getModel();

        this.nomeColunas.add(0, "ID");
        this.tablemodel.setColumnIdentifiers(this.nomeColunas.toArray());

    }

    @Override
    public void atualizarTabela() {
        this.tablemodel.setRowCount(0);
        List<? extends Renderizavel> lista = this.controller.findAll();
        for (Renderizavel item : lista) {
            this.tablemodel.addRow(this.criarLinha(item));
        }
    }

    protected abstract Object[] criarLinha(Renderizavel item);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaObjetos = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        labelMenuName = new javax.swing.JLabel();

        tabelaObjetos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        jScrollPane1.setViewportView(tabelaObjetos);

        btnInserir.setBackground(new java.awt.Color(0, 207, 39));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(255, 204, 51));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDetalhes.setBackground(new java.awt.Color(2, 117, 216));
        btnDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDetalhes.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        labelMenuName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelMenuName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(75, 75, 75)
                                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(69, 69, 69)
                                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelMenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        final int colunaID = 0;
        int linhaSelecionada = tabelaObjetos.getSelectedRow();
        int id = (Integer) this.tabelaObjetos.getValueAt(linhaSelecionada, colunaID);
        form.update(controller.findById(id));
        this.atualizarTabela();

        //JOptionPane.showMessageDialog(this, "Ainda vai alterar alguma coisa aqui");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        Renderizavel item = this.form.inserir();
        if (item != null) {
            this.controller.create(item);
            this.atualizarTabela();
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        final int colunaID = 0;
        int linhaSelecionada = tabelaObjetos.getSelectedRow();
        int id = (Integer) this.tabelaObjetos.getValueAt(linhaSelecionada, colunaID);
        final int SIM = 0;
        final int NAO = 1;
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir ?", "", JOptionPane.YES_NO_OPTION);
        if (resposta == SIM) {
            this.controller.delete(id);
            this.atualizarTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        // TODO add your handling code here:]
        JOptionPane.showMessageDialog(this, "Ainda vai mostrar detalhes de alguma coisa aqui");
    }//GEN-LAST:event_btnDetalhesActionPerformed

    public void setForm(IFormulario form) {
        this.form = form;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.atualizarTabela();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMenuName;
    private javax.swing.JTable tabelaObjetos;
    // End of variables declaration//GEN-END:variables
}
