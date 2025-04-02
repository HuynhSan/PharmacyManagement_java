/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pharmacy.app.GUI.User;

/**
 *
 * @author phong
 */
public class UserInfo extends javax.swing.JPanel {

    /**
     * Creates new form UserProfile
     */
    public UserInfo() {
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

        pnlUserInfo = new javax.swing.JPanel();
        lblUserInfo = new javax.swing.JLabel();
        pnlInfoFields = new javax.swing.JPanel();
        lblUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        pnlButton = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();

        pnlUserInfo.setLayout(new java.awt.BorderLayout());

        lblUserInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserInfo.setText("THÔNG TIN TÀI KHOẢN");
        pnlUserInfo.add(lblUserInfo, java.awt.BorderLayout.CENTER);

        pnlInfoFields.setLayout(new java.awt.GridBagLayout());

        lblUserID.setText("Mã người dùng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 20);
        pnlInfoFields.add(lblUserID, gridBagConstraints);

        txtUserID.setEditable(false);
        txtUserID.setFocusable(false);
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 40);
        pnlInfoFields.add(txtUserID, gridBagConstraints);

        lblRole.setText("Vai trò:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 20);
        pnlInfoFields.add(lblRole, gridBagConstraints);

        txtRole.setEditable(false);
        txtRole.setFocusable(false);
        txtRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        pnlInfoFields.add(txtRole, gridBagConstraints);

        lblUsername.setText("Tên người dùng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        pnlInfoFields.add(lblUsername, gridBagConstraints);

        txtUsername.setEditable(false);
        txtUsername.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 40);
        pnlInfoFields.add(txtUsername, gridBagConstraints);

        lblPassword.setText("Mật khẩu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        pnlInfoFields.add(lblPassword, gridBagConstraints);

        txtPassword.setEditable(false);
        txtPassword.setText("123456789");
        txtPassword.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        pnlInfoFields.add(txtPassword, gridBagConstraints);

        btnChangePassword.setBackground(new java.awt.Color(0, 204, 51));
        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Đổi mật khẩu");
        pnlButton.add(btnChangePassword);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlUserInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfoFields, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlInfoFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void txtRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserInfo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlInfoFields;
    private javax.swing.JPanel pnlUserInfo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
