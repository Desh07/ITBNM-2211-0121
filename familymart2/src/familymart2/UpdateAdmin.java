/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familymart2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deshanth
 */
public class UpdateAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAdmin
     */
    public UpdateAdmin() {
        initComponents();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AdminPass = new javax.swing.JTextField();
        UpBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        AdminTb1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("HOME");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE ADMIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 43, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ADMIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 157, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 221, -1, -1));
        jPanel1.add(AdminPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 221, 201, 30));

        UpBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        UpBtn.setText("UPDATE");
        UpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        ClrBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));
        jPanel1.add(AdminTb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 162, 201, 30));

        jButton2.setText("BACK TO HOMEPAGE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 433, 214, 35));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart2/Icons/pixlr-image-generator-96691d73-0f5d-4cf0-85af-fae88435623a.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-490, -450, 990, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        AdminTb1.setText("");
        AdminPass.setText("");
    }//GEN-LAST:event_ClrBtnMouseClicked

    private void UpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpBtnMouseClicked
         if(AdminTb1.getText().isEmpty() || AdminPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else
        {
            try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            String Query = "UPDATE admintb SET AdminName='" + AdminTb1.getText()+"'"+",AdminPass='"+AdminPass.getText()+"'"+"WHERE AdId="+1;
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Password updated Successfully");
            
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpBtnMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new Homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminPass;
    private javax.swing.JTextField AdminTb1;
    private javax.swing.JButton ClrBtn;
    private javax.swing.JButton UpBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
