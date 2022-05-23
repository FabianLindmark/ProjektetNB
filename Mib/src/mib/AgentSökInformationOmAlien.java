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
public class AgentSökInformationOmAlien extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form AgentSökInformationOmAlien
     */
    public AgentSökInformationOmAlien() {
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

        jlSok = new javax.swing.JLabel();
        jlNamn = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jlRegDatum = new javax.swing.JLabel();
        jlTelefon = new javax.swing.JLabel();
        jlPlats = new javax.swing.JLabel();
        jlAnsvarigAgent = new javax.swing.JLabel();
        tfSkrivNamn = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfRegDatum = new javax.swing.JTextField();
        tfTelefon = new javax.swing.JTextField();
        tfPlats = new javax.swing.JTextField();
        tfAnsvarigAgent = new javax.swing.JTextField();
        btnSok = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlSok.setText("Sök information om alien");

        jlNamn.setText("Skriv in namn:");

        jlID.setText("ID");

        jlRegDatum.setText("Registreringsdatum");

        jlTelefon.setText("Telefonnummer");

        jlPlats.setText("Plats");

        jlAnsvarigAgent.setText("Ansvarig agent");

        tfSkrivNamn.setColumns(12);
        tfSkrivNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSkrivNamnActionPerformed(evt);
            }
        });

        tfID.setColumns(12);

        tfRegDatum.setColumns(12);

        tfTelefon.setColumns(12);

        tfPlats.setColumns(12);

        tfAnsvarigAgent.setColumns(12);

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSok, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlAnsvarigAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(tfAnsvarigAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlRegDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfSkrivNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSok)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNamn)
                    .addComponent(tfSkrivNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegDatum)
                    .addComponent(tfRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefon)
                    .addComponent(tfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlats)
                    .addComponent(tfPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAnsvarigAgent)
                    .addComponent(tfAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSkrivNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSkrivNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSkrivNamnActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            String namn = tfSkrivNamn.getText();
            
            
            
            
                String fraga1 = "select alien_id from alien where namn = '"+namn+"'";
                String svar1 = idb.fetchSingle(fraga1);

                tfID.setText(svar1);

                String fraga2 = "select telefon from alien where namn = '"+namn+"'";
                String svar2 = idb.fetchSingle(fraga2);

                tfTelefon.setText(svar2);

                String fraga3 = "select registreringsdatum from alien where namn = '"+namn+"'";
                String svar3 = idb.fetchSingle(fraga3);

                tfRegDatum.setText(svar3);

                String fraga4 = "select plats from alien where namn = '"+namn+"'";
                String svar4 = idb.fetchSingle(fraga4);

                tfPlats.setText(svar4);

                String fraga5 = "select ansvarig_agent from alien where namn = '"+namn+"'";
                String svar5 = idb.fetchSingle(fraga5);

                tfAnsvarigAgent.setText(svar5);
            }
            
        
        
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!"); 
        }
    }//GEN-LAST:event_btnSokActionPerformed

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
            java.util.logging.Logger.getLogger(AgentSökInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentSökInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentSökInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentSökInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentSökInformationOmAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSok;
    private javax.swing.JLabel jlAnsvarigAgent;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNamn;
    private javax.swing.JLabel jlPlats;
    private javax.swing.JLabel jlRegDatum;
    private javax.swing.JLabel jlSok;
    private javax.swing.JLabel jlTelefon;
    private javax.swing.JTextField tfAnsvarigAgent;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfPlats;
    private javax.swing.JTextField tfRegDatum;
    private javax.swing.JTextField tfSkrivNamn;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
