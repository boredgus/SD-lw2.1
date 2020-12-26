package DAO;

import DTO.BusDTO;

public abstract class AbstractDAO {
    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
    String username = "c##admin";
    String password = "admin";

    abstract void addRow(BusDTO dto);
    abstract void updateRow (BusDTO dto, int id);
    abstract void deleteRow (int id);
}
