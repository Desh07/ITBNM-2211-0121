
package familymart2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Billing extends javax.swing.JFrame {

   
    public Billing() {
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

    /**
     *
     */
    int PrId, newQty;
    public void update()
    {        
        newQty = AvQty - Integer.valueOf(PrQty.getText());
            try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
            String Query = "UPDATE producttb1 SET Qty="+newQty+""+" WHERE pID="+PrId;
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            //JOptionPane.showMessageDialog(this, "Product updated Successfully");
            SelectProduct();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PrCatCb = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        PrQty = new javax.swing.JTextField();
        PrName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrTb = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        GrdTotLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("BILL ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));
        jPanel2.add(BillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 110, 217, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BILLING");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 174, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 238, -1, -1));

        PrCatCb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PrCatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrCatCbMouseClicked(evt);
            }
        });
        PrCatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrCatCbActionPerformed(evt);
            }
        });
        jPanel2.add(PrCatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 78, 158, -1));

        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setText("ADD TO BILL");
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
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 296, -1, -1));

        ClearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jPanel2.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 296, -1, -1));

        RefreshBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RefreshBtn.setText("REFRESH");
        RefreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshBtnMouseClicked(evt);
            }
        });
        jPanel2.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 79, -1, -1));

        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditBtn.setText("PRINT");
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
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 568, -1, -1));

        PrQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrQtyActionPerformed(evt);
            }
        });
        jPanel2.add(PrQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 237, 217, 25));
        jPanel2.add(PrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 174, 217, 25));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 118, 544, 203));

        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 339, 544, 169));

        jButton2.setText("LOGOUT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 564, 214, 35));

        GrdTotLbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        GrdTotLbl.setText("RS");
        jPanel2.add(GrdTotLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 515, -1, -1));

        jButton1.setText("FILTER");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart2/Icons/07473e8e-06e1-4263-be51-3124a696ac57.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -320, 1120, 950));

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

    private void PrCatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrCatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrCatCbActionPerformed
int i = 0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(PrName.getText().isEmpty() || PrQty.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing information");
        }
        else if(AvQty <= Integer.valueOf(PrQty.getText()))
        {
            JOptionPane.showMessageDialog(this,"Required quantity unavailable !!");
        }
        else
        {
          i++;
          PrTotal = UnitPrice * Double.valueOf(PrQty.getText());
          GrdTotal = GrdTotal + PrTotal;
            if(i == 1)
            {    
                BillTxt.setText(BillTxt.getText()+"\t           ************** FAMILY MART **************\n\n"+" NUM     PRODUCT     PRICE     QUANTITY     TOTAL\n"+i+"             "+PrName.getText()+"             "+UnitPrice+"             "+PrQty.getText()+"             "+PrTotal+"\n");
            }else
            {
                BillTxt.setText(BillTxt.getText()+i+"             "+PrName.getText()+"             "+UnitPrice+"             "+PrQty.getText()+"             "+PrTotal+"\n");
            }
            GrdTotLbl.setText("Rs "+GrdTotal);
            update();
        }
            
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        BillId.setText("");
        PrName.setText("");
        PrQty.setText("");
        //PrPrice.setText("");
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void RefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshBtnMouseClicked
        SelectProduct();
    }//GEN-LAST:event_RefreshBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        try{
            BillTxt.print();
        } catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void PrQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrQtyActionPerformed
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
    
    Double UnitPrice, PrTotal=0.0, GrdTotal=0.0;
    int AvQty;
    private void PrTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrTbMouseClicked
        DefaultTableModel model = (DefaultTableModel)PrTb.getModel();
        int Myindex = PrTb.getSelectedRow();
        PrId = Integer.valueOf(model.getValueAt(Myindex, 0).toString()); 
        AvQty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        
        UnitPrice = Double.valueOf(model.getValueAt(Myindex, 3).toString());
        PrName.setText(model.getValueAt(Myindex, 1).toString());
        
        //PrQty.setText(model.getValueAt(Myindex, 2).toString());
        //PrPrice.setText(model.getValueAt(Myindex, 3).toString());
        
    }//GEN-LAST:event_PrTbMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        BillId.setText("");
        PrName.setText("");
        PrQty.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void PrCatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrCatCbMouseClicked
        
    }//GEN-LAST:event_PrCatCbMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{ 
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fmdb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from Category WHERE CatName='"+PrCatCb.getSelectedItem().toString()+"'");
        PrTb.setModel(DbUtils.resultSetToTableModel(Rs));
      } catch (SQLException ex) 
      {
          ex.printStackTrace();
      }
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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel GrdTotLbl;
    private javax.swing.JComboBox<String> PrCatCb;
    private javax.swing.JTextField PrName;
    private javax.swing.JTextField PrQty;
    private javax.swing.JTable PrTb;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
