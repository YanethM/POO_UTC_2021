/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadPersona;

/**
 *
 * @author YANETH
 */
public class Deportista extends Persona{
    private String tipoDeporte;
    
    public Deportista(String nombre) {
        super(nombre);
    }
    
    public String mostrarMensaje(){
        return "El nombre del deportista es "+ nombre + "El deporte que practica es " + tipoDeporte;
    }
    
    
}
