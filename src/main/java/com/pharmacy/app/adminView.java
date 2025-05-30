/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pharmacy.app;

import com.pharmacy.app.GUI.Authorization.AuthorizationManagement;
import com.pharmacy.app.GUI.Customer.CustomerList;
import com.pharmacy.app.GUI.Employee.EmployeeManagement;
import com.pharmacy.app.GUI.Product.MedicalProducts;
import java.awt.*;
import javax.swing.*;
import com.pharmacy.app.GUI.Promo.*;
import com.pharmacy.app.GUI.Supplier.SupplierList;
import com.pharmacy.app.GUI.User.UserInfo;
import com.pharmacy.app.GUI.User.UserManagement;
import com.pharmacy.app.GUI.WorkSchedule.WorkScheduleManagement;

/**
 *
 * @author LENOVO
 */
public class adminView extends javax.swing.JFrame {

    /**
     * Creates new form pagehome
     */
    boolean a = true;
    private Color colorEntered = new Color(120,168,191);
    private Color colorExited = new Color(0,102,153);
    private CardLayout cardlayout = new CardLayout();
    
    public adminView() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPn = new javax.swing.JPanel();
        iconExit = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        closeicon = new javax.swing.JLabel();
        btnMax = new javax.swing.JPanel();
        minmaxicon = new javax.swing.JLabel();
        MenuPn = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        btnBack = new javax.swing.JPanel();
        backicon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUser = new javax.swing.JPanel();
        usericon = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        logouticon = new javax.swing.JLabel();
        MenuHidePn = new javax.swing.JPanel();
        cusBtn = new javax.swing.JButton();
        promoBtn = new javax.swing.JButton();
        empBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        userBtn = new javax.swing.JButton();
        productBtn = new javax.swing.JButton();
        authzBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        ContentPn = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        HeaderPn.setBackground(new java.awt.Color(0, 51, 102));
        HeaderPn.setPreferredSize(new java.awt.Dimension(1000, 45));
        HeaderPn.setLayout(new java.awt.BorderLayout());

