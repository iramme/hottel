package hotel.config;

import javax.swing.*;
import java.sql.*;


public class ProjectConfig {
    // Configuration constants
    public static final String DB_URL = "jdbc:mysql://localhost:3306/hotel_db";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";
    
    // Utility methods
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    
    public static void initializeComponents() {
        try {
            // Set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            // Initialize database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 