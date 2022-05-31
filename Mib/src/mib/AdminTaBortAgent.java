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
 * @author ellenportugues
 */
public class AdminTaBortAgent extends javax.swing.JFrame {
 
    private InfDB idb;
    /**
     * Creates new form AdminTaBortAgent
     */
    public AdminTaBortAgent() {
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

        jlTaBortAgent = new javax.swing.JLabel();
        jlTaBortAgentNamn = new javax.swing.JLabel();
        btnTaBortAgent = new javax.swing.JButton();
        tfAgentNamn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTaBortAgent.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jlTaBortAgent.setText("Ta bort agent:");

        jlTaBortAgentNamn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jlTaBortAgentNamn.setText("Namn:");

        btnTaBortAgent.setText("Ta bort agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        tfAgentNamn.setColumns(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTaBortAgentNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(jlTaBortAgent)
                    .addComponent(btnTaBortAgent, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlTaBortAgent)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTaBortAgentNamn)
                    .addComponent(tfAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnTaBortAgent)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed

        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
            Boolean hittad = false;
            String vilkenAgent = tfAgentNamn.getText();
            String allaAgenter = "select namn from agent";
            
            ArrayList<String> agenterna = idb.fetchColumn(allaAgenter);
            
                for(String agent:agenterna){
                    
                    String vilkaBort = "delete from agent where namn = '"+agent+"'";
                    
                    idb.delete(vilkaBort);
                    JOptionPane.showMessageDialog(null, "Agenten är nu borttagen!");
                    hittad = true;
                    break;
                
                }
            
        }
        
        catch(InfException ettUndantag) {
              JOptionPane.showMessageDialog(null, "Något gick fel!");
              System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
    }
        
    }//GEN-LAST:event_btnTaBortAgentActionPerformed

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
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaBortAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JLabel jlTaBortAgent;
    private javax.swing.JLabel jlTaBortAgentNamn;
    private javax.swing.JTextField tfAgentNamn;
    // End of variables declaration//GEN-END:variables
}
