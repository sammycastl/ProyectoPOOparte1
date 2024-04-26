package com.mycompany.proyectopoodenuncia;

import java.sql.Connection;
import java.util.Scanner;

public class ProyectoPOODenuncia {

    public static void main(String[] args) {
        
        //Conectando a la base de datos
        /*Connection conexion = ConexionBD.getConnection();*/
        

        // Crear un usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Crear un usuario
            Usuario usuario = new Usuario("usuario1", "contraseña123");
            // Mostrar un mensaje de bienvenida
            System.out.println("¡Bienvenido al sistema de denuncias!");
            // Crear un expediente
            Expediente expediente = new Expediente();
            // Agregar algunas funcionalidades básicas
            boolean salir = false;
            while (!salir) {
                System.out.println("\nOpciones:");
                System.out.println("1. Crear denuncia");
                System.out.println("2. Listar denuncias");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        // Crear una denuncia
                        System.out.println("\nCreando una nueva denuncia:");

                        System.out.print("Ingrese el lugar de lo ocurrido: ");
                        scanner.nextLine();
                        String lugar = scanner.nextLine();
                        System.out.print("Ingrese los detalles de la denuncia: ");
                        String detalles = scanner.nextLine();

                        System.out.println("Ingrese los detalles del denunciante:");
                        Persona denunciante = crearPersonaDesdeInput(scanner);

                        System.out.println("Ingrese los detalles del ofendido:");
                        Persona ofendido = crearPersonaDesdeInput(scanner);

                        System.out.println("Ingrese los detalles del denunciado(opcional):");
                        Persona denunciado = crearPersonaDesdeInput(scanner);
                        
                        System.out.println("Ingrese los detalles del testigo:");
                        Persona testigo = crearPersonaDesdeInput(scanner);
                        // seguir este patrón para los demás involucrados 
                        Persona testigos = null;

                        Denuncia nuevaDenuncia = new Denuncia(lugar, detalles, denunciante, ofendido, denunciado, testigos);
                        expediente.agregarDenuncia(nuevaDenuncia);
                        System.out.println("Denuncia creada y agregada al expediente.");
                    }

                    
                    case 2 -> {
                        // Listar denuncias en el expediente
                        System.out.println("\nDenuncias en el expediente:");
                        for (Denuncia d : expediente.getListaDenuncias()) {
                            System.out.println("- Lugar: " + d.getLugar() + ", Detalles: " + d.getDetalles());
                        }
                    }
                    
                    case 3 -> // Salir del programa
                        salir = true;
                        
                    default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            }
            // Cerrar el scanner
        }
    }
        
     private static Persona crearPersonaDesdeInput(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        return new Persona(nombre);
    }
     //Desconectarse de la base de datos
     /*  ConexionBD.closeConnection();*/

    void listarDenuncias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void crearDenuncia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
