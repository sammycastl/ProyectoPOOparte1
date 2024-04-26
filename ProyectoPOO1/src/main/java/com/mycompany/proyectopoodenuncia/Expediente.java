
package com.mycompany.proyectopoodenuncia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Expediente {
    private LocalDateTime fecha;
    private Random random;
    private Scanner scanner;

    private String descripcion;
    private String denunciante;
    private String lugar;
    private String denunciado;
    private String ofendido;
    private String delito;
    private String testigo;

    private int numero;

    private List<Denuncia> listaDenuncias;

    public Expediente() {
        fecha = LocalDateTime.now();
        random = new Random();
        scanner = new Scanner(System.in);
        listaDenuncias = new ArrayList<>();
        numero = 10000 + random.nextInt(90000);
        escribirExpediente();
    }

    private void escribirExpediente() {
        System.out.println("----------------------------------------------------------");
        System.out.println("                    Expediente                            ");
        System.out.println("Fecha y hora de creación: " + fecha);
        System.out.println("No. " + numero);
        System.out.print("Nombre del denunciante: ");
        denunciante = scanner.nextLine();
        System.out.print("Lugar de lo ocurrido: ");
        lugar = scanner.nextLine();
        System.out.print("Nombre del acusado (opcional): ");
        denunciado = scanner.nextLine();
        System.out.print("Nombre del ofendido: ");
        ofendido = scanner.nextLine();
        System.out.print("Tipo de delito:");
        delito = scanner.nextLine();
        System.out.print("Descripción de lo ocurrido: ");
        descripcion = scanner.nextLine();
        System.out.println("----------------------------------------------------------");

        // Crear una nueva denuncia y agregarla al expediente
        Denuncia nuevaDenuncia = new Denuncia(this.descripcion, this.descripcion, this.denunciado, this.ofendido, this.delito, this.testigo);
        listaDenuncias.add(nuevaDenuncia);
    }

    // Método para buscar denuncias por lugar
    public List<Denuncia> buscarPorLugar(String lugar) {
        List<Denuncia> denunciasEncontradas = new ArrayList<>();
        for (Denuncia denuncia : listaDenuncias) {
            if (denuncia.getLugar().equalsIgnoreCase(lugar)) {
                denunciasEncontradas.add(denuncia);
            }
        }
        return denunciasEncontradas;
    }

    // Método para buscar denuncias por delito
    public List<Denuncia> buscarPorDelito(String delito) {
        List<Denuncia> denunciasEncontradas = new ArrayList<>();
        for (Denuncia denuncia : listaDenuncias) {
            if (denuncia.getDelitos().contains(delito)) {
                denunciasEncontradas.add(denuncia);
            }
        }
        return denunciasEncontradas;
    }

    // Método para eliminar una denuncia del expediente
    public void eliminarDenuncia(int numeroDenuncia) {
        for (Denuncia denuncia : listaDenuncias) {
            if (denuncia.getNumero() == numeroDenuncia) {
                listaDenuncias.remove(denuncia);
                return;
            }
        }
        System.out.println("Denuncia no encontrada.");
    }

    // Getters para los atributos de la clase Expediente
    public String getDenunciante() {
        return denunciante;
    }

    public String getDenunciado() {
        return denunciado;
    }

    public String getOfendido() {
        return ofendido;
    }

    public String getDelito() {
        return delito;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    // Método para obtener la lista de denuncias en el expediente
    public List<Denuncia> getListaDenuncias() {
        return listaDenuncias;
    }

    Iterable<Denuncia> obtenerDenuncias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarDenuncia(Denuncia denuncia) {
        listaDenuncias.add(denuncia);

    }
}
