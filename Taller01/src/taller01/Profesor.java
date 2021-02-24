/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author YANETH
 */
public class Profesor {
    
    private String nombre;
    private int edad;
    protected int añosConsolidados;
   
    
    public Profesor(int añosConsolidados){
        super();
        this.añosConsolidados = añosConsolidados;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the añosConsolidados
     */
    public int getAñosConsolidados() {
        return añosConsolidados;
    }

    /**
     * @param añosConsolidados the añosConsolidados to set
     */
    public void setAñosConsolidados(int añosConsolidados) {
        this.añosConsolidados = añosConsolidados;
    }
    
}
