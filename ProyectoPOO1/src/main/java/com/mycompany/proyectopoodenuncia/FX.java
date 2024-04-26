package com.mycompany.proyectopoodenuncia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX extends Application {

    private ProyectoPOODenuncia proyecto;

    @Override
    public void start(Stage primaryStage) {
        // Inicializar el proyecto
        proyecto = new ProyectoPOODenuncia();

        // Crear etiqueta con el mensaje de bienvenida
        Label label = new Label("¡Bienvenido al sistema de denuncias!");

        // Crear botones para acciones
        Button btnCrearDenuncia = new Button("Crear Denuncia");
        Button btnListarDenuncias = new Button("Listar Denuncias");
        Button btnSalir = new Button("Salir");

        // Manejar eventos de los botones
        btnCrearDenuncia.setOnAction(e -> proyecto.crearDenuncia());
        btnListarDenuncias.setOnAction(e -> proyecto.listarDenuncias());
        btnSalir.setOnAction(e -> primaryStage.close());

        // Alinear los botones horizontalmente
        HBox hbox = new HBox(10, btnCrearDenuncia, btnListarDenuncias, btnSalir);
        hbox.setPadding(new Insets(10));

        // Crear contenedor VBox y agregar elementos
        VBox root = new VBox(label, hbox);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        // Crear la escena y agregar el contenedor VBox
        Scene scene = new Scene(root, 400, 200);

        // Establecer la escena en la ventana principal
        primaryStage.setScene(scene);

        // Establecer el título de la ventana
        primaryStage.setTitle("Sistema de Denuncias");

        // Mostrar la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*
public class FX extends Application {

    private ProyectoPOODenuncia proyecto;

    @Override
    public void start(Stage primaryStage) {
        // Inicializar el proyecto
        proyecto = new ProyectoPOODenuncia();

        // Crear etiqueta con el mensaje de bienvenida
        Label label = new Label("¡Bienvenido al sistema de denuncias!");

        // Crear campos de texto para entrada de búsqueda
        TextField txtLugar = new TextField();
        txtLugar.setPromptText("Ingrese el lugar de la denuncia");

        TextField txtDelito = new TextField();
        txtDelito.setPromptText("Ingrese el tipo de delito");

        // Crear botones para acciones
        Button btnCrearDenuncia = new Button("Crear Denuncia");
        Button btnListarDenuncias = new Button("Listar Denuncias");
        Button btnBuscarPorLugar = new Button("Buscar por Lugar");
        Button btnBuscarPorDelito = new Button("Buscar por Delito");
        Button btnEliminarDenuncia = new Button("Eliminar Denuncia");
        Button btnSalir = new Button("Salir");

        // Manejar eventos de los botones
        btnCrearDenuncia.setOnAction(e -> proyecto.crearDenuncia());
        btnListarDenuncias.setOnAction(e -> proyecto.listarDenuncias());
        btnBuscarPorLugar.setOnAction(e -> buscarPorLugar(txtLugar.getText()));
        btnBuscarPorDelito.setOnAction(e -> buscarPorDelito(txtDelito.getText()));
        btnEliminarDenuncia.setOnAction(e -> eliminarDenuncia());
        btnSalir.setOnAction(e -> primaryStage.close());

        // Alinear los botones horizontalmente
        HBox hbox1 = new HBox(10, btnCrearDenuncia, btnListarDenuncias, btnSalir);
        HBox hbox2 = new HBox(10, txtLugar, btnBuscarPorLugar, txtDelito, btnBuscarPorDelito, btnEliminarDenuncia);
        hbox1.setPadding(new Insets(10));
        hbox2.setPadding(new Insets(10));

        // Crear contenedor VBox y agregar elementos
        VBox root = new VBox(label, hbox1, hbox2);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        // Crear la escena y agregar el contenedor VBox
        Scene scene = new Scene(root, 600, 300);

        // Establecer la escena en la ventana principal
        primaryStage.setScene(scene);

        // Establecer el título de la ventana
        primaryStage.setTitle("Sistema de Denuncias");

        // Mostrar la ventana
        primaryStage.show();
    }

    private void buscarPorLugar(String lugar) {
        List<Denuncia> denunciasEncontradas = proyecto.buscarPorLugar(lugar);
        if (denunciasEncontradas.isEmpty()) {
            System.out.println("No se encontraron denuncias en el lugar especificado.");
        } else {
            System.out.println("Denuncias encontradas en el lugar especificado:");
            for (Denuncia denuncia : denunciasEncontradas) {
                denuncia.mostrarInformacion();
            }
        }
    }

    private void buscarPorDelito(String delito) {
        List<Denuncia> denunciasEncontradas = proyecto.buscarPorDelito(delito);
        if (denunciasEncontradas.isEmpty()) {
            System.out.println("No se encontraron denuncias relacionadas con el delito especificado.");
        } else {
            System.out.println("Denuncias relacionadas con el delito especificado:");
            for (Denuncia denuncia : denunciasEncontradas) {
                denuncia.mostrarInformacion();
            }
        }
    }

    private void eliminarDenuncia() {
        // Aquí puedes implementar la lógica para seleccionar y eliminar una denuncia específica
    }

    public static void main(String[] args) {
        launch(args);
    }
}

*/