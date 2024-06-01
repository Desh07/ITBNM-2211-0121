
package familymart2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Category extends javax.swing.JFrame {

    
    public Category() {
        initComponents();
        SelectCategory();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    public void SelectCategory()
    {
      try{ 
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from category");
        CatTb.setModel(DbUtils.resultSetToTableModel(Rs));
      } catch (SQLException ex) 
      {
          ex.printStackTrace();
      }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CatId = new javax.swing.JTextField();
        CatName = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        DltBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CatTb = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CATEGORY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 34, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CatID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 171, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 267, -1, -1));
        jPanel2.add(CatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 166, 235, 30));
        jPanel2.add(CatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 262, 235, 30));

        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 370, -1, -1));

        DltBtn.setText("DELETE");
        DltBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DltBtnMouseClicked(evt);
            }
        });
        jPanel2.add(DltBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

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
        jPanel2.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 370, -1, -1));

        CatTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CatID", "NAME"
            }
        ));
        CatTb.setRowHeight(20);
        CatTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CatTb);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 97, -1, -1));

        jButton2.setText("BACK TO HOMEPAGE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 214, 35));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart2/Icons/07473e8e-06e1-4263-be51-3124a696ac57.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, -420, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(CatId.getText().isEmpty() || CatName.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Enter all fields."); 
        }else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            PreparedStatement add = Con.prepareStatement("Insert into category values (?,?)");
            add.setInt(1, Integer.valueOf(CatId.getText()));
            add.setString(2, CatName.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category added successfully.");
            Con.close();
            SelectCategory();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        CatId.setText("");
        CatName.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DltBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DltBtnMouseClicked
        if(CatId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select the category to be deleted.");
        }else{
            Connection Con = null;
            PreparedStatement Pst = null;
              try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
                String CId = CatId.getText();
                String Query = "DELETE FROM fmdb.category WHERE CatId="+CId;
                Statement Add = Con.createStatement();
                int executeUpdate = Add.executeUpdate(Query);
                SelectCategory();
                JOptionPane.showMessageDialog(this, "Category deleted successfully.");
              }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
             }
    }//GEN-LAST:event_DltBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
         if(CatId.getText().isEmpty() || CatName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else
        {
            try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            String Query = "UPDATE category SET CatName='" + CatName.getText()+"'"+"WHERE CatId="+CatId.getText();
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Category updated Successfully");
            SelectCategory();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void CatTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatTbMouseClicked
        DefaultTableModel model = (DefaultTableModel)CatTb.getModel();
        int Myindex = CatTb.getSelectedRow();
        CatId.setText(model.getValueAt(Myindex, 0).toString());
        CatName.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_CatTbMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CatId;
    private javax.swing.JTextField CatName;
    private javax.swing.JTable CatTb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DltBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
