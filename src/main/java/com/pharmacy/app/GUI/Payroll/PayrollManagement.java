/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pharmacy.app.GUI.Payroll;

/**
 *
 * @author phong
 */
public class PayrollManagement extends javax.swing.JPanel {

    /**
     * Creates new form PayrollManagement
     */
    public PayrollManagement() {
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

        tpPayroll = new javax.swing.JTabbedPane();
        pnlPayroll = new javax.swing.JPanel();
        pnlPayroll1 = new javax.swing.JPanel();
        txtFilter = new javax.swing.JTextField();
        cbFilter = new javax.swing.JComboBox<>();
        pnlPayrollButton = new javax.swing.JPanel();
        btnPayroll = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        pnlPayroll2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayroll = new javax.swing.JTable();
        pnlPayrollComponent = new javax.swing.JPanel();
        pnlComponent1 = new javax.swing.JPanel();
        txtSearchComponent = new javax.swing.JTextField();
        pnlComponentButton = new javax.swing.JPanel();
        btnAddComponent = new javax.swing.JButton();
        btnRefesh1 = new javax.swing.JButton();
        btnPdf1 = new javax.swing.JButton();
        pnlComponent2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComponent = new javax.swing.JTable();

        pnlPayroll1.setToolTipText("");
        pnlPayroll1.setPreferredSize(new java.awt.Dimension(607, 40));
        pnlPayroll1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        txtFilter.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFilter.setForeground(new java.awt.Color(153, 153, 153));
        txtFilter.setText("Cái này với cbbox kế bên là cái filter theo tháng, theo nhân viên,...");
        txtFilter.setHighlighter(null);
        txtFilter.setMinimumSize(new java.awt.Dimension(250, 22));
        txtFilter.setPreferredSize(new java.awt.Dimension(250, 22));
        txtFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterActionPerformed(evt);
            }
        });
        pnlPayroll1.add(txtFilter);

        cbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Chờ duyệt", "Đã duyệt", "Không duyệt" }));
        cbFilter.setFocusable(false);
        cbFilter.setMinimumSize(new java.awt.Dimension(80, 22));
        cbFilter.setPreferredSize(new java.awt.Dimension(105, 22));
        pnlPayroll1.add(cbFilter);

        pnlPayrollButton.setPreferredSize(new java.awt.Dimension(300, 35));
        pnlPayrollButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        btnPayroll.setText("Tính lương");
        btnPayroll.setFocusable(false);
        btnPayroll.setMaximumSize(new java.awt.Dimension(72, 22));
        btnPayroll.setMinimumSize(new java.awt.Dimension(72, 22));
        btnPayroll.setPreferredSize(new java.awt.Dimension(90, 22));
        pnlPayrollButton.add(btnPayroll);

        btnPdf.setText("Thanh toán");
        btnPdf.setFocusable(false);
        btnPdf.setMaximumSize(new java.awt.Dimension(72, 22));
        btnPdf.setMinimumSize(new java.awt.Dimension(72, 22));
        btnPdf.setPreferredSize(new java.awt.Dimension(90, 22));
        pnlPayrollButton.add(btnPdf);

        pnlPayroll1.add(pnlPayrollButton);

        pnlPayroll2.setPreferredSize(new java.awt.Dimension(600, 439));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(670, 402));

        tblPayroll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã lương", "Mã nhân viên", "Tổng lương", "Trạng thái", "Ngày trả"
            }
        ));
        tblPayroll.setFocusable(false);
        tblPayroll.setMinimumSize(new java.awt.Dimension(500, 80));
        tblPayroll.setPreferredSize(new java.awt.Dimension(500, 80));
        tblPayroll.setShowGrid(true);
        jScrollPane1.setViewportView(tblPayroll);
        if (tblPayroll.getColumnModel().getColumnCount() > 0) {
            tblPayroll.getColumnModel().getColumn(3).setHeaderValue("Trạng thái");
            tblPayroll.getColumnModel().getColumn(4).setHeaderValue("Ngày trả");
        }

        pnlPayroll2.add(jScrollPane1);

        javax.swing.GroupLayout pnlPayrollLayout = new javax.swing.GroupLayout(pnlPayroll);
        pnlPayroll.setLayout(pnlPayrollLayout);
        pnlPayrollLayout.setHorizontalGroup(
            pnlPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPayrollLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPayroll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPayrollLayout.createSequentialGroup()
                        .addComponent(pnlPayroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPayrollLayout.setVerticalGroup(
            pnlPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPayrollLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlPayroll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPayroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpPayroll.addTab("Bảng lương", pnlPayroll);

        pnlComponent1.setToolTipText("");
        pnlComponent1.setPreferredSize(new java.awt.Dimension(607, 40));
        pnlComponent1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        txtSearchComponent.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearchComponent.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchComponent.setText("Tìm kiếm");
        txtSearchComponent.setHighlighter(null);
        txtSearchComponent.setMinimumSize(new java.awt.Dimension(250, 22));
        txtSearchComponent.setPreferredSize(new java.awt.Dimension(350, 22));
        txtSearchComponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchComponentActionPerformed(evt);
            }
        });
        pnlComponent1.add(txtSearchComponent);

        pnlComponentButton.setPreferredSize(new java.awt.Dimension(310, 35));
        pnlComponentButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        btnAddComponent.setText("Thêm");
        btnAddComponent.setFocusable(false);
        btnAddComponent.setMaximumSize(new java.awt.Dimension(72, 22));
        btnAddComponent.setMinimumSize(new java.awt.Dimension(72, 22));
        btnAddComponent.setPreferredSize(new java.awt.Dimension(90, 22));
        pnlComponentButton.add(btnAddComponent);

        btnRefesh1.setText("Tải lại");
        btnRefesh1.setFocusable(false);
        btnRefesh1.setMaximumSize(new java.awt.Dimension(72, 22));
        btnRefesh1.setMinimumSize(new java.awt.Dimension(72, 22));
        btnRefesh1.setPreferredSize(new java.awt.Dimension(72, 22));
        pnlComponentButton.add(btnRefesh1);

        btnPdf1.setText("In PDF");
        btnPdf1.setFocusable(false);
        btnPdf1.setMaximumSize(new java.awt.Dimension(72, 22));
        btnPdf1.setMinimumSize(new java.awt.Dimension(72, 22));
        btnPdf1.setPreferredSize(new java.awt.Dimension(72, 22));
        pnlComponentButton.add(btnPdf1);

        pnlComponent1.add(pnlComponentButton);

        pnlComponent2.setPreferredSize(new java.awt.Dimension(600, 439));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(670, 402));

        tblComponent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã thành phần", "Tên thành phần", "Mô tả"
            }
        ));
        tblComponent.setFocusable(false);
        tblComponent.setMinimumSize(new java.awt.Dimension(500, 80));
        tblComponent.setPreferredSize(new java.awt.Dimension(500, 80));
        tblComponent.setShowGrid(true);
        jScrollPane2.setViewportView(tblComponent);

        pnlComponent2.add(jScrollPane2);

        javax.swing.GroupLayout pnlPayrollComponentLayout = new javax.swing.GroupLayout(pnlPayrollComponent);
        pnlPayrollComponent.setLayout(pnlPayrollComponentLayout);
        pnlPayrollComponentLayout.setHorizontalGroup(
            pnlPayrollComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPayrollComponentLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlPayrollComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlComponent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlComponent2, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        pnlPayrollComponentLayout.setVerticalGroup(
            pnlPayrollComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPayrollComponentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlComponent2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpPayroll.addTab("Thành phần lương", pnlPayrollComponent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpPayroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpPayroll)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed

    private void txtSearchComponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchComponentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchComponentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddComponent;
    private javax.swing.JButton btnPayroll;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnPdf1;
    private javax.swing.JButton btnRefesh1;
    private javax.swing.JComboBox<String> cbFilter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlComponent1;
    private javax.swing.JPanel pnlComponent2;
    private javax.swing.JPanel pnlComponentButton;
    private javax.swing.JPanel pnlPayroll;
    private javax.swing.JPanel pnlPayroll1;
    private javax.swing.JPanel pnlPayroll2;
    private javax.swing.JPanel pnlPayrollButton;
    private javax.swing.JPanel pnlPayrollComponent;
    private javax.swing.JTable tblComponent;
    private javax.swing.JTable tblPayroll;
    private javax.swing.JTabbedPane tpPayroll;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtSearchComponent;
    // End of variables declaration//GEN-END:variables
}
