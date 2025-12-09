package org.infotec;

public class Conexion {
    private static DbConnection instance = null;
    private Connection conn = null;

    private Conexion() {}

    private void init() throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/library";
        final String USER = "root";
        final String PASS = "12345";

        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected to database");
    }

    public Conexion getConnection() {
        return conn;
    }

    public static Connection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DbConnection();
            instance.init();
        }
        return instance.getConnection();
    }

}






