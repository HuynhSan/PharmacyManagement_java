/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacy.app.DAO;

import com.pharmacy.app.DAO.MyConnection;
import com.pharmacy.app.DAO.*;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Giai Cuu Li San
 */
public class categoryDAO {
    
    public static void main(String[] args) throws SQLException {
        
        MyConnection myconnect = new MyConnection();

        if (myconnect.openConnection()) {
            String sql = "SELECT * FROM category";
            ResultSet rs = myconnect.runQuerry(sql);

            try {
                while (rs != null && rs.next()) {
                    System.out.println("ID: " + rs.getString(1) 
                        + ", Ten thuoc: " + rs.getString(2) 
                        + ", Chu thich: " + rs.getString(3) 
                        + ", Trang thai: " + rs.getString(4));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                myconnect.closeConnection();
            }
        } else {
            System.out.println("Kết nối thất bại!");

        }
    }
}
