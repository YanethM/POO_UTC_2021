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
public class accederClasePrivate {
    public static void main(String[] args) {
        //Tratando de acceder al método privado de otra clase dentro del mismo paquete
        modificadorPrivate instClass = new modificadorPrivate();
        //instClass.mostrarMensaje();
    }
}
