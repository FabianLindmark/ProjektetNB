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
public class AdminTaBortAlien extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form AdminTaBortAlien
     */
    public AdminTaBortAlien() {
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

        jlTaBortAlienNamn = new javax.swing.JLabel();
        jlTaBortAlien = new javax.swing.JLabel();
        tfAlienNamn = new javax.swing.JTextField();
        btnTaBortAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTaBortAlienNamn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jlTaBortAlienNamn.setText("Namn:");

        jlTaBortAlien.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jlTaBortAlien.setText("Ta bort alien:");

        tfAlienNamn.setColumns(6);

        btnTaBortAlien.setText("Ta bort alien");
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTaBortAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTaBortAlienNamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlTaBortAlien)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTaBortAlienNamn)
                    .addComponent(tfAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnTaBortAlien)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed
         
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
             String namn = tfAlienNamn.getText();
            
             String fraga = "SELECT FROM ALIEN WHERE NAMN= '" + namn +"'";
             

             
             ArrayList<String> taBortAlien = idb.fetchColumn(fraga);
                    
            for(String alien : taBortAlien){
                
                if (alien.contains(namn)){
                
                    idb.delete(fraga);
                    break;
                    
                }
               // String vilkenAlien = "delete from alien where namn = '"+alien+"'";
            }
             
            JOptionPane.showMessageDialog(null, "Alien är nu raderad");
         }
         
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Något gick fel!"); 
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
         }
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

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
            java.util.logging.Logger.getLogger(AdminTaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaBortAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JLabel jlTaBortAlien;
    private javax.swing.JLabel jlTaBortAlienNamn;
    private javax.swing.JTextField tfAlienNamn;
    // End of variables declaration//GEN-END:variables
}