        iconExit.setBackground(new java.awt.Color(0, 51, 102));
        iconExit.setMinimumSize(new java.awt.Dimension(150, 100));
        iconExit.setPreferredSize(new java.awt.Dimension(132, 120));
        iconExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(0, 51, 102));
        btnClose.setMaximumSize(new java.awt.Dimension(45, 45));
        btnClose.setMinimumSize(new java.awt.Dimension(45, 45));
        btnClose.setPreferredSize(new java.awt.Dimension(45, 45));

        closeicon.setBackground(new java.awt.Color(0, 51, 102));
        closeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeWindow.png"))); // NOI18N
        closeicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeiconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeiconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeicon, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeicon, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        iconExit.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 45, 45));

        btnMax.setBackground(new java.awt.Color(0, 51, 102));
        btnMax.setMaximumSize(new java.awt.Dimension(45, 45));
        btnMax.setMinimumSize(new java.awt.Dimension(45, 45));
        btnMax.setPreferredSize(new java.awt.Dimension(45, 45));

        minmaxicon.setBackground(new java.awt.Color(0, 51, 102));
        minmaxicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxWindow.png"))); // NOI18N
        minmaxicon.setText("jLabel1");
        minmaxicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minmaxiconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minmaxiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minmaxiconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMaxLayout = new javax.swing.GroupLayout(btnMax);
        btnMax.setLayout(btnMaxLayout);
        btnMaxLayout.setHorizontalGroup(
            btnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minmaxicon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        btnMaxLayout.setVerticalGroup(
            btnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minmaxicon)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        iconExit.add(btnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 45));

        HeaderPn.add(iconExit, java.awt.BorderLayout.LINE_END);

        getContentPane().add(HeaderPn, java.awt.BorderLayout.PAGE_START);

        MenuPn.setPreferredSize(new java.awt.Dimension(250, 450));
        MenuPn.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 51, 102));
        MenuIcon.setMinimumSize(new java.awt.Dimension(400, 450));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new javax.swing.BoxLayout(MenuIcon, javax.swing.BoxLayout.Y_AXIS));

        btnBack.setBackground(new java.awt.Color(0, 51, 102));
        btnBack.setForeground(new java.awt.Color(0, 51, 102));
        btnBack.setMaximumSize(new java.awt.Dimension(50, 50));
        btnBack.setMinimumSize(new java.awt.Dimension(50, 50));

        backicon.setBackground(new java.awt.Color(0, 51, 102));
        backicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu1.png"))); // NOI18N
        backicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backiconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backiconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backicon)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuIcon.add(btnBack);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        MenuIcon.add(jPanel1);

        btnUser.setBackground(new java.awt.Color(0, 51, 102));
        btnUser.setMaximumSize(new java.awt.Dimension(45, 45));
        btnUser.setPreferredSize(new java.awt.Dimension(45, 45));

        usericon.setBackground(new java.awt.Color(0, 51, 102));
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user1.png"))); // NOI18N
        usericon.setPreferredSize(new java.awt.Dimension(31, 35));
        usericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usericonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usericonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usericonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnUserLayout = new javax.swing.GroupLayout(btnUser);
        btnUser.setLayout(btnUserLayout);
        btnUserLayout.setHorizontalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usericon, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        btnUserLayout.setVerticalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserLayout.createSequentialGroup()
                .addComponent(usericon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        MenuIcon.add(btnUser);

        btnLogout.setBackground(new java.awt.Color(0, 51, 102));
        btnLogout.setMaximumSize(new java.awt.Dimension(45, 45));
        btnLogout.setPreferredSize(new java.awt.Dimension(45, 45));

        logouticon.setBackground(new java.awt.Color(0, 51, 102));
        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logouticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logouticonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logouticonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logouticon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logouticon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MenuIcon.add(btnLogout);

        MenuPn.add(MenuIcon, java.awt.BorderLayout.LINE_START);
        MenuPn.add(Box.createVerticalGlue());

        MenuHidePn.setBackground(new java.awt.Color(0, 102, 153));
        MenuHidePn.setAutoscrolls(true);
        MenuHidePn.setMinimumSize(new java.awt.Dimension(200, 555));
        MenuHidePn.setPreferredSize(new java.awt.Dimension(200, 555));
        MenuHidePn.setVerifyInputWhenFocusTarget(false);
        MenuHidePn.setLayout(new java.awt.GridLayout(10, 1, 50, 10));

        cusBtn.setBackground(new java.awt.Color(0, 102, 153));
        cusBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cusBtn.setForeground(new java.awt.Color(255, 255, 255));
        cusBtn.setText("QUẢN LÝ KHÁCH HÀNG");
        cusBtn.setBorder(null);
        cusBtn.setBorderPainted(false);
        cusBtn.setContentAreaFilled(false);
        cusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cusBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cusBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        cusBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        cusBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        cusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cusBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cusBtnMouseExited(evt);
            }
        });
        cusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(cusBtn);

        promoBtn.setBackground(new java.awt.Color(0, 102, 153));
        promoBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        promoBtn.setForeground(new java.awt.Color(255, 255, 255));
        promoBtn.setText("QUẢN LÝ KHUYẾN MÃI");
        promoBtn.setBorder(null);
        promoBtn.setBorderPainted(false);
        promoBtn.setContentAreaFilled(false);
        promoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        promoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        promoBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        promoBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        promoBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        promoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                promoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                promoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                promoBtnMouseExited(evt);
            }
        });
        promoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(promoBtn);

        empBtn.setBackground(new java.awt.Color(0, 102, 153));
        empBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        empBtn.setForeground(new java.awt.Color(255, 255, 255));
        empBtn.setText("QUẢN LÝ NHÂN VIÊN");
        empBtn.setBorder(null);
        empBtn.setBorderPainted(false);
        empBtn.setContentAreaFilled(false);
        empBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        empBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        empBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        empBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        empBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empBtnMouseExited(evt);
            }
        });
        empBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(empBtn);

        supBtn.setBackground(new java.awt.Color(0, 102, 153));
        supBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        supBtn.setForeground(new java.awt.Color(255, 255, 255));
        supBtn.setText("QUẢN LÝ NHÀ CUNG CẤP");
        supBtn.setBorder(null);
        supBtn.setBorderPainted(false);
        supBtn.setContentAreaFilled(false);
        supBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        supBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        supBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        supBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supBtnMouseExited(evt);
            }
        });
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(supBtn);

        userBtn.setBackground(new java.awt.Color(0, 102, 153));
        userBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        userBtn.setForeground(new java.awt.Color(255, 255, 255));
        userBtn.setText("QUẢN LÝ USER");
        userBtn.setBorder(null);
        userBtn.setBorderPainted(false);
        userBtn.setContentAreaFilled(false);
        userBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        userBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        userBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        userBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userBtnMouseExited(evt);
            }
        });
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(userBtn);

        productBtn.setBackground(new java.awt.Color(0, 102, 153));
        productBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        productBtn.setForeground(new java.awt.Color(255, 255, 255));
        productBtn.setText("QUẢN LÝ SẢN PHẨM");
        productBtn.setBorder(null);
        productBtn.setBorderPainted(false);
        productBtn.setContentAreaFilled(false);
        productBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        productBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        productBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        productBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productBtnMouseExited(evt);
            }
        });
        productBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(productBtn);

        authzBtn.setBackground(new java.awt.Color(0, 102, 153));
        authzBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        authzBtn.setForeground(new java.awt.Color(255, 255, 255));
        authzBtn.setText("PHÂN QUYỀN");
        authzBtn.setToolTipText("");
        authzBtn.setBorder(null);
        authzBtn.setBorderPainted(false);
        authzBtn.setContentAreaFilled(false);
        authzBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        authzBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        authzBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        authzBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        authzBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        authzBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authzBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                authzBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                authzBtnMouseExited(evt);
            }
        });
        authzBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authzBtnActionPerformed(evt);
            }
        });
        MenuHidePn.add(authzBtn);

        reportBtn.setBackground(new java.awt.Color(0, 102, 153));
        reportBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        reportBtn.setForeground(new java.awt.Color(255, 255, 255));
        reportBtn.setText("BÁO CÁO THỐNG KÊ");
        reportBtn.setBorder(null);
        reportBtn.setBorderPainted(false);
        reportBtn.setContentAreaFilled(false);
        reportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reportBtn.setMaximumSize(new java.awt.Dimension(200, 30));
        reportBtn.setMinimumSize(new java.awt.Dimension(200, 30));
        reportBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        reportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportBtnMouseExited(evt);
            }
        });
        MenuHidePn.add(reportBtn);

        MenuPn.add(MenuHidePn, java.awt.BorderLayout.CENTER);

        getContentPane().add(MenuPn, java.awt.BorderLayout.LINE_START);

        ContentPn.setBackground(new java.awt.Color(255, 255, 255));
        ContentPn.setPreferredSize(new java.awt.Dimension(1000, 700));
        ContentPn.setLayout(new java.awt.CardLayout());
        getContentPane().add(ContentPn, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// cardlayout
    public void switchToPanel(String panelName) {
    ContentPn.setLayout(cardlayout);
    cardlayout.show(ContentPn, panelName);
    ContentPn.revalidate();
    ContentPn.repaint();
}
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(250, menushowhide.getHeight()));
            changeimage(button, "/back.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/menu.png");
        }
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    private void closeiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeiconMouseEntered
        btnClose.setBackground(new Color(227, 52, 67));
    }//GEN-LAST:event_closeiconMouseEntered

    private void closeiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeiconMouseExited
        btnClose.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_closeiconMouseExited

    private void closeiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeiconMouseClicked
        btnClose.setBackground(new Color(227, 52, 67));
        System.exit(0);
    }//GEN-LAST:event_closeiconMouseClicked

    private void backiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconMouseClicked
         if(a==true){
          hideshow(MenuPn, a, backicon);
          SwingUtilities.updateComponentTreeUI(this);
          a=false;
        }
        else{
            hideshow(MenuPn, a, backicon);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_backiconMouseClicked

    private void backiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconMouseEntered
        btnBack.setBackground(new Color(81, 115, 150));
    }//GEN-LAST:event_backiconMouseEntered

    private void backiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconMouseExited
        btnBack.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_backiconMouseExited

    private void minmaxiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmaxiconMouseClicked
        btnMax.setBackground(new Color(127, 163, 163));
        if (this.getExtendedState() != adminView.MAXIMIZED_BOTH){
            this.setExtendedState(adminView.MAXIMIZED_BOTH);
            }
        else {
            this.setExtendedState(adminView.NORMAL);
        }
    }//GEN-LAST:event_minmaxiconMouseClicked

    private void minmaxiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmaxiconMouseEntered
        btnMax.setBackground(new Color(81, 115, 150));
    }//GEN-LAST:event_minmaxiconMouseEntered

    private void minmaxiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmaxiconMouseExited
        btnMax.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_minmaxiconMouseExited

    private void cusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusBtnActionPerformed

    private void promoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promoBtnActionPerformed

    private void empBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empBtnActionPerformed

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supBtnActionPerformed

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userBtnActionPerformed

    private void productBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productBtnActionPerformed

    private void authzBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authzBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authzBtnActionPerformed
