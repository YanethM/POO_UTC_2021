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
public class modificadorPrivate {
    //Culaquier otra clase del mismo paquete NO podrá acceder a estos miembros
    //Las clases e interfaces NO se pueden declarar como privadas
    private void mostrarMensaje(){
        System.out.println("Hola desde el método private de la clase modificadorPrivate");
    }
}
