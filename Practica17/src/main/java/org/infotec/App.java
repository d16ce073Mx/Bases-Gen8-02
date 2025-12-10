package org.infotec;
import java.sql.Connection;
import java.sql.SQLException;


public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println("List of Employees");
        ListarRegistros lista = new ListarRegistros();
        lista.ListarRegistros();
        InsertarRegistro insert = new InsertarRegistro();
        insert.InsertarRegistros();
        lista.ListarRegistros();


    }
}
