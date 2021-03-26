/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YANETH
 */
public class ProyectoArrayList {
    
    ArrayList<Double> notasEst;
    
    /**
     * @param args the command line arguments
     */
    //Constructor de la clase con la colección ArrayList
    public ProyectoArrayList(){
        notasEst = new ArrayList<>();
    }
    
    //Este método no tenia que retornar valor al usuario
    //El usuario no estaba consultando un valor, estaba añadiendo uno nuevo
    public void añadirNotaEstudiante(double notaEstudiante){
        notasEst.add(notaEstudiante);
    }
    
    //Es una función que retorna el valor consultado por el usuario, promedio de notas
    public double promedioNotas(){
        double sumaTotalNotas = 0;
        for(double nota:notasEst){
            //sumaTotalNotas= sumaTotalNotas+ nota;
            sumaTotalNotas += nota;
        }
        //el método size() nos devuelve el tamaño del arrayList y en este caso nos sirve
        //debido a que sería la cantidad de notas que tiene
        return sumaTotalNotas/notasEst.size();
    }
    
    //Función que retorna el valor consultado por el usuario, cantidad notas aprobadas
    public int trabajosAprobados(){
        int notasAprobadas = 0;
        //iteramos sobre cada una de las notas contenidas en el arrayList
        for(double nota:notasEst){
            if(nota>=3.5)
                notasAprobadas++;
        }
        return notasAprobadas;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcionMenu = 0;
        double notaEstudiante;
        ProyectoArrayList instClass = new ProyectoArrayList();
        Scanner entradaUser = new Scanner(System.in);
        do{
            System.out.println("\nSeleccione una de las siguiente opciones del menu:" +
                    "\n1. Añadir nota a estudiante Yaneth Mejía" + "\n2. Consultar promedio de notas de Yaneth Mejía" +
                    "\n3. Ver notas aprobadas por la estudiante Yaneth Mejía" + "\n4. Cancelar");
            opcionMenu = Integer.parseInt(entradaUser.nextLine());
            //Validamos mediante un switch la opción elegida por el usuario
            switch(opcionMenu){
                //User eligio añadir nota de estudiante
                case 1:
                    System.out.println("Ingrese nota: ");
                    notaEstudiante= Double.parseDouble(entradaUser.nextLine());
                    instClass.añadirNotaEstudiante(notaEstudiante);
                    break;
                    //User eligio consultar el promedio de notas
                case 2:
                    System.out.println("Promedio actual del estudiante: " + instClass.promedioNotas());
                    break;
                    //User eligio consultar las notas aprobadas por el estudiante
                case 3:
                    System.out.println("Notas aprobadas son " + instClass.trabajosAprobados());
                    break;
            }
        }while(opcionMenu!=4);
    } 
}
