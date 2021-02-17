/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso1;

/**
 *
 * @author YANETH
 */
public class modificadorAccesoDefault {
    //Equivale a no utilizar ningún modificador de acceso {public, private y protected}
    int kilometraje = 5000;
    
    int calcularKilometraje(){
        int cantidadKMAños = kilometraje*5;
        return cantidadKMAños;
    }
}
