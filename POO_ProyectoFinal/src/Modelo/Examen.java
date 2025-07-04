/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public class Examen extends Unidad{
    // Atributos
    private String Peso;
    private String NombreExamen;
    
    // Metodos

    public Examen() {
    }

    public Examen(String Peso, String NombreExamen) {
        this.Peso = Peso;
        this.NombreExamen = NombreExamen;
    }
    
    public String Resumen(){
        String cadena = "Peso: " + this.Peso +
                "Nombre del examen: " + this.NombreExamen;
                
        return cadena;
    }
    
}
