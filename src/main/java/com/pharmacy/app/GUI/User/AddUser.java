/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.pharmacy.app.GUI.User;

/**
 *
 * @author phong
 */
public class AddUser extends javax.swing.JDialog {

    /**
     * Creates new form AddUserForEmployee
     */
    public AddUser(java.awt.Frame parent, boolean modal) {
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlAddUser = new javax.swing.JPanel();
        pnlAddUserLabel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblUserStatus = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        cbUserRole = new javax.swing.JComboBox<>();
        pnlAddStatus = new javax.swing.JPanel();
        rbActive = new javax.swing.JRadioButton();
        rbUnactive = new javax.swing.JRadioButton();
        txtEmployeeID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        pnlAddUserButton = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnlEmloyeesList = new javax.swing.JPanel();
        pnlSearchEmployee = new javax.swing.JPanel();
        txtSearchEmployee = new javax.swing.JTextField();
        pnlEmployeesList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlAddUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TẠO TÀI KHOẢN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlAddUserLabel.setLayout(new java.awt.GridBagLayout());

        lblUsername.setText("Tên người dùng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 20);
        pnlAddUserLabel.add(lblUsername, gridBagConstraints);

        lblRole.setText("Vai trò:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 20);
        pnlAddUserLabel.add(lblRole, gridBagConstraints);

        lblUserStatus.setText("Trạng thái:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        pnlAddUserLabel.add(lblUserStatus, gridBagConstraints);

        lblPassword.setText("Mật khẩu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 20);
        pnlAddUserLabel.add(lblPassword, gridBagConstraints);

        lblEmployeeID.setText("Mã nhân viên:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 20);
        pnlAddUserLabel.add(lblEmployeeID, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        pnlAddUserLabel.add(txtUsername, gridBagConstraints);

        cbUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Quản lý", "Nhân viên" }));
        cbUserRole.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        pnlAddUserLabel.add(cbUserRole, gridBagConstraints);

        pnlAddStatus.setFocusable(false);
        pnlAddStatus.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        rbActive.setSelected(true);
        rbActive.setText("Active");
        rbActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActiveActionPerformed(evt);
            }
        });
        pnlAddStatus.add(rbActive);

        rbUnactive.setText("Inactive");
        pnlAddStatus.add(rbUnactive);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlAddUserLabel.add(pnlAddStatus, gridBagConstraints);

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        pnlAddUserLabel.add(txtEmployeeID, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        pnlAddUserLabel.add(txtPassword, gridBagConstraints);

        pnlAddUserButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        btnAddUser.setBackground(new java.awt.Color(0, 204, 51));
        btnAddUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Thêm");
        pnlAddUserButton.add(btnAddUser);

        btnCancel.setBackground(new java.awt.Color(153, 153, 153));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Hủy");
        pnlAddUserButton.add(btnCancel);

        javax.swing.GroupLayout pnlAddUserLayout = new javax.swing.GroupLayout(pnlAddUser);
        pnlAddUser.setLayout(pnlAddUserLayout);
        pnlAddUserLayout.setHorizontalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlAddUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAddUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlAddUserLayout.setVerticalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(pnlAddUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pnlAddUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pnlEmloyeesList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlSearchEmployee.setLayout(new java.awt.BorderLayout());

        txtSearchEmployee.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearchEmployee.setForeground(new java.awt.Color(204, 204, 204));
        txtSearchEmployee.setText("Tìm kiếm");
        txtSearchEmployee.setHighlighter(null);
        txtSearchEmployee.setPreferredSize(new java.awt.Dimension(400, 22));
        pnlSearchEmployee.add(txtSearchEmployee, java.awt.BorderLayout.CENTER);

        pnlEmployeesList.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 310));

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Email"
            }
        ));
        tblEmployees.setFocusable(false);
        tblEmployees.setShowGrid(true);
        jScrollPane1.setViewportView(tblEmployees);

        pnlEmployeesList.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlEmloyeesListLayout = new javax.swing.GroupLayout(pnlEmloyeesList);
        pnlEmloyeesList.setLayout(pnlEmloyeesListLayout);
        pnlEmloyeesListLayout.setHorizontalGroup(
            pnlEmloyeesListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmloyeesListLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlEmloyeesListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEmployeesList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmloyeesListLayout.setVerticalGroup(
            pnlEmloyeesListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmloyeesListLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnlSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlEmployeesList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlEmloyeesList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlEmloyeesList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbActiveActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddUser dialog = new AddUser(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cbUserRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserStatus;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlAddStatus;
    private javax.swing.JPanel pnlAddUser;
    private javax.swing.JPanel pnlAddUserButton;
    private javax.swing.JPanel pnlAddUserLabel;
    private javax.swing.JPanel pnlEmloyeesList;
    private javax.swing.JPanel pnlEmployeesList;
    private javax.swing.JPanel pnlSearchEmployee;
    private javax.swing.JRadioButton rbActive;
    private javax.swing.JRadioButton rbUnactive;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchEmployee;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
