/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.pharmacy.app.GUI.Supplier;

/**
 *
 * @author BOI QUAN
 */
public class SupplierDetail extends javax.swing.JDialog {

    /**
     * Creates new form ChiTietSupplier
     */
    public SupplierDetail(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        plHeader = new javax.swing.JPanel();
        plInformation = new javax.swing.JPanel();
        plInfor1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        plInfor2 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        plButton = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        plHistory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 580));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        plHeader.setBackground(new java.awt.Color(255, 255, 255));
        plHeader.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        plHeader.setMaximumSize(new java.awt.Dimension(800, 140));
        plHeader.setMinimumSize(new java.awt.Dimension(800, 140));
        plHeader.setPreferredSize(new java.awt.Dimension(800, 140));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout2.setAlignOnBaseline(true);
        plHeader.setLayout(flowLayout2);

        plInformation.setBackground(new java.awt.Color(255, 255, 255));
        plInformation.setMaximumSize(new java.awt.Dimension(550, 100));
        plInformation.setMinimumSize(new java.awt.Dimension(550, 100));
        plInformation.setPreferredSize(new java.awt.Dimension(550, 100));
        plInformation.setLayout(new javax.swing.BoxLayout(plInformation, javax.swing.BoxLayout.Y_AXIS));

        plInfor1.setBackground(new java.awt.Color(255, 255, 255));
        plInfor1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("Họ và Tên:");
        lblName.setMaximumSize(new java.awt.Dimension(70, 30));
        lblName.setMinimumSize(new java.awt.Dimension(70, 30));
        lblName.setPreferredSize(new java.awt.Dimension(70, 30));
        plInfor1.add(lblName);

        txtName.setBorder(null);
        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtName.setEnabled(false);
        txtName.setMaximumSize(new java.awt.Dimension(100, 30));
        txtName.setMinimumSize(new java.awt.Dimension(100, 30));
        txtName.setPreferredSize(new java.awt.Dimension(100, 30));
        plInfor1.add(txtName);

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Địa chỉ:");
        lblAddress.setMaximumSize(new java.awt.Dimension(100, 30));
        lblAddress.setMinimumSize(new java.awt.Dimension(100, 30));
        lblAddress.setPreferredSize(new java.awt.Dimension(100, 30));
        plInfor1.add(lblAddress);

        txtAddress.setBorder(null);
        txtAddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAddress.setEnabled(false);
        txtAddress.setMaximumSize(new java.awt.Dimension(250, 30));
        txtAddress.setMinimumSize(new java.awt.Dimension(250, 30));
        txtAddress.setPreferredSize(new java.awt.Dimension(250, 30));
        plInfor1.add(txtAddress);

        plInformation.add(plInfor1);

        plInfor2.setBackground(new java.awt.Color(255, 255, 255));
        plInfor2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email:");
        lblEmail.setMaximumSize(new java.awt.Dimension(50, 30));
        lblEmail.setMinimumSize(new java.awt.Dimension(50, 30));
        lblEmail.setPreferredSize(new java.awt.Dimension(50, 30));
        plInfor2.add(lblEmail);

        txtEmail.setBorder(null);
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.setEnabled(false);
        txtEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        txtEmail.setMinimumSize(new java.awt.Dimension(250, 30));
        txtEmail.setPreferredSize(new java.awt.Dimension(250, 30));
        plInfor2.add(txtEmail);

        lblPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Số điện thoại:");
        lblPhone.setMaximumSize(new java.awt.Dimension(120, 30));
        lblPhone.setMinimumSize(new java.awt.Dimension(120, 30));
        lblPhone.setPreferredSize(new java.awt.Dimension(120, 30));
        plInfor2.add(lblPhone);

        txtPhone.setBorder(null);
        txtPhone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPhone.setEnabled(false);
        txtPhone.setMaximumSize(new java.awt.Dimension(100, 30));
        txtPhone.setMinimumSize(new java.awt.Dimension(100, 30));
        txtPhone.setPreferredSize(new java.awt.Dimension(100, 30));
        plInfor2.add(txtPhone);

        plInformation.add(plInfor2);

        plHeader.add(plInformation);

        plButton.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        plButton.setLayout(flowLayout1);

        btnUpdate.setText("Cập nhật");
        btnUpdate.setMaximumSize(new java.awt.Dimension(80, 30));
        btnUpdate.setMinimumSize(new java.awt.Dimension(80, 30));
        btnUpdate.setPreferredSize(new java.awt.Dimension(80, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        plButton.add(btnUpdate);

        btnDelete.setText("Xóa");
        btnDelete.setMaximumSize(new java.awt.Dimension(70, 30));
        btnDelete.setMinimumSize(new java.awt.Dimension(70, 30));
        btnDelete.setPreferredSize(new java.awt.Dimension(70, 30));
        plButton.add(btnDelete);

        plHeader.add(plButton);

        getContentPane().add(plHeader);

        plHistory.setBackground(new java.awt.Color(255, 255, 255));
        plHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LỊCH SỬ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        plHistory.setMaximumSize(new java.awt.Dimension(800, 400));
        plHistory.setMinimumSize(new java.awt.Dimension(800, 400));
        plHistory.setPreferredSize(new java.awt.Dimension(800, 400));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(780, 360));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(780, 360));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(780, 360));

        tbHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DH01", "23/05/2025",  new Integer(300), "ĐÃ NHẬN"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ ĐƠN HÀNG", "NGÀY NHẬN", "TỔNG SỐ LƯỢNG", "TRẠNG THÁI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbHistory.setMaximumSize(new java.awt.Dimension(780, 360));
        tbHistory.setMinimumSize(new java.awt.Dimension(780, 360));
        tbHistory.setPreferredSize(new java.awt.Dimension(780, 360));
        tbHistory.setShowGrid(true);
        jScrollPane1.setViewportView(tbHistory);

        plHistory.add(jScrollPane1);

        getContentPane().add(plHistory);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SupplierDetail dialog = new SupplierDetail(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JPanel plButton;
    private javax.swing.JPanel plHeader;
    private javax.swing.JPanel plHistory;
    private javax.swing.JPanel plInfor1;
    private javax.swing.JPanel plInfor2;
    private javax.swing.JPanel plInformation;
    private javax.swing.JTable tbHistory;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
