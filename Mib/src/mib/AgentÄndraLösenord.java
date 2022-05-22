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
public class AgentÄndraLösenord extends javax.swing.JFrame {
    
    private InfDB idb;
    
    
    /**
     * Creates new form AgentÄndraLösenord
     */
    public AgentÄndraLösenord() {
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

        jlAgAndraLosenord = new javax.swing.JLabel();
        jlAgAnvandarnamn = new javax.swing.JLabel();
        jlAgNuvarandeLosenord = new javax.swing.JLabel();
        jlAgNyttLosenord = new javax.swing.JLabel();
        jlAgUpprepaLosenord = new javax.swing.JLabel();
        tfAngeAnvandarnamn = new javax.swing.JTextField();
        tfAngeNuvarandeLosenord = new javax.swing.JTextField();
        tfAngeNyttLosenord = new javax.swing.JTextField();
        tfAngeUpprepaLosenord = new javax.swing.JTextField();
        jlAgUppdateraLosenord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlAgAndraLosenord.setText("Ändra ditt lösenord");

        jlAgAnvandarnamn.setText("Användarnamn:");

        jlAgNuvarandeLosenord.setText("Nuvarande lösenord:");

        jlAgNyttLosenord.setText("Nytt lösenord:");

        jlAgUpprepaLosenord.setText("Upprepa lösenord:");

        tfAngeAnvandarnamn.setColumns(6);

        tfAngeNuvarandeLosenord.setColumns(6);

        tfAngeNyttLosenord.setColumns(6);
        tfAngeNyttLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAngeNyttLosenordActionPerformed(evt);
            }
        });

        tfAngeUpprepaLosenord.setColumns(6);

        jlAgUppdateraLosenord.setText("Upptadeta Lösenord");
        jlAgUppdateraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlAgUppdateraLosenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAgUppdateraLosenord)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlAgAndraLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlAgAnvandarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jlAgNuvarandeLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAgNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAgUpprepaLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfAngeNuvarandeLosenord)
                            .addComponent(tfAngeAnvandarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(tfAngeNyttLosenord)
                            .addComponent(tfAngeUpprepaLosenord))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlAgAndraLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAgAnvandarnamn)
                    .addComponent(tfAngeAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAgNuvarandeLosenord)
                    .addComponent(tfAngeNuvarandeLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAgNyttLosenord)
                    .addComponent(tfAngeNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAgUpprepaLosenord)
                    .addComponent(tfAngeUpprepaLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlAgUppdateraLosenord)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAngeNyttLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAngeNyttLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAngeNyttLosenordActionPerformed

    private void jlAgUppdateraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlAgUppdateraLosenordActionPerformed
         try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        
            Boolean jlAgUppdateraLosenord = false;
            String anvandarnamn = tfAngeAnvandarnamn.getText();
            String nuLosen = tfAngeNuvarandeLosenord.getText();
            String nyttLosen = tfAngeNyttLosenord.getText();
            String upprepaLosen = tfAngeUpprepaLosenord.getText();
            String question = "select Losenord from Agent where Agent_ID=" + anvandarnamn;
            String answer = idb.fetchSingle(question);
        
            String fraga = "update agent set Losenord='" + nyttLosen + "'where Agent_ID=" + anvandarnamn;
        
        if(nuLosen.equals(answer))
        {
            idb.update(fraga);
            jlAgUppdateraLosenord = true;
            JOptionPane.showMessageDialog(null, "Ditt lösenord är nu ändrat");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dina uppgifter är felaktiga");
        }
            
        }
    
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!"); 
            
                // TODO add your handling code here:
    }//GEN-LAST:event_jlAgUppdateraLosenordActionPerformed
    }
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
            java.util.logging.Logger.getLogger(AgentÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentÄndraLösenord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlAgAndraLosenord;
    private javax.swing.JLabel jlAgAnvandarnamn;
    private javax.swing.JLabel jlAgNuvarandeLosenord;
    private javax.swing.JLabel jlAgNyttLosenord;
    private javax.swing.JButton jlAgUppdateraLosenord;
    private javax.swing.JLabel jlAgUpprepaLosenord;
    private javax.swing.JTextField tfAngeAnvandarnamn;
    private javax.swing.JTextField tfAngeNuvarandeLosenord;
    private javax.swing.JTextField tfAngeNyttLosenord;
    private javax.swing.JTextField tfAngeUpprepaLosenord;
    // End of variables declaration//GEN-END:variables
}
