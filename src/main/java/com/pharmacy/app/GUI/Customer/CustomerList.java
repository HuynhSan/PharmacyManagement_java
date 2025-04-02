/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pharmacy.app.GUI.Customer;

import com.pharmacy.app.GUI.Promo.AddPromo;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author BOI QUAN
 */
public class CustomerList extends javax.swing.JPanel {

    /**
     * Creates new form CustomerList
     */
    public CustomerList() {
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
        plSearch = new javax.swing.JPanel();
        cbSort = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        PLButton = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        lblPdf = new javax.swing.JLabel();
        plCustomerList = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomerList = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(326589, 326589));
        setMinimumSize(new java.awt.Dimension(800, 580));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        plHeader.setBackground(new java.awt.Color(255, 255, 255));
        plHeader.setMaximumSize(new java.awt.Dimension(326589, 326589));
        plHeader.setMinimumSize(new java.awt.Dimension(1050, 70));
        plHeader.setPreferredSize(new java.awt.Dimension(1200, 80));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 20);
        flowLayout1.setAlignOnBaseline(true);
        plHeader.setLayout(flowLayout1);

        plSearch.setBackground(new java.awt.Color(255, 255, 255));
        plSearch.setMaximumSize(new java.awt.Dimension(326589, 326589));
        plSearch.setMinimumSize(new java.awt.Dimension(650, 70));
        plSearch.setPreferredSize(new java.awt.Dimension(800, 70));
        plSearch.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 20));

        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSort.setMaximumSize(new java.awt.Dimension(100, 30));
        cbSort.setMinimumSize(new java.awt.Dimension(100, 30));
        cbSort.setPreferredSize(new java.awt.Dimension(80, 35));
        plSearch.add(cbSort);
        cbSort.getAccessibleContext().setAccessibleName("");

        txtSearch.setMaximumSize(new java.awt.Dimension(300, 30));
        txtSearch.setMinimumSize(new java.awt.Dimension(300, 30));
        txtSearch.setPreferredSize(new java.awt.Dimension(400, 35));
        plSearch.add(txtSearch);

        plHeader.add(plSearch);

        PLButton.setBackground(new java.awt.Color(255, 255, 255));
        PLButton.setMaximumSize(new java.awt.Dimension(326589, 326589));
        PLButton.setMinimumSize(new java.awt.Dimension(300, 70));
        PLButton.setPreferredSize(new java.awt.Dimension(400, 70));
        PLButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 15));

        btnAdd.setText("Thêm");
        btnAdd.setMaximumSize(new java.awt.Dimension(70, 30));
        btnAdd.setMinimumSize(new java.awt.Dimension(70, 30));
        btnAdd.setPreferredSize(new java.awt.Dimension(80, 35));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        PLButton.add(btnAdd);
        btnAdd.getAccessibleContext().setAccessibleName("");

        btnRefesh.setText("Làm mới");
        btnRefesh.setMaximumSize(new java.awt.Dimension(80, 30));
        btnRefesh.setMinimumSize(new java.awt.Dimension(80, 30));
        btnRefesh.setPreferredSize(new java.awt.Dimension(80, 35));
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });
        PLButton.add(btnRefesh);
        btnRefesh.getAccessibleContext().setAccessibleName("");

        lblPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdf.png"))); // NOI18N
        lblPdf.setPreferredSize(null);
        PLButton.add(lblPdf);

        plHeader.add(PLButton);

        add(plHeader);

        plCustomerList.setBackground(new java.awt.Color(255, 255, 255));
        plCustomerList.setMaximumSize(new java.awt.Dimension(326589, 326589));
        plCustomerList.setMinimumSize(new java.awt.Dimension(1050, 450));
        plCustomerList.setPreferredSize(new java.awt.Dimension(1200, 450));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setMaximumSize(new java.awt.Dimension(700, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(700, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(700, 20));
        plCustomerList.add(jSeparator1);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(326589, 326589));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(780, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1180, 400));

        tbCustomerList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbCustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"KH01", "Nguyễn Văn A", "0123456789",  new Float(100.0)},
                {"KH02", "Nguyễn Văn B", "0978465132",  new Float(20.0)},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ KHÁCH HÀNG", "TÊN KHÁCH HÀNG", "SỐ ĐIỆN THOẠI", "ĐIỂM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbCustomerList.setMaximumSize(new java.awt.Dimension(326589, 326589));
        tbCustomerList.setMinimumSize(new java.awt.Dimension(780, 400));
        tbCustomerList.setPreferredSize(new java.awt.Dimension(1180, 400));
        tbCustomerList.setRowHeight(30);
        tbCustomerList.setShowGrid(true);
        jScrollPane1.setViewportView(tbCustomerList);

        plCustomerList.add(jScrollPane1);

        add(plCustomerList);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddCustomer dialog = new AddCustomer((JFrame) SwingUtilities.getWindowAncestor(this), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PLButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPdf;
    private javax.swing.JPanel plCustomerList;
    private javax.swing.JPanel plHeader;
    private javax.swing.JPanel plSearch;
    private javax.swing.JTable tbCustomerList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
