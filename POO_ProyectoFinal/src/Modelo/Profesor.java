/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public abstract class Profesor implements Persona {
    // Ataributos............................................
    private String P_Nombre;
    private String P_Apellido;
    private String P_profesorID;
    
    // Metodos............................................
    public Profesor(){
    }

    public Profesor(String P_Nombre, String P_Apellido, String P_profesor) {
        this.P_Nombre = P_Nombre;
        this.P_Apellido = P_Apellido;
        this.P_profesorID = P_profesorID;
    }

    @Override
    public String Resumen() {
        String cadena = "Nombre: "+ this.P_Nombre +
                "\nApellido: " + this.P_Apellido +
                "\nProfesor: " + this.P_profesorID;
        return cadena;
    }
    
    // Getters and setters............................................

    public String getP_Nombre() {
        return P_Nombre;
    }

    public void setP_Nombre(String P_Nombre) {
        this.P_Nombre = P_Nombre;
    }

    public String getP_Apellido() {
        return P_Apellido;
    }

    public void setP_Apellido(String P_Apellido) {
        this.P_Apellido = P_Apellido;
    }

    public String getP_profesor() {
        return P_profesorID;
    }

    public void setP_profesor(String P_profesor) {
        this.P_profesorID = P_profesor;
    }
    
    
}
