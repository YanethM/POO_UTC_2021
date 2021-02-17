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
public class modificadorAccessPrivate {
    //Al elemento que se quiere acceder sólo es accesible al interior de la clase
    //Muy habitual utilizarlo en atributos para encapsulación => principio del lenguaje de programación Java
    //Los atributos de las clases sólo se pueden editar a través de métodos
    //GET() Es para consultar el valor de un atributo
    //SET() Es para editar el valor de un atributo
    
    private int cant_pasajeros;
    private int capacidad_pasajeros =4;
    private int consumo_combustible;
    private String modelo;

    /**
     * @return the cant_pasajeros
     */
    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    /**
     * @param cant_pasajeros the cant_pasajeros to set
     */
    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }

    /**
     * @return the capacidad_pasajeros
     */
    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    /**
     * @param capacidad_pasajeros the capacidad_pasajeros to set
     */
    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    /**
     * @return the consumo_combustible
     */
    public int getConsumo_combustible() {
        return consumo_combustible;
    }

    /**
     * @param consumo_combustible the consumo_combustible to set
     */
    public void setConsumo_combustible(int consumo_combustible) {
        this.consumo_combustible = consumo_combustible;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
