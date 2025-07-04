/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public class Curso extends Profesor implements Tipo{
    
    // Atributos
    private String CursoID;
    private String NombreCurso;
    
    // Metodos

    public Curso() {
    }

    public Curso(String CursoID, String NombreCurso) {
        this.CursoID = CursoID;
        this.NombreCurso = NombreCurso;
    }
    
    public Curso(String P_Nombre, String P_Apellido, String P_profesor, String CursoID, String NombreCurso) {
        super(NombreCurso, P_Apellido, P_profesor);
        this.CursoID = CursoID;
        this.NombreCurso = NombreCurso;
    }
    
    // Getters and setters

    public String getCursoID() {
        return CursoID;
    }

    public void setCursoID(String CursoID) {
        this.CursoID = CursoID;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }
    
}
