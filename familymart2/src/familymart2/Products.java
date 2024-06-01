/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Deshanth
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        SelectProduct();
        GetCat();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    public void SelectProduct()
    {
      try{ 
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from producttb1");
        PrTb.setModel(DbUtils.resultSetToTableModel(Rs));
      } catch (SQLException ex) 
      {
          ex.printStackTrace();
      }
    }
    
private void GetCat()
{        
    try{ 
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
        St = Con.createStatement();
        String query = "Select * from category";
        Rs = St.executeQuery(query);
        while(Rs.next())
        {
            String Mycat = Rs.getString("CatName");
            PrCatCb.addItem(Mycat);
        }
    } catch (SQLException ex) 
    {
          ex.printStackTrace();
    }   
}           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PrCatCb = new javax.swing.JComboBox<>();
        PrId = new javax.swing.JTextField();
        PrName = new javax.swing.JTextField();
        PrQty = new javax.swing.JTextField();
        PrPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrTb = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DltBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 175, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 238, -1, -1));

        PrCatCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PrCatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrCatCbActionPerformed(evt);
            }
        });
        getContentPane().add(PrCatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 356, -1, -1));
        getContentPane().add(PrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 110, 217, 25));
        getContentPane().add(PrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 174, 217, 25));

        PrQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrQtyActionPerformed(evt);
            }
        });
        getContentPane().add(PrQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 237, 217, 25));

        PrPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrPriceActionPerformed(evt);
            }
        });
        getContentPane().add(PrPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 295, 217, 25));

        PrTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATERGORY"
            }
        ));
        PrTb.setRowHeight(20);
        PrTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PrTb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 94, 572, 384));

        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 414, -1, -1));

        ClearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearBtn.setText("CLEAR");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 457, -1, -1));

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 414, -1, -1));

        DltBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DltBtn.setText("DELETE");
        DltBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DltBtnMouseClicked(evt);
            }
        });
        getContentPane().add(DltBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 457, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("CATEGORY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 359, -1, -1));

        jButton1.setText("BACK TO HOMEPAGE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 548, 214, 35));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart2/Icons/07473e8e-06e1-4263-be51-3124a696ac57.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -200, 1360, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrCatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrCatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrCatCbActionPerformed

    private void PrQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrQtyActionPerformed

    private void PrPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrPriceActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(PrId.getText().isEmpty() || PrName.getText().isEmpty() || PrQty.getText().isEmpty() || PrPrice.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Enter all fields."); 
        }else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            PreparedStatement add = Con.prepareStatement("Insert into producttb1 values (?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(PrId.getText()));
            add.setString(2, PrName.getText());
            add.setInt(3, Integer.valueOf(PrQty.getText()));
            add.setInt(4, Integer.valueOf(PrPrice.getText()));
            add.setString(5, PrCatCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added successfully.");
            Con.close();
            SelectProduct();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        PrId.setText("");
        PrName.setText("");
        PrQty.setText("");
        PrPrice.setText("");
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void DltBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DltBtnMouseClicked
         if(PrId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select the Product to be deleted.");
        }else{
            Connection Con = null;
            PreparedStatement Pst = null;
              try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
                String productId = PrId.getText();
                String Query = "DELETE FROM fmdb.producttb1 WHERE PId="+productId;
                Statement Add = Con.createStatement();
                int executeUpdate = Add.executeUpdate(Query);
                SelectProduct();
                JOptionPane.showMessageDialog(this, "Product deleted successfully.");
              }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
             }
    }//GEN-LAST:event_DltBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(PrId.getText().isEmpty() || PrName.getText().isEmpty() || PrQty.getText().isEmpty() || PrPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else
        {
            try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            String Query = "UPDATE producttb1 SET PName='" + PrName.getText() + "', Qty='" + PrQty.getText() + "', Price='" + PrPrice.getText() + "', category='" + PrCatCb.getSelectedItem().toString() + "' WHERE pId=" + PrId.getText();
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Product updated Successfully");
            SelectProduct();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void PrTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrTbMouseClicked
        DefaultTableModel model = (DefaultTableModel)PrTb.getModel();
        int Myindex = PrTb.getSelectedRow();
        PrId.setText(model.getValueAt(Myindex, 0).toString());
        PrName.setText(model.getValueAt(Myindex, 1).toString());
        PrQty.setText(model.getValueAt(Myindex, 2).toString());
        PrPrice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_PrTbMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DltBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> PrCatCb;
    private javax.swing.JTextField PrId;
    private javax.swing.JTextField PrName;
    private javax.swing.JTextField PrPrice;
    private javax.swing.JTextField PrQty;
    private javax.swing.JTable PrTb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
