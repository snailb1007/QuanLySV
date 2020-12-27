/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thien
 */
public class MyConnect {

    private Connection conn;
    ResultSet rs = null;
    private final String url = "jdbc:sqlserver://localhost:1433; databaseName=qlDiem_thpt_nhom18";

    public Connection connect() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, "sa", "123456789");
            System.out.println("SQL Connected!...");
            System.out.println(conn);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("exit connect!");
            } catch (SQLException ex) {
                Logger.getLogger(MyConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ResultSet getDataHS(String a) throws SQLException {       
        Statement st = conn.createStatement();
        String sql = "select * from HocSinh";
        rs = st.executeQuery(sql);
        return rs;
    }

    public ResultSet getDataLop(String a) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "select * from Lop";
        rs = st.executeQuery(sql);
        return rs;
    }
}
