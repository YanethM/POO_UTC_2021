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
public class StringObjectClass {
    static String nombreAsignatura = "POO";

    private String textoStringObject(){
        String textoInicial = "Texto original";
        //Trabajamos la variable como si fuese una variable acumulativa
        textoInicial = textoInicial + " texto adicional";
        return textoInicial;
    }
    
    public static void main(String[] args) {
        StringObjectClass instClass = new StringObjectClass();
        System.out.println(instClass.textoStringObject() + " " + nombreAsignatura);
    }
}
