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
 * @author flind
 */
public class AgentRegistreraBoglodite extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form AgentRegistreraBol
     */
    public AgentRegistreraBoglodite() {
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

        jlAntalBoogies = new javax.swing.JLabel();
        jlPlats = new javax.swing.JLabel();
        tfAntalBoogies = new javax.swing.JTextField();
        jlAgentID = new javax.swing.JLabel();
        tfAlienID = new javax.swing.JTextField();
        tfRegDatum = new javax.swing.JTextField();
        tfLosenord = new javax.swing.JTextField();
        tfPlats = new javax.swing.JTextField();
        jlRegAlien = new javax.swing.JLabel();
        jlLosenord = new javax.swing.JLabel();
        tfNamn = new javax.swing.JTextField();
        tfAgentID = new javax.swing.JTextField();
        jlAlienID = new javax.swing.JLabel();
        jlNamn = new javax.swing.JLabel();
        tfTelefon = new javax.swing.JTextField();
        btnRegistrera = new javax.swing.JButton();
        jlRegDatum = new javax.swing.JLabel();
        jlTelefon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlAntalBoogies.setText("Antal boogies");

        jlPlats.setText("Plats");

        tfAntalBoogies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAntalBoogiesActionPerformed(evt);
            }
        });

        jlAgentID.setText("Ansvarig agentID");

        tfAlienID.setColumns(12);

        tfRegDatum.setColumns(12);
        tfRegDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRegDatumActionPerformed(evt);
            }
        });

        tfLosenord.setColumns(12);

        tfPlats.setColumns(12);

        jlRegAlien.setText("Registrera boglodite");

        jlLosenord.setText("Lösenord");

        tfNamn.setColumns(12);

        tfAgentID.setColumns(12);

        jlAlienID.setText("Alien ID");

        jlNamn.setText("Namn");

        tfTelefon.setColumns(12);

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        jlRegDatum.setText("Registreringsdatum");

        jlTelefon.setText("Telefon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlRegAlien)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrera))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlTelefon))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefon)
                                    .addComponent(tfPlats)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlRegDatum)
                                    .addComponent(jlAlienID)
                                    .addComponent(jlLosenord)
                                    .addComponent(jlNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNamn)
                                    .addComponent(tfLosenord)
                                    .addComponent(tfRegDatum)
                                    .addComponent(tfAlienID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlAntalBoogies))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAntalBoogies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrera))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlRegAlien)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlienID)
                            .addComponent(tfAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRegDatum)
                            .addComponent(tfRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLosenord)
                            .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNamn)
                            .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTelefon)
                            .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPlats)
                            .addComponent(tfPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAgentID)
                            .addComponent(tfAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAntalBoogies)
                            .addComponent(tfAntalBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAntalBoogiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAntalBoogiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAntalBoogiesActionPerformed

    private void tfRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRegDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRegDatumActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            String ansvarAgent = tfAgentID.getText();
            String alien = tfAlienID.getText();
            String losenord = tfLosenord.getText();
            String namn = tfNamn.getText();
            String plats = tfPlats.getText();
            String datum = tfRegDatum.getText();
            String telefon = tfTelefon.getText();
            String antalBoogies = tfAntalBoogies.getText();

            String fraga = "insert into alien values('"+alien +"','" + datum +"','" + losenord +"','" + namn + "','" + telefon +"','" + plats + "','" +ansvarAgent+"')";
            String fraga1 = "insert into boglodite values('"+alien+"','" + antalBoogies +"')";

            idb.insert(fraga);
            idb.insert(fraga1);

            JOptionPane.showMessageDialog(null, "Ny boglodite registrerad!");

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
            java.util.logging.Logger.getLogger(AgentRegistreraBoglodite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentRegistreraBoglodite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentRegistreraBoglodite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentRegistreraBoglodite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentRegistreraBoglodite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JLabel jlAgentID;
    private javax.swing.JLabel jlAlienID;
    private javax.swing.JLabel jlAntalBoogies;
    private javax.swing.JLabel jlLosenord;
    private javax.swing.JLabel jlNamn;
    private javax.swing.JLabel jlPlats;
    private javax.swing.JLabel jlRegAlien;
    private javax.swing.JLabel jlRegDatum;
    private javax.swing.JLabel jlTelefon;
    private javax.swing.JTextField tfAgentID;
    private javax.swing.JTextField tfAlienID;
    private javax.swing.JTextField tfAntalBoogies;
    private javax.swing.JTextField tfLosenord;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfPlats;
    private javax.swing.JTextField tfRegDatum;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
