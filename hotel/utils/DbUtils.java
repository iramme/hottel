package hotel.utils;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class DbUtils {
    public static DefaultTableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            // Get column names
            Vector<String> columnNames = new Vector<>();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }
            
            // Get row data
            Vector<Vector<Object>> data = new Vector<>();
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int column = 1; column <= columnCount; column++) {
                    row.add(rs.getObject(column));
                }
                data.add(row);
            }
            
            return new DefaultTableModel(data, columnNames);
        } catch (SQLException e) {
            e.printStackTrace();
            return new DefaultTableModel();
        }
    }
} 