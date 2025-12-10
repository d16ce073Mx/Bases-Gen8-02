package org.infotec;

import java.sql.*;
import java.time.LocalDate;


public class InsertarRegistro {

    public InsertarRegistro(){}

    public void InsertarRegistros() throws SQLException {
        Connection conexion = Conexion.getInstance().getConexion();
        String sqlQuery = "Insert into employees (first_name, last_name, birth_date, married) " +
                          "  values (?,?,?,?); ";
        System.out.println(sqlQuery);
        try (PreparedStatement sqlSentence = conexion.prepareStatement(sqlQuery) ){
            // Asignar vaor a los parámetros
            sqlSentence.setString(1,"Plutarco");
            sqlSentence.setString(2,"Galaviz");
            LocalDate birthdate = LocalDate.of(1998,8,01);
            sqlSentence.setDate(3, Date.valueOf(birthdate));
            sqlSentence.setBoolean(4, Boolean.parseBoolean("true"));

            sqlSentence.executeUpdate();
            System.out.println("Registro insertado **");

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}