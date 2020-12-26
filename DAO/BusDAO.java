package DAO;

import DTO.BusDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusDAO extends AbstractDAO{
    private long id = 1;
    public void addRow(BusDTO dto) {
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            String sql = "INSERT INTO bus (id, num, driverName, route, mileage) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id++);
            statement.setInt(2, dto.getNum());
            statement.setString(3, dto.getDriverName());
            statement.setString(4, dto.getRoute());
            statement.setLong(5, dto.getMileage());

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("1 row has been inserted.");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("There is an error.");
            e.printStackTrace();
        }
    }

    public void updateRow(BusDTO dto, int id) {
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            String sql = "UPDATE bus set driverName = ?, num = ?, route = ?, mileage = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, dto.getDriverName());
            statement.setInt(2, dto.getNum());
            statement.setString(3, dto.getRoute());
            statement.setLong(4, dto.getMileage());
            statement.setLong(5, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("1 row has been changed.");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void deleteRow(int id) {
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            String sql = "DELETE FROM bus WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A row has been deleted.");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Opps, error:");
            e.printStackTrace();
        }
    }
}
