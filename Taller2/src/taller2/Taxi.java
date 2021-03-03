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
public class Taxi extends Vehiculo{
    private int nro_licencia= 12345;

    public Taxi(String matricula, int modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.nro_licencia = nro_licencia;
    }

    
    public String getAtributos(){
        return super.getAtributos() + "\nCon número de licencia " + nro_licencia;
    }
    /**
     * @return the nro_licencia
     */
    public int getNro_licencia() {
        return nro_licencia;
    }

    /**
     * @param nro_licencia the nro_licencia to set
     */
    public void setNro_licencia(int nro_licencia) {
        this.nro_licencia = nro_licencia;
    }
    
    
    public static void main(String[] args) {
        Taxi instClass = new Taxi("EPN333", 2021, 2000);
        System.out.println(instClass.getAtributos());
    }
}
