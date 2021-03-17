/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YANETH
 */
public class ColeccionArrayList {
    //No tiene tamaño fijo
    
    public ArrayList coleccionFrameworks(){
        ArrayList<String> frameworksName = new ArrayList<>();
        //Añadir valores al Array
        frameworksName.add("Laravel");
        frameworksName.add("Vue");
        frameworksName.add("React Native");
        frameworksName.add("Flutter");
        return frameworksName;
    }
    
    public ArrayList coleccionVersionesFramework(){
        ArrayList<Integer> frameworksVersion = new ArrayList<>();
        frameworksVersion.add(8);
        frameworksVersion.add(6);
        frameworksVersion.add(5);
        frameworksVersion.add(5);
        //Modificar valores al Array
        frameworksVersion.set(3,9);
        frameworksVersion.remove(0);
        return frameworksVersion;
    }
    
    
    public void longitudArray(ArrayList<String>nombreC, ArrayList<Integer> versionesC){
        System.out.println("La colección de nombres de frameworks contiene " + nombreC.size() +" ejemplares" 
                + " \ny la colección de versiones contiene " + versionesC.size());
    }
    
    public void imprimirColecciones(ArrayList<String>nombreC , ArrayList<Integer> versionesC){
        System.out.println("Nombres de frameworks " + nombreC + " versiones" + versionesC );
    }
       
    
    //Solicitud: invertir cadena de texto ingresada por el usuario
    public void invertirCadena(){
        //Yaneth Mejia
        //aijeM htenaY
        Scanner entradaUsuario = new Scanner(System.in);
        StringBuilder cadenaAuxiliar = new StringBuilder("");
        String capturaValorIngresadoUser;
        System.out.println("Ingrese su nombre");
        capturaValorIngresadoUser = entradaUsuario.nextLine();
        for(int i = capturaValorIngresadoUser.length()-1; i >=0; i--){
            cadenaAuxiliar.append(capturaValorIngresadoUser.charAt(i));
            //Yaneth
            //012345
            //capturaValorIngresadoUser.length()-1 = h
            //capturaValorIngresadoUser[0] = Y
            //capturaValorIngresadoUser.charAt = Y A N E T H
        }
        System.out.println(cadenaAuxiliar.toString());
    }
    
    public static void main(String[] args) {
        ColeccionArrayList instClass = new ColeccionArrayList();
        ArrayList<String>nombreC = instClass.coleccionFrameworks();
        ArrayList<Integer> versionesC = instClass.coleccionVersionesFramework();
        instClass.imprimirColecciones(nombreC, versionesC);
        instClass.longitudArray(nombreC, versionesC);
        instClass.invertirCadena();
    }
}
