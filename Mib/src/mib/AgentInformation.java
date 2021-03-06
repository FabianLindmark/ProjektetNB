/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

/**
 *
 * @author ellenportugues
 */
public class AgentInformation extends javax.swing.JFrame {

    /**
     * Creates new form AgentInformation
     */
    public AgentInformation() {
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

        jlValkommen = new javax.swing.JLabel();
        btnAgAndraLosen = new javax.swing.JButton();
        btnAgRegistrera = new javax.swing.JButton();
        btnAgListor = new javax.swing.JButton();
        btnSokAgInfo = new javax.swing.JButton();
        btnAgAndraInfo = new javax.swing.JButton();
        btnInfoOmradeschef = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlValkommen.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jlValkommen.setText("Välkommen!");

        btnAgAndraLosen.setText("Ändra Lösenord");
        btnAgAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgAndraLosenActionPerformed(evt);
            }
        });

        btnAgRegistrera.setText("Registrera");
        btnAgRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgRegistreraActionPerformed(evt);
            }
        });

        btnAgListor.setText("Listor");
        btnAgListor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgListorActionPerformed(evt);
            }
        });

        btnSokAgInfo.setText("Sök info om alien");
        btnSokAgInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAgInfoActionPerformed(evt);
            }
        });

        btnAgAndraInfo.setText("Ändra Information");
        btnAgAndraInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgAndraInfoActionPerformed(evt);
            }
        });

        btnInfoOmradeschef.setText("Sök info om områdeschef");
        btnInfoOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoOmradeschefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgAndraLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgRegistrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgListor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSokAgInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgAndraInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addComponent(btnInfoOmradeschef))
                    .addComponent(jlValkommen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlValkommen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnAgAndraLosen)
                .addGap(18, 18, 18)
                .addComponent(btnAgRegistrera)
                .addGap(18, 18, 18)
                .addComponent(btnAgListor)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSokAgInfo)
                    .addComponent(btnInfoOmradeschef))
                .addGap(18, 18, 18)
                .addComponent(btnAgAndraInfo)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgAndraLosenActionPerformed
        new AgentÄndraLösenord().setVisible(rootPaneCheckingEnabled);       
    }//GEN-LAST:event_btnAgAndraLosenActionPerformed

    private void btnAgAndraInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgAndraInfoActionPerformed
        new AgentÄndraInformationOmAlien().setVisible(rootPaneCheckingEnabled);      
    }//GEN-LAST:event_btnAgAndraInfoActionPerformed

    private void btnAgRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgRegistreraActionPerformed
        new AgentRegistrera().setVisible(rootPaneCheckingEnabled);        
    }//GEN-LAST:event_btnAgRegistreraActionPerformed

    private void btnAgListorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgListorActionPerformed
        new AgentLista().setVisible(rootPaneCheckingEnabled);        
    }//GEN-LAST:event_btnAgListorActionPerformed

    private void btnSokAgInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAgInfoActionPerformed
        new AgentSökInformationOmAlien().setVisible(rootPaneCheckingEnabled); 
    }//GEN-LAST:event_btnSokAgInfoActionPerformed

    private void btnInfoOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoOmradeschefActionPerformed
        new AgentVisaInformationOmOmrådeschef().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnInfoOmradeschefActionPerformed

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
            java.util.logging.Logger.getLogger(AgentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgAndraInfo;
    private javax.swing.JButton btnAgAndraLosen;
    private javax.swing.JButton btnAgListor;
    private javax.swing.JButton btnAgRegistrera;
    private javax.swing.JToggleButton btnInfoOmradeschef;
    private javax.swing.JButton btnSokAgInfo;
    private javax.swing.JLabel jlValkommen;
    // End of variables declaration//GEN-END:variables
}
