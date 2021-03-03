/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author YANETH
 */
public class Autobus extends Vehiculo{
    
    private int nro_plazas= 25;
    
    public Autobus(String matricula, int modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.nro_plazas = nro_plazas;
    }

    
    public String getAtributos(){
        return super.getAtributos() + "\nCon una capacidad máxima para transportar pasajeros igual a " + nro_plazas;
    }
    /**
     * @return the nro_plazas
     */
    public int getNro_plazas() {
        return nro_plazas;
    }

    /**
     * @param nro_plazas the nro_plazas to set
     */
    public void setNro_plazas(int nro_plazas) {
        this.nro_plazas = nro_plazas;
    }
    
    public static void main(String[] args) {
        Autobus instClass = new Autobus("EPN333", 2017, 2600);
        System.out.println(instClass.getAtributos());
    }
}
