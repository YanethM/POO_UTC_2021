/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;
import modificadoresaccesojava.*;
/**
 *
 * @author YANETH
 */
public class DemoAccederClaseProtected extends modificadorProtected{
    public static void main(String[] args) {
        //Se crea una instancia de la misma clase para poder extender el método de la superclase
        DemoAccederClaseProtected instClass = new DemoAccederClaseProtected();
        instClass.mostrarMensaje();
        instClass.responderPregunta();
    }
}
