package org.infotec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//https://jdbc.postgresql.org/download/


public class Conexion {
    private static Conexion instance= null;
    private Connection conexion = null;

    private Conexion(){}

    private void  init() throws SQLException {
      try{
            System.out.println("Dentro del TRY");
            Class.forName("org.postgresql.Driver");
            final String HOST = "jdbc:postgresql://127.0.0.1/mibase";
            final String user = "postgres";
            final String pass = "postgres";

            this.conexion = DriverManager.getConnection(HOST,user,pass);

        System.out.println("Conectado a BD");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConexion(){
        return conexion;
    }

    public static Conexion getInstance() throws SQLException {
        if(instance == null){
            instance = new Conexion();
            instance.init();
        } else if (instance.getConexion().isClosed()) {
            instance = new Conexion();
        }
        return instance;
    }





}

  /*1. HOST y puerto: la maquina servidor de BD
  2. Driver MySQL, Postgres, Oracle, SQL Server
      Maven, Descargar el driver
  3. Credenciales  Usuario, contraseña
    */




