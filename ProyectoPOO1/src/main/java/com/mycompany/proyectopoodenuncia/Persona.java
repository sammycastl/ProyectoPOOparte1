
package com.mycompany.proyectopoodenuncia;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String genero;
    private String dni;
    private String direccion;
    private String telefono;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.genero = genero;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método para validar los datos de una persona
    public boolean validarDatos() {
    // Verificar que la edad sea un número positivo y no mayor que 150 (solo como ejemplo)
    if (edad <= 0 || edad > 150) {
        System.out.println("La edad debe ser un número positivo y no mayor que 150.");
        return false;
    }
    
    // Verificar que el DNI tenga un formato válido (8 dígitos numéricos)
    if (!dni.matches("\\d{13}")) {
        System.out.println("El DNI debe tener 13 dígitos numéricos.");
        return false;
    }

    
    // Verificar que el sexo sea "M" o "F"
    if (!sexo.equals("Masculino") && !sexo.equals("Femenino")) {
        System.out.println("El sexo debe ser 'Masculino' o 'Femenino'.");
        return false;
    }

    // Verificar que el teléfono tenga 8 dígitos numéricos
    if (!telefono.matches("\\d{8}")) {
        System.out.println("El teléfono debe tener 8 dígitos numéricos.");
        return false;
    }


    // Si todas las validaciones pasan, retornar true
    return true;
}



    // Método para mostrar información sobre la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Género: " + genero);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    // Métodos para actualizar los datos de una persona
    public void actualizarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void actualizarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public void actualizarSexo(String nuevoSexo) {
        this.sexo = nuevoSexo;
    }

    public void actualizarGenero(String nuevoGenero) {
        this.genero = nuevoGenero;
    }

    public void actualizarDni(String nuevoDni) {
        this.dni = nuevoDni;
    }

    public void actualizarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public void actualizarTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }

    void getNombre() {
    }

    void add(Persona testigo) {
    }
    
    
}
