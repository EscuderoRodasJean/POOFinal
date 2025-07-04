/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public class Unidad {
    // Atributos
    private String IDUnidad;
    private String NombreUnidad;
    private int NumeroUnidad;
    private Curso CursoX;
    private char Edificio;
    private String fecha;
    private String lugar;
    
    // Metodos

    public Unidad() {
    }

    public Unidad(String IDUnidad, String NombreUnidad, int NumeroUnidad, Curso CursoX, char Edificio, String fecha, String lugar) {
        this.IDUnidad = IDUnidad;
        this.NombreUnidad = NombreUnidad;
        this.NumeroUnidad = NumeroUnidad;
        this.CursoX = CursoX;
        this.Edificio = Edificio;
        this.fecha = fecha;
        this.lugar = lugar;
    }
    
    public String Resumen_Unidad(){
        String cadena = "ID unidad: " + this.IDUnidad +
                "\nNombre de unidad: " + this.NombreUnidad +
                "\nNumero de unidad: " + this.NumeroUnidad +
                "\nCurso: " + this.CursoX +
                "\nEdificio: "+ this.Edificio + 
                "\nFecha: " + this.fecha +
                "\nLugar: " + this.lugar;
                
                return cadena;
    }
    
    // Getters and setters

    public String getIDUnidad() {
        return IDUnidad;
    }

    public void setIDUnidad(String IDUnidad) {
        this.IDUnidad = IDUnidad;
    }

    public String getNombreUnidad() {
        return NombreUnidad;
    }

    public void setNombreUnidad(String NombreUnidad) {
        this.NombreUnidad = NombreUnidad;
    }

    public int getNumeroUnidad() {
        return NumeroUnidad;
    }

    public void setNumeroUnidad(int NumeroUnidad) {
        this.NumeroUnidad = NumeroUnidad;
    }

    public Curso getCursoX() {
        return CursoX;
    }

    public void setCursoX(Curso CursoX) {
        this.CursoX = CursoX;
    }

    public char getEdificio() {
        return Edificio;
    }

    public void setEdificio(char Edificio) {
        this.Edificio = Edificio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
