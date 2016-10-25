/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.sportmanager.frames;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import org.unipampa.sportmanager.listainterface.CrudAluno;
import org.unipampa.sportmanager.listainterface.CrudTurma;
import org.unipampa.sportmanager.listainterface.ListaAlunos;
import org.unipampa.sportmanager.listainterface.ListaTurmas;

/**
 *
 * @author yuryalencar
 */
public class Inicial extends javax.swing.JFrame {

    CrudAluno listaAlunos = new ListaAlunos();
    CrudTurma listaTurmas = new ListaTurmas();
    
    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Gerenciador de esportes - Trabalho POO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicial = new javax.swing.JPanel();
        jButtonGerenciadorDeAlunos = new javax.swing.JButton();
        jButtonGerenciadorTurmas = new javax.swing.JButton();
        jMenuBarInicial = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemAjudaTurmas = new javax.swing.JMenuItem();
        jMenuItemAjudaAlunos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonGerenciadorDeAlunos.setText("Gerenciador de alunos");
        jButtonGerenciadorDeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenciadorDeAlunosActionPerformed(evt);
            }
        });

        jButtonGerenciadorTurmas.setText("Gerenciador de turmas");
        jButtonGerenciadorTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenciadorTurmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicialLayout = new javax.swing.GroupLayout(jPanelInicial);
        jPanelInicial.setLayout(jPanelInicialLayout);
        jPanelInicialLayout.setHorizontalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicialLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGerenciadorTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGerenciadorDeAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanelInicialLayout.setVerticalGroup(
            jPanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicialLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jButtonGerenciadorTurmas)
                .addGap(18, 18, 18)
                .addComponent(jButtonGerenciadorDeAlunos)
                .addGap(25, 25, 25))
        );

        jMenuOpcoes.setText("Opções");

        jMenuItemAjudaTurmas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAjudaTurmas.setText("Ajuda com o Gerenciador de turmas");
        jMenuItemAjudaTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaTurmasActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemAjudaTurmas);

        jMenuItemAjudaAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAjudaAlunos.setText("Ajuda com o Gerenciador de alunos");
        jMenuItemAjudaAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaAlunosActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemAjudaAlunos);

        jMenuBarInicial.add(jMenuOpcoes);

        setJMenuBar(jMenuBarInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerenciadorDeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciadorDeAlunosActionPerformed
        // TODO add your handling code here:
        new GerenciadorAlunos(listaAlunos, listaTurmas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonGerenciadorDeAlunosActionPerformed

    private void jButtonGerenciadorTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciadorTurmasActionPerformed
        // TODO add your handling code here:
        new GerenciadorTurmas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonGerenciadorTurmasActionPerformed

    private void jMenuItemAjudaTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaTurmasActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Ajuda turmas");
    }//GEN-LAST:event_jMenuItemAjudaTurmasActionPerformed

    private void jMenuItemAjudaAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaAlunosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Ajuda alunos");
    }//GEN-LAST:event_jMenuItemAjudaAlunosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerenciadorDeAlunos;
    private javax.swing.JButton jButtonGerenciadorTurmas;
    private javax.swing.JMenuBar jMenuBarInicial;
    private javax.swing.JMenuItem jMenuItemAjudaAlunos;
    private javax.swing.JMenuItem jMenuItemAjudaTurmas;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JPanel jPanelInicial;
    // End of variables declaration//GEN-END:variables
}
