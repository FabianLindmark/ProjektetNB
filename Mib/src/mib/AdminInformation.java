/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

/**
 *
 * @author ellenportugues
 */
public class AdminInformation extends javax.swing.JFrame {

    /**
     * Creates new form AdminInformation
     */
    public AdminInformation() {
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

        ljValkommen = new javax.swing.JLabel();
        btnAndraLosenord = new javax.swing.JButton();
        btnRegistrera = new javax.swing.JButton();
        btnListor = new javax.swing.JButton();
        btnSok = new javax.swing.JButton();
        btnAndraInformation = new javax.swing.JButton();
        btnTaBortAlien = new javax.swing.JButton();
        btnTaBortUtrustning = new javax.swing.JButton();
        btnNyregistreraAgent = new javax.swing.JButton();
        btnSokAgentInformation = new javax.swing.JButton();
        btnAndraAgentInformation = new javax.swing.JButton();
        btnTaBortAgent = new javax.swing.JButton();
        btnAndraInformationAdminstatus = new javax.swing.JButton();
        btnAndraInformationOmradeschef = new javax.swing.JButton();
        btnAndraInfromationKontorschef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ljValkommen.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ljValkommen.setText("Välkommen!");

        btnAndraLosenord.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAndraLosenord.setText("Ändra Lösenord");
        btnAndraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordActionPerformed(evt);
            }
        });

        btnRegistrera.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnRegistrera.setText("Registrera");

        btnListor.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnListor.setText("Listor");

        btnSok.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSok.setText("Sök");

        btnAndraInformation.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAndraInformation.setText("Ändra information");

        btnTaBortAlien.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnTaBortAlien.setText("Ta bort alien");

        btnTaBortUtrustning.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnTaBortUtrustning.setText("Ta bort utrustning");

        btnNyregistreraAgent.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnNyregistreraAgent.setText("Nyregistrera agent");

        btnSokAgentInformation.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSokAgentInformation.setText("Sök agent information");

        btnAndraAgentInformation.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAndraAgentInformation.setText("Ändra agent information");

        btnTaBortAgent.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnTaBortAgent.setText("Ta bort agent");

        btnAndraInformationAdminstatus.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAndraInformationAdminstatus.setText("Ändra information adminstatus");

        btnAndraInformationOmradeschef.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAndraInformationOmradeschef.setText("Ändra information områdeschef");

        btnAndraInfromationKontorschef.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAndraInfromationKontorschef.setText("Ändra information kontorschef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndraInformation)
                            .addComponent(ljValkommen)
                            .addComponent(btnTaBortUtrustning)
                            .addComponent(btnTaBortAlien))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSokAgentInformation)
                            .addComponent(btnAndraInformationOmradeschef)
                            .addComponent(btnAndraInfromationKontorschef)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndraLosenord)
                            .addComponent(btnRegistrera)
                            .addComponent(btnListor)
                            .addComponent(btnSok))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndraAgentInformation)
                            .addComponent(btnTaBortAgent)
                            .addComponent(btnNyregistreraAgent)
                            .addComponent(btnAndraInformationAdminstatus))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ljValkommen)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraLosenord)
                    .addComponent(btnTaBortAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrera)
                    .addComponent(btnAndraAgentInformation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListor)
                    .addComponent(btnNyregistreraAgent))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAndraInformationAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSokAgentInformation))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAndraInformation)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraInformationOmradeschef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaBortUtrustning)
                    .addComponent(btnAndraInfromationKontorschef))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

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
            java.util.logging.Logger.getLogger(AdminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAgentInformation;
    private javax.swing.JButton btnAndraInformation;
    private javax.swing.JButton btnAndraInformationAdminstatus;
    private javax.swing.JButton btnAndraInformationOmradeschef;
    private javax.swing.JButton btnAndraInfromationKontorschef;
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnListor;
    private javax.swing.JButton btnNyregistreraAgent;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnSokAgentInformation;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JButton btnTaBortUtrustning;
    private javax.swing.JLabel ljValkommen;
    // End of variables declaration//GEN-END:variables
}
