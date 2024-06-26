/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm;

import dao.BillDao;
import dao.CategoryDao;
import dao.ProductDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Category;
import model.Product;

/**
 *
 * @author AKLakshan
 */
public class Order extends javax.swing.JFrame {
    public int billId = 1;
    public int finalTotal = 0;
    public int productPrice = 0;
    public int productTotal = 0;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public String userEmail;
    

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
    }
    
    public Order(String email) {
        initComponents();
        proNameTb.setEditable(false);
        priceTb.setEditable(false);
        totTb.setEditable(false);
        addBtn.setEnabled(false);
        printBtn.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField();
        tf.setEnabled(false);
        userEmail = email;
        
    }
    
    public void productNameByCategory(String category){
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.getAllRecordsByCategory(category);
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()){
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        }
        
    }
    
        public void filterProductByName(String name,String category){
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterProductByName(name, category);
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()){
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        }
        
    }
    
    public void clearProductFields(){
            proNameTb.setText("");
            priceTb.setText("");
            spinner.setValue(1);
            totTb.setText("");
            addBtn.setEnabled(false);
            
        }
        
        public void validateFields(){
            String customerName = cusNameTb.getText();
            String customerMobileNumber = mobTb.getText();
            String customerEmail = emailTb.getText();
            if(!customerEmail.equals("") && customerMobileNumber.matches(mobileNumberPattern) && customerMobileNumber.length()==10 && customerEmail.matches(emailPattern)&& finalTotal > 0){
                printBtn.setEnabled(true);
        }
            else{
                printBtn.setEnabled(false);
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cusNameTb = new javax.swing.JTextField();
        mobTb = new javax.swing.JTextField();
        emailTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        proNameTb = new javax.swing.JTextField();
        priceTb = new javax.swing.JTextField();
        totTb = new javax.swing.JTextField();
        catCb = new javax.swing.JComboBox<>();
        searchTb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        clrBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        totLbl = new javax.swing.JLabel();
        printBtn = new javax.swing.JButton();
        spinner = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(190, 134));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-35 (1).png"))); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 673, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-35.png"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("BILL ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 262, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("MOBILE NUMBER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 315, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("EMAIL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 368, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("00");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 34, -1));

        cusNameTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusNameTb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cusNameTbKeyReleased(evt);
            }
        });
        jPanel1.add(cusNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 259, 199, -1));

        mobTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mobTb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobTbKeyReleased(evt);
            }
        });
        jPanel1.add(mobTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 309, 199, -1));

        emailTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        emailTb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTbKeyReleased(evt);
            }
        });
        jPanel1.add(emailTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 362, 199, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CUSTOMER DETAILS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 195, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("CATEGORY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 179, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("SEARCH");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 226, -1, -1));

        searchTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 269, 254, 327));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("NAME");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 179, 40, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("QUANTITY");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 226, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("PRICE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 178, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("TOTAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 224, -1, -1));

        proNameTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(proNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 176, 165, -1));

        priceTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(priceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1188, 175, 160, -1));

        totTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(totTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1188, 221, 160, -1));

        catCb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        catCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catCbActionPerformed(evt);
            }
        });
        jPanel1.add(catCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 175, 146, -1));

        searchTb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchTb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTbKeyReleased(evt);
            }
        });
        jPanel1.add(searchTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 223, 146, -1));

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "QUANTITY", "PRICE", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(billTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 356, 529, 240));

        clrBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clrBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-clear-35.png"))); // NOI18N
        clrBtn.setText("CLEAR");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 276, 165, -1));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-to-cart-35.png"))); // NOI18N
        addBtn.setText("ADD TO CART");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1141, 276, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("FINAL TOTAL: Rs.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 628, -1, 28));

        totLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totLbl.setText("00");
        jPanel1.add(totLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 634, 86, -1));

        printBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-print-35.png"))); // NOI18N
        printBtn.setText("PRINT BILL");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        jPanel1.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1167, 623, 181, 39));

        spinner.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });
        jPanel1.add(spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 223, 165, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PLACE ORDER.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        billId = Integer.parseInt(BillDao.getId());
        jLabel6.setText(BillDao.getId());
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while(itr.hasNext()){
            Category categoryObj = itr.next();
            catCb.addItem(categoryObj.getName());
            
        }   
            String category = (String) catCb.getSelectedItem();
            productNameByCategory(category);
        
    }//GEN-LAST:event_formComponentShown

    private void searchTbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTbKeyReleased
        String name = searchTb.getText();
        String category = (String) catCb.getSelectedItem();
        filterProductByName (name, category);
        
    }//GEN-LAST:event_searchTbKeyReleased

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        int index = searchTable.getSelectedRow();
        TableModel  model = searchTable.getModel();
        String productName = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByName(productName);
        proNameTb.setText(product.getName());
        priceTb.setText(product.getPrice());
        spinner.setValue(1);
        totTb.setText(product.getPrice());
        productPrice = Integer.parseInt(product.getPrice());
        productTotal = Integer.parseInt(product.getPrice());
        addBtn.setEnabled(true);
        
    }//GEN-LAST:event_searchTableMouseClicked

    private void catCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catCbActionPerformed
        String category =(String) catCb.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_catCbActionPerformed

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        int quantity = (Integer) spinner.getValue();
        if(quantity <=1){
            spinner.setValue(1);
            quantity = 1;
            
        }
        productTotal = productPrice * quantity;
        totTb.setText(String.valueOf(productTotal));
        
    }//GEN-LAST:event_spinnerStateChanged

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String name = proNameTb.getText();
        String price = priceTb.getText();
        String quantity = String.valueOf(spinner.getValue());
        DefaultTableModel dtm = (DefaultTableModel) billTable.getModel();
        dtm.addRow(new Object[]{name,price,quantity,productTotal});
        finalTotal = finalTotal + productTotal;
        totLbl.setText(String.valueOf(finalTotal));
        
        clearProductFields();
        validateFields();
    }//GEN-LAST:event_addBtnActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        clearProductFields();
    }//GEN-LAST:event_clrBtnActionPerformed

    private void cusNameTbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusNameTbKeyReleased
        validateFields();
    }//GEN-LAST:event_cusNameTbKeyReleased

    private void mobTbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobTbKeyReleased
        validateFields();
    }//GEN-LAST:event_mobTbKeyReleased

    private void emailTbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTbKeyReleased
        validateFields();
    }//GEN-LAST:event_emailTbKeyReleased

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        
       
    }//GEN-LAST:event_printBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable billTable;
    private javax.swing.JComboBox<String> catCb;
    private javax.swing.JButton clrBtn;
    private javax.swing.JTextField cusNameTb;
    private javax.swing.JTextField emailTb;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mobTb;
    private javax.swing.JTextField priceTb;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextField proNameTb;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchTb;
    private javax.swing.JSpinner spinner;
    private javax.swing.JLabel totLbl;
    private javax.swing.JTextField totTb;
    // End of variables declaration//GEN-END:variables
}
