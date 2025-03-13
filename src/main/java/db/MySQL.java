/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/s";
    private static final String USERNAME = "root";  // Thay bằng username của bạn
    private static final String PASSWORD = ""; // Thay bằng password của bạn

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // MySQL JDBC Driver (Không cần gọi Class.forName nếu dùng Maven)
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("✅ Kết nối MySQL thành công!");
        } catch (SQLException e) {
            System.err.println("❌ Lỗi kết nối MySQL!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        // Kiểm tra kết nối
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("✅ Kết nối thành công!");
        } else {
            System.out.println("❌ Kết nối thất bại!");
        }
    }
}
