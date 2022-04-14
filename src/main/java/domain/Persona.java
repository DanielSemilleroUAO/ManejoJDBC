/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author adseglocdom
 */
public class Persona {
    
    private int idUsuario;
    private String name;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Persona(String name, String apellido, String email, String telefono) {
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona(int idUsuario, String name, String apellido, String email, String telefono) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    
    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } 

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idUsuario=" + idUsuario + ", name=" + name + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }

    

}
