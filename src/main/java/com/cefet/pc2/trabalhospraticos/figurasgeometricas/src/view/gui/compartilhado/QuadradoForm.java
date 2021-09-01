/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.compartilhado;

import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Quadrado;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.Renderizavel;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums.OpcoesSubMenu;
import com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.view.gui.IFormulario;
import javax.swing.JOptionPane;

/**
 *
 * @author Everton
 */
public class QuadradoForm extends javax.swing.JDialog implements IFormulario{

    private Quadrado quadrado;
    private OpcoesSubMenu operacao;

    //construtor para quando for inserir
    public QuadradoForm() {
        this.setModal(true);
        initComponents();

    }
    
    @Override
    public void update(Renderizavel item) {
        this.operacao = OpcoesSubMenu.ALTERAR;
        this.quadrado = (Quadrado) item;
        this.textTamanhoLado.setText(quadrado.getTamanhoLado()+"");
        this.setVisible(true);
    }

    @Override
    public Renderizavel inserir() {
        this.operacao = OpcoesSubMenu.CRIAR;
        this.setVisible(true);

        return this.quadrado;
    }
    
    @Override
    public void detalhes(Renderizavel item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvarAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textTamanhoLado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalvarAlterar.setBackground(new java.awt.Color(0, 153, 51));
        btnSalvarAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvarAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAlterar.setText("Salvar");
        btnSalvarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 51, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");

        jLabel1.setText("Tamanho do Lado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTamanhoLado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTamanhoLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlterarActionPerformed
        // TODO add your handling code here:

        if (this.operacao == OpcoesSubMenu.CRIAR) {
            salvar();
        } else {
            this.atualizar();
        }

    }//GEN-LAST:event_btnSalvarAlterarActionPerformed

    private void atualizar() {
        try {
            int tamanhoLado = Integer.parseInt(this.textTamanhoLado.getText());
            if (tamanhoLado < 0) {
                throw new NumberFormatException();
            } else {
                this.quadrado.setTamanhoLado(tamanhoLado);
                this.dispose();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O valor entrado deve ser um numero maior do que 0.");
        }
    }

    private void salvar() {
        String tamanhoLado = this.textTamanhoLado.getText();
        int tamanhoLadoInt;
        try {
            tamanhoLadoInt = Integer.parseInt(tamanhoLado);
            if (tamanhoLadoInt <= 0) {
                throw new NumberFormatException();
            }
            this.quadrado = new Quadrado(tamanhoLadoInt);
            this.dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O valor entrado deve ser um numero maior do que 0.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvarAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textTamanhoLado;
    // End of variables declaration//GEN-END:variables

    
}