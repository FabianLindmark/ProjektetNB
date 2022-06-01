/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellenportugues
 */
public class AdminNyregistreraAgent extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form AdminNyregistreraAgent
     */
    public AdminNyregistreraAgent() {
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

        jlNyregistreraAgent = new javax.swing.JLabel();
        jlAgentID = new javax.swing.JLabel();
        jlRegistreringsdatum = new javax.swing.JLabel();
        jlLosenord = new javax.swing.JLabel();
        jlNamn = new javax.swing.JLabel();
        jlTelefon = new javax.swing.JLabel();
        jlOmrade = new javax.swing.JLabel();
        jlAdminStatus = new javax.swing.JLabel();
        tfAngivenAdminStatus = new javax.swing.JTextField();
        tfAngivetRegistreringsdatum = new javax.swing.JTextField();
        tfAngivenTelefon = new javax.swing.JTextField();
        tfAngivetAgentID = new javax.swing.JTextField();
        tfAngivetLosenord = new javax.swing.JTextField();
        tfAngivetOmrade = new javax.swing.JTextField();
        tfAngivetNamn = new javax.swing.JTextField();
        btnRegistrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlNyregistreraAgent.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jlNyregistreraAgent.setText("Nyregistrera Agent");

        jlAgentID.setText("Agent ID:");

        jlRegistreringsdatum.setText("Registreringsdatum: ");

        jlLosenord.setText("Lösenord:");

        jlNamn.setText("Namn:");

        jlTelefon.setText("Telefon:");

        jlOmrade.setText("Område:");

        jlAdminStatus.setText("AdminStatus:");

        tfAngivenAdminStatus.setColumns(10);

        tfAngivetRegistreringsdatum.setColumns(10);

        tfAngivenTelefon.setColumns(10);

        tfAngivetAgentID.setColumns(10);

        tfAngivetLosenord.setColumns(10);

        tfAngivetOmrade.setColumns(10);

        tfAngivetNamn.setColumns(10);

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNyregistreraAgent)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAgentID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAngivetAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAngivetNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTelefon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAngivenTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlRegistreringsdatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(tfAngivetRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAdminStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAngivenAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAngivetLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlOmrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAngivetOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrera)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNyregistreraAgent)
                        .addGap(18, 18, 18)
                        .addComponent(jlAgentID)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfAngivetAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNamn)
                            .addComponent(tfAngivetNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAngivenTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegistreringsdatum)
                    .addComponent(tfAngivetRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlAdminStatus)
                    .addComponent(tfAngivenAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jlLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfAngivetLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAngivetOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOmrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrera)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metod för att registrera en ny alien.
   
    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
   
        try {
            idb = new InfDB ("mibdb", "3306", "mibdba", "mibkey");
            
         String agentID = tfAngivetAgentID.getText();
         String namn = tfAngivetNamn.getText();
         String telefon = tfAngivenTelefon.getText();
         String regDatum = tfAngivetRegistreringsdatum.getText();
         String admin = tfAngivenAdminStatus.getText();
         String losen = tfAngivetLosenord.getText();
         String omrade = tfAngivetOmrade.getText();
         String fraga = "insert into Agent values('"+ agentID +"','" + namn +"','" + telefon +"','" + regDatum + "','" + admin +"','" + losen + "','" +omrade+"')";
            
         if (Validering.datumKontroll(regDatum)){   
         }
         if (Validering.textFaltHarVarde(tfAngivetAgentID) || Validering.textFaltHarVarde(tfAngivetNamn) || Validering.textFaltHarVarde(tfAngivenTelefon) || Validering.textFaltHarVarde(tfAngivetRegistreringsdatum) || Validering.textFaltHarVarde(tfAngivenAdminStatus) || Validering.textFaltHarVarde(tfAngivenAdminStatus) || Validering.textFaltHarVarde(tfAngivetLosenord) || Validering.textFaltHarVarde(tfAngivetOmrade)) {
         } 
          
            idb.insert(fraga);
            
            JOptionPane.showMessageDialog(null, "Ny agent registrerad!");
        }
        catch(InfException ettUndantag){
             JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
      
    }//GEN-LAST:event_btnRegistreraActionPerformed

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
            java.util.logging.Logger.getLogger(AdminNyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminNyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminNyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminNyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminNyregistreraAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JLabel jlAdminStatus;
    private javax.swing.JLabel jlAgentID;
    private javax.swing.JLabel jlLosenord;
    private javax.swing.JLabel jlNamn;
    private javax.swing.JLabel jlNyregistreraAgent;
    private javax.swing.JLabel jlOmrade;
    private javax.swing.JLabel jlRegistreringsdatum;
    private javax.swing.JLabel jlTelefon;
    private javax.swing.JTextField tfAngivenAdminStatus;
    private javax.swing.JTextField tfAngivenTelefon;
    private javax.swing.JTextField tfAngivetAgentID;
    private javax.swing.JTextField tfAngivetLosenord;
    private javax.swing.JTextField tfAngivetNamn;
    private javax.swing.JTextField tfAngivetOmrade;
    private javax.swing.JTextField tfAngivetRegistreringsdatum;
    // End of variables declaration//GEN-END:variables
}
