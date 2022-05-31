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
public class AlienÄndraLösenord extends javax.swing.JFrame {
 private InfDB idb;
    /**
     * Creates new form AlienÄndraLösenord
     */
    public AlienÄndraLösenord() {
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

        jlAlUppdateraLosenord = new javax.swing.JButton();
        jlAgUpprepaLosenord = new javax.swing.JLabel();
        jlAgNyttLosenord = new javax.swing.JLabel();
        jlAgNuvarandeLosenord = new javax.swing.JLabel();
        jlAgAnvandarnamn = new javax.swing.JLabel();
        jlAgAndraLosenord = new javax.swing.JLabel();
        tfAngeNyttLosenord = new javax.swing.JTextField();
        tfAngeUpprepaLosenord = new javax.swing.JTextField();
        tfAngeNuvarandeLosenord = new javax.swing.JTextField();
        tfAngeAnvandarnamn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlAlUppdateraLosenord.setText("Uppdatera Lösenord");
        jlAlUppdateraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlAlUppdateraLosenordActionPerformed(evt);
            }
        });

        jlAgUpprepaLosenord.setText("Upprepa lösenord:");

        jlAgNyttLosenord.setText("Nytt lösenord:");

        jlAgNuvarandeLosenord.setText("Nuvarande lösenord:");

        jlAgAnvandarnamn.setText("Användarnamn:");

        jlAgAndraLosenord.setText("Ändra ditt lösenord");

        tfAngeNyttLosenord.setColumns(6);
        tfAngeNyttLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAngeNyttLosenordActionPerformed(evt);
            }
        });

        tfAngeUpprepaLosenord.setColumns(6);

        tfAngeNuvarandeLosenord.setColumns(6);

        tfAngeAnvandarnamn.setColumns(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAgAnvandarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addGap(236, 236, 236))
                    .addComponent(jlAgAndraLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAgNuvarandeLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlAgNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAngeAnvandarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(tfAngeNuvarandeLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(tfAngeNyttLosenord, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jlAlUppdateraLosenord)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAgUpprepaLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfAngeUpprepaLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlAgAndraLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
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
                .addComponent(jlAlUppdateraLosenord)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod för en alien att ändra sitt lösenord.
    private void jlAlUppdateraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlAlUppdateraLosenordActionPerformed
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            Boolean jlAlUppdateraLosenord = false;
            String anvandarnamn = tfAngeAnvandarnamn.getText();
            String nuLosen = tfAngeNuvarandeLosenord.getText();
            String nyttLosen = tfAngeNyttLosenord.getText();
            String upprepaLosen = tfAngeUpprepaLosenord.getText();
            String question = "select Losenord from Alien where Alien_ID=" + anvandarnamn;
            String answer = idb.fetchSingle(question);

            String fraga = "update alien set Losenord='" + nyttLosen + "'where Alien_ID=" + anvandarnamn;

            if(nuLosen.equals(answer))
            {
                idb.update(fraga);
                jlAlUppdateraLosenord = true;
                 JOptionPane.showMessageDialog(null, "Ditt lösenord är nu ändrat");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dina uppgifter är felaktiga");
        }
            
        }
    
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!"); 
        }
    }//GEN-LAST:event_jlAlUppdateraLosenordActionPerformed

    private void tfAngeNyttLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAngeNyttLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAngeNyttLosenordActionPerformed

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
            java.util.logging.Logger.getLogger(AlienÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienÄndraLösenord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlAgAndraLosenord;
    private javax.swing.JLabel jlAgAnvandarnamn;
    private javax.swing.JLabel jlAgNuvarandeLosenord;
    private javax.swing.JLabel jlAgNyttLosenord;
    private javax.swing.JLabel jlAgUpprepaLosenord;
    private javax.swing.JButton jlAlUppdateraLosenord;
    private javax.swing.JTextField tfAngeAnvandarnamn;
    private javax.swing.JTextField tfAngeNuvarandeLosenord;
    private javax.swing.JTextField tfAngeNyttLosenord;
    private javax.swing.JTextField tfAngeUpprepaLosenord;
    // End of variables declaration//GEN-END:variables
}
