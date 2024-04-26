
package com.mycompany.proyectopoodenuncia;

public class Usuario {
    private String nombre;
    private String contraseña;
    private Rol rol;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Método para validar las credenciales del usuario
    public boolean validarCredenciales(String nombre, String contraseña) {
        return this.nombre.equals(nombre) && this.contraseña.equals(contraseña);
    }

    // Método para cambiar la contraseña del usuario
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }
    
    // Metodo para obtener el rol del usuario
    public Rol getRol(){
        return rol;
    }
     // Método para establecer el rol del usuario
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    // Método para comprobar si el usuario tiene permiso de administrador
    public boolean esAdmin() {
        return this.rol == Rol.ADMINISTRADOR;
    }

    // Método para comprobar si el usuario tiene permiso de crear denuncias
    public boolean puedeCrearDenuncias() {
        return this.rol == Rol.ADMINISTRADOR || this.rol == Rol.USUARIO_NORMAL;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

enum Rol {
    ADMINISTRADOR,
    USUARIO_NORMAL
}
