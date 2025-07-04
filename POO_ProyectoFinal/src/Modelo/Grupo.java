/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public class Grupo {
    // Atributos
    private Participantes ParticipanteA;
    private String ProyectoID;
    private String NombreCurso;
    private String NombreGrupo;

    // Metodos

    public Grupo() {
    }

    public Grupo(Participantes ParticipanteA, String ProyectoID, String NombreCurso, String NombreGrupo) {
        this.ParticipanteA = ParticipanteA;
        this.ProyectoID = ProyectoID;
        this.NombreCurso = NombreCurso;
        this.NombreGrupo = NombreGrupo;
    }
    
    public String Resumen_Grupo(){
        String cadena = "Participante: " + this.ParticipanteA +
                "ID del proyecto: " + this.ProyectoID +
                "Nombre del curso: " + this.NombreCurso + 
                "Nombre del grupo: " + this.NombreGrupo;
        return cadena;
    }
    
    // Getters and setters............................

    public Participantes getParticipanteA() {
        return ParticipanteA;
    }

    public void setParticipanteA(Participantes ParticipanteA) {
        this.ParticipanteA = ParticipanteA;
    }

    public String getProyectoID() {
        return ProyectoID;
    }
}
