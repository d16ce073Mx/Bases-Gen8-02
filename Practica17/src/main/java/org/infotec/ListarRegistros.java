package org.infotec;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* 1. Conexion a BD
      PreparedStatement  -> String
      "Select * from employees";
      Select -> Resultset -> Múltiples registros
      Try-Catch ??   Porque hago una conexion a algo externo de java
        Resultset -> ExecuteQuery
                   -> Parámetros

        Ciclo For
        -> Registros en objetos
        -> Lista de objetos HashMap, ListObject


 Librerias SQL

 Tabla Employees
    Employee_id  int
    birthdate    date
    firstname    String
    lastname     String
    married ->   Booleano
 */
public class ListarRegistros {

    public ListarRegistros() {
    }

    public void ListarRegistros() throws SQLException {
        Connection conexion = Conexion.getInstance().getConexion();
        String sqlQuery = "Select * from employees";

        try (PreparedStatement sqlSentence = conexion.prepareStatement(sqlQuery) ){
          try (ResultSet resultset =  sqlSentence.executeQuery()){
              while(resultset.next()){
                  System.out.println("Impresion de Registro:");
                  System.out.println("Nombre: " + resultset.getString("first_name"));
                  System.out.println("Apellido: "+resultset.getString("last_name"));
                  System.out.println("Fecha Nacimiento:"+resultset.getDate("birth_date"));
                  System.out.println("Correo: "+resultset.getString("email"));
                  System.out.println("Estado Civil: "+resultset.getBoolean("married"));
              }
          }

        } catch(SQLException e){
            e.printStackTrace();
        }



    }
}
