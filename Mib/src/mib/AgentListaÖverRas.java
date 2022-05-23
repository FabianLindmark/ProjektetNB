/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author FeliciaAhlman
 */
public class AgentListaÖverRas extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form AgentListaÖverRas
     */
    public AgentListaÖverRas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListaAliensRas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNamnLista = new javax.swing.JTextArea();
        btnBoglodite = new javax.swing.JButton();
        btnSquid = new javax.swing.JButton();
        btnWorm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlListaAliensRas.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jlListaAliensRas.setText("Lista över vilka raser aliens har:");

        taNamnLista.setColumns(20);
        taNamnLista.setRows(5);
        jScrollPane1.setViewportView(taNamnLista);

        btnBoglodite.setText("Boglodite");
        btnBoglodite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBogloditeActionPerformed(evt);
            }
        });

        btnSquid.setText("Squid");
        btnSquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquidActionPerformed(evt);
            }
        });

        btnWorm.setText("Worm");
        btnWorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlListaAliensRas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBoglodite)
                            .addGap(18, 18, 18)
                            .addComponent(btnSquid)
                            .addGap(18, 18, 18)
                            .addComponent(btnWorm))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlListaAliensRas)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBoglodite)
                    .addComponent(btnSquid)
                    .addComponent(btnWorm))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquidActionPerformed

       try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
            String Squid = btnSquid.getText();
            String fraga ="SELECT DISTINCT Namn FROM Alien WHERE Alien_ID IN (SELECT Alien_ID FROM Squid)";
            ArrayList<String> rasAliens = idb.fetchColumn(fraga);
           
            
            for(String alienRas : rasAliens){
                taNamnLista.append(alienRas);
                taNamnLista.append("\n");

        }}
        
        catch(InfException e){
        
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_btnSquidActionPerformed

    private void btnBogloditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBogloditeActionPerformed
 
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
            String Boglodite = btnBoglodite.getText();
            String fraga ="SELECT DISTINCT Namn FROM Alien WHERE Alien_ID IN (SELECT Alien_ID FROM Boglodite)";
            ArrayList<String> rasAliens = idb.fetchColumn(fraga);
           
            
            for(String alienRas : rasAliens){
                taNamnLista.append(alienRas);
                taNamnLista.append("\n");

        }}
        
        catch(InfException e){
        
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_btnBogloditeActionPerformed

    private void btnWormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWormActionPerformed
          
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
            String Worm = btnWorm.getText();
            String fraga = "SELECT DISTINCT Namn FROM Alien WHERE Alien_ID IN (SELECT Alien_ID FROM Worm)";
            ArrayList<String> rasAliens = idb.fetchColumn(fraga);
           
           
            
            for(String alienRas : rasAliens){
                taNamnLista.append(fraga);
                taNamnLista.append("\n");

        }}
        
        catch(InfException e){
        
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_btnWormActionPerformed

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
            java.util.logging.Logger.getLogger(AgentListaÖverRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentListaÖverRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentListaÖverRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentListaÖverRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentListaÖverRas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoglodite;
    private javax.swing.JButton btnSquid;
    private javax.swing.JButton btnWorm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlListaAliensRas;
    private javax.swing.JTextArea taNamnLista;
    // End of variables declaration//GEN-END:variables
}
