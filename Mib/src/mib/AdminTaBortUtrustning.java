/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

/**
 *
 * @author ellenportugues
 */
public class AdminTaBortUtrustning extends javax.swing.JFrame {

    /**
     * Creates new form AdminTaBortUtrustning
     */
    public AdminTaBortUtrustning() {
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

        jlTaBortUtrust = new javax.swing.JLabel();
        jlTaBortUtrustNamn = new javax.swing.JLabel();
        tfUtrustNamn = new javax.swing.JTextField();
        btnTaBortUtrust = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTaBortUtrust.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jlTaBortUtrust.setText("Ta bort utrustning:");

        jlTaBortUtrustNamn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jlTaBortUtrustNamn.setText("Benämning:");

        tfUtrustNamn.setColumns(6);
        tfUtrustNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUtrustNamnActionPerformed(evt);
            }
        });

        btnTaBortUtrust.setText("Ta bort utrustning");
        btnTaBortUtrust.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                btnTaBortUtrustComponentRemoved(evt);
            }
        });
        btnTaBortUtrust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTaBortUtrustNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfUtrustNamn))
                    .addComponent(jlTaBortUtrust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaBortUtrust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlTaBortUtrust)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTaBortUtrustNamn)
                    .addComponent(tfUtrustNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnTaBortUtrust)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUtrustNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUtrustNamnActionPerformed

    }//GEN-LAST:event_tfUtrustNamnActionPerformed

    private void btnTaBortUtrustComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btnTaBortUtrustComponentRemoved

    }//GEN-LAST:event_btnTaBortUtrustComponentRemoved

    private void btnTaBortUtrustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrustActionPerformed

        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            String fraga1 = "SELECT * FROM alien";
            String fraga2 = "ALTER TABLE alien DROP PRIMARY KEY";
            String fraga3 = "DELETE FROM alien" + "WHERE alien.namn = " + tfUtrustNamn;

            idb.delete(fraga3);

            JOptionPane.showMessageDialog(null, "Alien är nu raderad");
        }

        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_btnTaBortUtrustActionPerformed

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
            java.util.logging.Logger.getLogger(AdminTaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaBortUtrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBortUtrust;
    private javax.swing.JLabel jlTaBortUtrust;
    private javax.swing.JLabel jlTaBortUtrustNamn;
    private javax.swing.JTextField tfUtrustNamn;
    // End of variables declaration//GEN-END:variables
}
