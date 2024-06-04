/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {

    public static Connection Connectionmysql;

    public static Connection ConnectionDB() {
        if (Connectionmysql == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/rental_mobil";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                Connectionmysql = (Connection) DriverManager.getConnection(url, user, pass);
//                JOptionPane.showMessageDialog(null, "koneksi Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        }
        return Connectionmysql;
    }

    public static Resultset read(String select__from_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
