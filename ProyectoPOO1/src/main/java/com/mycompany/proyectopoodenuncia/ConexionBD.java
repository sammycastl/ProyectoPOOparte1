/*package com.mycompany.proyectopoodenuncia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD{
    private static Connection conexion = null;

    private ConexionBD() { } 

    public static Connection getConnection() {
        if (conexion == null) {
            try {
                String url = "";
                String usario = "";
                String contrasena = "";
                
                conexion = DriverManager.getConnection(url, usario, contrasena);
                System.out.println("Conexión establecida con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos: " + e.getMessage());
                throw new RuntimeException("Error al conectar a la base de datos", e);
            }
        }
        return conexion;
    }

    public static void closeConnection() {
        if (conexion != null) {
            try {
                conexion.close();
                conexion = null;
                System.out.println("Conexión cerrada con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}*/