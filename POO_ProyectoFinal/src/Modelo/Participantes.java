/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public class Participantes implements Persona{
    // Atributos...................................
    private String Pat_Nombre;
    private String Pat_Apellido;
    private String ParticipanteID;
    
    // Metodos......................................
    public Participantes() {
    }

    public Participantes(String Pat_Nombre, String Pat_Apellido, String Participante) {
        this.Pat_Nombre = Pat_Nombre;
        this.Pat_Apellido = Pat_Apellido;
        this.ParticipanteID = Participante;
    }

    @Override
    public String Resumen() {
        String cadena = "Nombre: " + this.Pat_Nombre +
                "\n Apellido: " + this.Pat_Apellido +
                "\nParticipante ID: " + this.ParticipanteID;
        
        return cadena;
    }
    
    // Getters and setters

    public String getPat_Nombre() {
        return Pat_Nombre;
    }

    public void setPat_Nombre(String Pat_Nombre) {
        this.Pat_Nombre = Pat_Nombre;
    }

    public String getPat_Apellido() {
        return Pat_Apellido;
    }

    public void setPat_Apellido(String Pat_Apellido) {
        this.Pat_Apellido = Pat_Apellido;
    }

    public String getParticipanteID() {
        return ParticipanteID;
    }

    public void setParticipanteID(String ParticipanteID) {
        this.ParticipanteID = ParticipanteID;
    }
    
    
    
}
