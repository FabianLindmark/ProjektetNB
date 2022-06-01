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
public class AgentÄndraInformationOmAgent extends javax.swing.JFrame {

    private InfDB idb; 
    /**
     * Creates new form AgentÄndraInformationOmAgent
     */
    public AgentÄndraInformationOmAgent() {
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

        tfVemAndra = new javax.swing.JTextField();
        jlAndraAnsvarigAgent = new javax.swing.JLabel();
        tfAndraNamn = new javax.swing.JTextField();
        tfAndraTelefon = new javax.swing.JTextField();
        tfAndraOmrade = new javax.swing.JTextField();
        btnNamn = new javax.swing.JButton();
        btnTelefon = new javax.swing.JButton();
        jlAndraInfo = new javax.swing.JLabel();
        jlAndraNamn = new javax.swing.JLabel();
        btnAndraOmrade = new javax.swing.JButton();
        jlAndraTelefon = new javax.swing.JLabel();
        jlVemAndra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfVemAndra.setColumns(12);

        jlAndraAnsvarigAgent.setText("Ändra område");

        tfAndraNamn.setColumns(12);

        tfAndraTelefon.setColumns(12);

        tfAndraOmrade.setColumns(12);

        btnNamn.setText("Ändra");
        btnNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamnActionPerformed(evt);
            }
        });

        btnTelefon.setText("Ändra");
        btnTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonActionPerformed(evt);
            }
        });

        jlAndraInfo.setText("Ändra information om en agent!");

        jlAndraNamn.setText("Ändra namn");

        btnAndraOmrade.setText("Ändra");
        btnAndraOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOmradeActionPerformed(evt);
            }
        });

        jlAndraTelefon.setText("Ändra telefonnummer");

        jlVemAndra.setText("Ange namn på agent du vill ändra:");

        jButton1.setText("Ändra adminstatus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jlAndraInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlVemAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(tfVemAndra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAndraNamn)
                            .addComponent(jlAndraTelefon)
                            .addComponent(jlAndraAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAndraOmrade)
                                    .addComponent(tfAndraTelefon)
                                    .addComponent(tfAndraNamn))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNamn)
                                            .addComponent(btnTelefon)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAndraOmrade))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(25, 25, 25)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAndraInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVemAndra)
                    .addComponent(tfVemAndra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAndraNamn)
                    .addComponent(tfAndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAndraTelefon)
                    .addComponent(tfAndraTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAndraAnsvarigAgent)
                    .addComponent(tfAndraOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraOmrade))
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod för att andra namn på en agent.
    private void btnNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamnActionPerformed
if (Validering.textFaltHarVarde(tfVemAndra)){
        try{

            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            String vilkenAgent = tfVemAndra.getText();
            String nyttNamn = tfAndraNamn.getText();

            String fraga = "update agent set namn ='" + nyttNamn + "'where namn= '" + vilkenAgent+"'";
            idb.update(fraga);
            JOptionPane.showMessageDialog(null, "Namnet är ändrat");
        }

        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
}   
    }//GEN-LAST:event_btnNamnActionPerformed
    //Metod för att andra telefonnummer på en agent.
    private void btnTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonActionPerformed
        try{

            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            String vilkenAgent = tfVemAndra.getText();
            String nyttTelefonnummer = tfAndraTelefon.getText();

            String fraga = "update agent set telefon ='" + nyttTelefonnummer + "'where namn= '" + vilkenAgent+"'";
            idb.update(fraga);
            JOptionPane.showMessageDialog(null, "Telefonnumret är ändrat");
        }

        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_btnTelefonActionPerformed
    //Metod för att andra område på en agent.
    private void btnAndraOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOmradeActionPerformed
        try{

            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            String vilkenAgent = tfVemAndra.getText();
            String vilketomrade = tfAndraOmrade.getText();
            

            String fraga = "update agent set omrade='" + vilketomrade + "'where namn= '" + vilkenAgent+"'";
            idb.update(fraga);
            JOptionPane.showMessageDialog(null, "Området är ändrat");
        }

        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_btnAndraOmradeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminÄndraAdminstatus().setVisible(rootPaneCheckingEnabled); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgentÄndraInformationOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentÄndraInformationOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentÄndraInformationOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentÄndraInformationOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentÄndraInformationOmAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraOmrade;
    private javax.swing.JButton btnNamn;
    private javax.swing.JButton btnTelefon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlAndraAnsvarigAgent;
    private javax.swing.JLabel jlAndraInfo;
    private javax.swing.JLabel jlAndraNamn;
    private javax.swing.JLabel jlAndraTelefon;
    private javax.swing.JLabel jlVemAndra;
    private javax.swing.JTextField tfAndraNamn;
    private javax.swing.JTextField tfAndraOmrade;
    private javax.swing.JTextField tfAndraTelefon;
    private javax.swing.JTextField tfVemAndra;
    // End of variables declaration//GEN-END:variables
}
