/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresaccesojava;

/**
 *
 * @author YANETH
 */
public class modificadorProtected {
    //Los miembros de datos de la clase son accesibles dentro del mismo paquete 
    //o subclases en paquetes diferentes
    
    protected void mostrarMensaje(){
        System.out.println("Saludo desde el método protected de la clase modificadorProtected");
    }
    
    protected void responderPregunta(){
        System.out.println("Sólo debe extender una vez de esta clase y tiene acceso a todos los miembros de datos");
    }
}
