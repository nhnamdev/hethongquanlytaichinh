/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabase;encrypt=true;trustServerCertificate=true";
    private static final String USERNAME = "sa";  // Thay bằng username của bạn
    private static final String PASSWORD = "your_password"; // Thay bằng password của bạn

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load SQL Server JDBC Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Kết nối tới database
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Kết nối SQL Server thành công!");
        } catch (ClassNotFoundException e) {
            System.err.println("Lỗi: Không tìm thấy Driver JDBC!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Lỗi kết nối SQL Server!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        // Kiểm tra kết nối
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }
}