// Khách hàng
    private void cusBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusBtnMouseEntered
        cusBtn.setBackground(colorEntered);
        cusBtn.setOpaque(true);
    }//GEN-LAST:event_cusBtnMouseEntered

    private void cusBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusBtnMouseExited
        cusBtn.setBackground(colorExited);
        cusBtn.setOpaque(true);
    }//GEN-LAST:event_cusBtnMouseExited

    private void cusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusBtnMouseClicked
        ContentPn.add(new CustomerList(), "Customer");
        switchToPanel("Customer");
    }//GEN-LAST:event_cusBtnMouseClicked
// Khuyến mãi
    private void promoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promoBtnMouseEntered
        promoBtn.setBackground(colorEntered);
        promoBtn.setOpaque(true);
    }//GEN-LAST:event_promoBtnMouseEntered

    private void promoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promoBtnMouseExited
        promoBtn.setBackground(colorExited);
        promoBtn.setOpaque(true);
    }//GEN-LAST:event_promoBtnMouseExited

    private void promoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promoBtnMouseClicked
        ContentPn.add(new HomePromo(), "Promo");
        switchToPanel("Promo");
    }//GEN-LAST:event_promoBtnMouseClicked
// Nhân viên
    private void empBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empBtnMouseEntered
        empBtn.setBackground(colorEntered);
        empBtn.setOpaque(true);
    }//GEN-LAST:event_empBtnMouseEntered

    private void empBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empBtnMouseExited
        empBtn.setBackground(colorExited);
        empBtn.setOpaque(true);
    }//GEN-LAST:event_empBtnMouseExited

    private void empBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empBtnMouseClicked
        ContentPn.add(new EmployeeManagement(), "Employee");
        switchToPanel("Employee");
    }//GEN-LAST:event_empBtnMouseClicked
