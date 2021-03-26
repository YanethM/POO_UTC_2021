/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarraylist;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author YANETH
 */
public class ColeccionHashMap {
    //Son otro tipo de colección al igual que el ArrayList
    //Los elementos no tienen posición ni orden, pero si una clave única asociada
    //Siempre que se cree un nuevo valor, se debe de crear la clave y el valor(key, value)
    
    HashMap<Integer, String> tablaEstudiantes = new HashMap<>();
    //put()
    public void añadirEstudiantes(){
        tablaEstudiantes.put(1, "Juan Diego");
        tablaEstudiantes.put(2, "Veronica");
        tablaEstudiantes.put(3, "Andres");
        tablaEstudiantes.put(4, "Sebastián");
        System.out.println(tablaEstudiantes);
    }
    //Obtener UN valor especifico de la tabla consultando por su clave
    public void obtenerNombreEstudiante(){
        //Consultamos el nombre del estudiante cuya clave es: 2
        System.out.println("\nEl nombre del estudiante cuya clave es 2, es: " + tablaEstudiantes.get(2));
    }
    
    //Obtener TODOS los valores de la tabla
    public void obtenerTodosLosNombres(){
        //El tipo de dato Collection, devuelve una colección solo con los valores de un HasMap
        //El método .values() devuelve a Juan Diego, Veronica, Andres, Sebastian
        Collection<String> nombresEstudiantes = tablaEstudiantes.values();
        //Iteramos sobre la colección, NO sobre HashMap
        System.out.println("\nLos estudiantes del grupo 1 son");
        for(String nombreEstudiante:nombresEstudiantes){
            System.out.println(nombreEstudiante);
        }
    }
    
    //Eliminar un valor dependiendo de su clave
    public void eliminarEstudiante(){
        System.out.println("Se ha eliminado del grupo a la estudiante: " + tablaEstudiantes.remove(2));
    }
    
    
    public static void main(String[] args) {
        ColeccionHashMap instClass = new ColeccionHashMap();
        instClass.añadirEstudiantes();
        instClass.obtenerNombreEstudiante();
        instClass.obtenerTodosLosNombres();
        instClass.eliminarEstudiante();
    }
}
