/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposobjetos;

/**
 *
 * @author YANETH
 */
public class ObjetosInmutablesJava {
//  String e Integer  
//  Inmutable = No se puede cambiar una vez construido
//  Se definen como final
//  y utiliza una copia para protegerse de cambios desde el código del cliente
    public void objetoStringInmutable(){
        String nombreAsignatura = "POO";
        //Devuelve un nuevo objeto
        nombreAsignatura.concat(" Copia1 de objeto nombreAsignatura");
        System.out.println(nombreAsignatura);
    }
    public static void main(String[] args) {
        ObjetosInmutablesJava instClass = new ObjetosInmutablesJava();
        instClass.objetoStringInmutable();
    }
}