// Nhà cung cấp
    private void supBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supBtnMouseEntered
        supBtn.setBackground(colorEntered);
        supBtn.setOpaque(true);
    }//GEN-LAST:event_supBtnMouseEntered

    private void supBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supBtnMouseExited
        supBtn.setBackground(colorExited);
        supBtn.setOpaque(true);
    }//GEN-LAST:event_supBtnMouseExited

    private void supBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supBtnMouseClicked
        ContentPn.add(new SupplierList(), "Supplier");
        switchToPanel("Supplier");
    }//GEN-LAST:event_supBtnMouseClicked
// User
    private void userBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseEntered
        userBtn.setBackground(colorEntered);
        userBtn.setOpaque(true);
    }//GEN-LAST:event_userBtnMouseEntered

    private void userBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseExited
        userBtn.setBackground(colorExited);
        userBtn.setOpaque(true);
    }//GEN-LAST:event_userBtnMouseExited

    private void userBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseClicked
        ContentPn.add(new UserManagement(), "User");
        switchToPanel("User");
    }//GEN-LAST:event_userBtnMouseClicked
// Sản phẩm
    private void productBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseEntered
        productBtn.setBackground(colorEntered);
        productBtn.setOpaque(true);
    }//GEN-LAST:event_productBtnMouseEntered

    private void productBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseExited
        productBtn.setBackground(colorExited);
        productBtn.setOpaque(true);
    }//GEN-LAST:event_productBtnMouseExited

    private void productBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseClicked
        ContentPn.add(new MedicalProducts(), "Medinces");
        switchToPanel("Medinces");
    }//GEN-LAST:event_productBtnMouseClicked
