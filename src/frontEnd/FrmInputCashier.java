/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontEnd;
import backEnd.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Database;
/**
 *
 * @author HP
 */
public class FrmInputCashier extends javax.swing.JFrame {

    /**
     * Creates new form FrmInputCashier
     */
    public FrmInputCashier() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    
    public void kosongkanForm(){
        txtCashierId.setText("0");
        txtCashierName.setText("");
        txtPassword.setText("");
    }
    
    public void tampilkanData(){
        String[] coloumn = {"Cashier ID", "Cashier Name", "Password"};
        ArrayList<Cashier> list = new Cashier().getAll();
        Object rowData[] = new Object[3];
        
        tblCashierData.setModel(new DefaultTableModel(new Object[][] {}, coloumn));
        for(Cashier cash : list){
            rowData[0] = cash.getId();
            rowData[1] = cash.getNama();
            rowData[2] = cash.getPassword();
            
            ((DefaultTableModel)tblCashierData.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] coloumn = {"Cashier ID", "Cashier Name", "Password"};
        ArrayList<Cashier> list = new Cashier().search(keyword);
        Object rowData[] = new Object[3];
        
        tblCashierData.setModel(new DefaultTableModel(new Object[][] {}, coloumn));
        for(Cashier cash : list){
            rowData[0] = cash.getId();
            rowData[1] = cash.getNama();
            rowData[2] = cash.getPassword();
            
            ((DefaultTableModel)tblCashierData.getModel()).addRow(rowData);
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbCashierData = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        lbCashierId = new javax.swing.JLabel();
        lbCashierName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCashierData = new javax.swing.JTable();
        txtCashierId = new javax.swing.JTextField();
        txtCashierName = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 164, 164));

        lbCashierData.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        lbCashierData.setForeground(new java.awt.Color(255, 255, 255));
        lbCashierData.setText("CASHIER DATA");

        btnHome.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lbCashierId.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        lbCashierId.setForeground(new java.awt.Color(255, 255, 255));
        lbCashierId.setText("Cashier ID");

        lbCashierName.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        lbCashierName.setForeground(new java.awt.Color(255, 255, 255));
        lbCashierName.setText("Cashier Name");

        lbPassword.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblCashierData.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        tblCashierData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCashierData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCashierDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCashierData);

        txtCashierId.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        txtCashierId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashierIdActionPerformed(evt);
            }
        });

        txtCashierName.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N

        txtSearch.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(63, 63, 63)
                        .addComponent(lbCashierData))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbCashierId)
                            .addGap(47, 47, 47)
                            .addComponent(txtCashierId))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPassword)
                                .addComponent(lbCashierName)
                                .addComponent(btnAdd))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(btnDelete)
                                    .addGap(80, 80, 80)
                                    .addComponent(btnRefresh))
                                .addComponent(txtPassword)
                                .addComponent(txtCashierName)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(btnSearch))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCashierData)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lbCashierId))
                    .addComponent(txtCashierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCashierName)
                    .addComponent(txtCashierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new frontEnd.FrmBeranda().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCashierData.getModel();
        int row = tblCashierData.getSelectedRow();
        
        Cashier cash = new Cashier().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        cash.delete();
        kosongkanForm();
        JOptionPane.showMessageDialog(null, "Cashier data has been successfully deleted");
        tampilkanData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        cari(txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCashierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashierIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashierIdActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Cashier cash = new Cashier();
        cash.setId(Integer.parseInt(txtCashierId.getText()));
        cash.setNama(txtCashierName.getText());
        cash.setPassword(txtPassword.getText());
        cash.save();
        txtCashierId.setText(Integer.toString(cash.getId()));
        JOptionPane.showMessageDialog(null, "Cashier data successfully added");
        tampilkanData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblCashierDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCashierDataMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCashierData.getModel();
        int row = tblCashierData.getSelectedRow();
        
        String id = tblCashierData.getValueAt(row,0).toString();
        txtCashierId.setText(id);
        
        String name = tblCashierData.getValueAt(row, 1).toString();
        txtCashierName.setText(name);
        
        String pass = tblCashierData.getValueAt(row, 2).toString();
        txtPassword.setText(pass);
    }//GEN-LAST:event_tblCashierDataMouseClicked

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
            java.util.logging.Logger.getLogger(FrmInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInputCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCashierData;
    private javax.swing.JLabel lbCashierId;
    private javax.swing.JLabel lbCashierName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JTable tblCashierData;
    private javax.swing.JTextField txtCashierId;
    private javax.swing.JTextField txtCashierName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}