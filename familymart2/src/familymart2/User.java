
package familymart2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class User extends javax.swing.JFrame {

    
    public User() {
        initComponents();
        SelectUser();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    public void SelectUser()
    {
      try{ 
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from userTb1");
        userTb.setModel(DbUtils.resultSetToTableModel(Rs));
      } catch (SQLException ex) 
      {
          ex.printStackTrace();
      }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genderCb = new javax.swing.JComboBox<>();
        uId = new javax.swing.JTextField();
        uName = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DltBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        uPass = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("BACK TO HOMEPAGE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 38, -1, -1));

        userTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "USER ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        userTb.setRowHeight(20);
        userTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 104, -1, 415));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("USER ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 129, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 202, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 281, -1, -1));

        genderCb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        genderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCbActionPerformed(evt);
            }
        });
        jPanel1.add(genderCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 347, -1, -1));

        uId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uIdActionPerformed(evt);
            }
        });
        jPanel1.add(uId, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 121, 235, 30));

        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });
        jPanel1.add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 197, 235, 30));

        addBtn.setText("ADD");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 423, -1, -1));

        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        jPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 423, -1, -1));

        DltBtn.setText("DELETE");
        DltBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DltBtnMouseClicked(evt);
            }
        });
        DltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DltBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DltBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 466, -1, -1));

        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 466, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("GENDER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        uPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uPassActionPerformed(evt);
            }
        });
        jPanel1.add(uPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 281, 235, 30));

        jButton2.setText("BACK TO HOMEPAGE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 546, 214, 35));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart2/Icons/07473e8e-06e1-4263-be51-3124a696ac57.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -400, -1, -1));

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

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void uIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uIdActionPerformed

    private void genderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCbActionPerformed

    private void DltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DltBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DltBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(uId.getText().isEmpty() || uName.getText().isEmpty() || uPass.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Enter all fields."); 
        }else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            PreparedStatement add = Con.prepareStatement("Insert into usertb1 values (?,?,?,?)");
            add.setInt(1, Integer.valueOf(uId.getText()));
            add.setString(2, uName.getText());
            add.setString(3, uPass.getText());
            add.setString(4, genderCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "User added successfully.");
            Con.close();
            SelectUser();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked

    }//GEN-LAST:event_addBtnMouseClicked

    private void uPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uPassActionPerformed

    private void userTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTbMouseClicked
        DefaultTableModel model = (DefaultTableModel)userTb.getModel();
        int Myindex = userTb.getSelectedRow();
        uId.setText(model.getValueAt(Myindex, 0).toString());
        uName.setText(model.getValueAt(Myindex, 1).toString());
        uPass.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_userTbMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        uId.setText("");
        uName.setText("");
        uPass.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DltBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DltBtnMouseClicked
        if(uId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select the user to be deleted.");
        }else{
            Connection Con = null;
            PreparedStatement Pst = null;
              try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
                String userId = uId.getText();
                String Query = "DELETE FROM fmdb.usertb1 WHERE uId="+userId;
                Statement Add = Con.createStatement();
                int executeUpdate = Add.executeUpdate(Query);
                SelectUser();
                JOptionPane.showMessageDialog(this, "User deleted successfully.");
              }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
             }
    }//GEN-LAST:event_DltBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(uId.getText().isEmpty() || uName.getText().isEmpty() || uPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else
        {
            try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            String Query = "UPDATE usertb1 SET uName='" + uName.getText() + "', Password='" + uPass.getText() + "', Gender='" + genderCb.getSelectedItem().toString() + "' WHERE uId=" + uId.getText();
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "User updated Successfully");
            SelectUser();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DltBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> genderCb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField uId;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPass;
    private javax.swing.JTable userTb;
    // End of variables declaration//GEN-END:variables
}