// Phân quyền
    private void authzBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authzBtnMouseExited
        authzBtn.setBackground(colorExited);
        authzBtn.setOpaque(true);
    }//GEN-LAST:event_authzBtnMouseExited

    private void authzBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authzBtnMouseEntered
        authzBtn.setBackground(colorEntered);
        authzBtn.setOpaque(true);
    }//GEN-LAST:event_authzBtnMouseEntered

    private void authzBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authzBtnMouseClicked
        ContentPn.add(new AuthorizationManagement(), "Authz");
        switchToPanel("Authz");
    }//GEN-LAST:event_authzBtnMouseClicked

    private void reportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseEntered
        reportBtn.setBackground(colorEntered);
        reportBtn.setOpaque(true);
    }//GEN-LAST:event_reportBtnMouseEntered

    private void reportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseExited
        reportBtn.setBackground(colorExited);
        reportBtn.setOpaque(true);
    }//GEN-LAST:event_reportBtnMouseExited

    private void usericonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseEntered
        btnUser.setBackground(new Color(81, 115, 150));
    }//GEN-LAST:event_usericonMouseEntered

    private void usericonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseExited
        btnUser.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_usericonMouseExited

    private void logouticonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouticonMouseEntered
        btnLogout.setBackground(new Color(81, 115, 150));
    }//GEN-LAST:event_logouticonMouseEntered

    private void logouticonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouticonMouseExited
        btnLogout.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_logouticonMouseExited

    private void usericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseClicked
        UserInfo userDialog = new UserInfo((Frame)SwingUtilities.getWindowAncestor(usericon), true);
        userDialog.setLocationRelativeTo(null);
        userDialog.setVisible(true);
    }//GEN-LAST:event_usericonMouseClicked

    
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
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         SwingUtilities.invokeLater(() -> new adminView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPn;
    private javax.swing.JPanel HeaderPn;
    private javax.swing.JPanel MenuHidePn;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel MenuPn;
    private javax.swing.JButton authzBtn;
    private javax.swing.JLabel backicon;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnMax;
    private javax.swing.JPanel btnUser;
    private javax.swing.JLabel closeicon;
    private javax.swing.JButton cusBtn;
    private javax.swing.JButton empBtn;
    private javax.swing.JPanel iconExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logouticon;
    private javax.swing.JLabel minmaxicon;
    private javax.swing.JButton productBtn;
    private javax.swing.JButton promoBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton supBtn;
    private javax.swing.JButton userBtn;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables
}
