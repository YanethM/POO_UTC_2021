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
public class StringBuilderClass {
    //Tipo de dato mutable
    
    private StringBuilder metodoInsert(){
        StringBuilder cadenaOriginal = new StringBuilder("Programación");
        StringBuilder universidad = new StringBuilder("Universidad Autonoma de");
//        El método insert() recibe dos parametros: 
//        1. Número de carácter a partir del cual insertara el texto
//        2. El texto a insertar 
        universidad.insert(23,"Manizales");
        return cadenaOriginal.insert(12, " Orientada a objetos");
    }
    
    private StringBuilder metodoDelete(){
        StringBuilder universidad = new StringBuilder("Universidad Autonoma de Bucaramanga");
//        El método delete() recibe dos parametros: 
//        1. Número de carácter a partir del cual eliminará el texto
//        2. Número de carácter hasta el cual eliminará el texto
        return universidad.delete(20,35);
    }
    
    private void metodoToString(){
        StringBuilder universidad = new StringBuilder("Universidad Autonoma de Manizales");
        String convertirCadenaString = universidad.toString();
        convertirCadenaString = universidad + " año 2021.";
        System.out.println(convertirCadenaString);
    }
    private void longitudCadena(){
        StringBuilder universidad = new StringBuilder("Universidad Autonoma de Manizales");
        System.out.println("La longitud del texto corresponde a " + universidad.length() + " caracteres.");
    }
    public static void main(String[] args) {
        StringBuilderClass instClass = new StringBuilderClass();
        System.out.println(instClass.metodoInsert());
        System.out.println(instClass.metodoDelete());
        instClass.metodoToString();
        instClass.longitudCadena();
    }
}
