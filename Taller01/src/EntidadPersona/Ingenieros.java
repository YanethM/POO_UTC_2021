/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadPersona;

/**
 *
 * @author YANETH
 */
public class Ingenieros extends Persona{
    private String tipoIngenieria;
    //El uso de super() y de this() es excluyente, se debe utilizar sólo uno
    //Trabajando el constructor con super()
    public Ingenieros(String nombre, String tipoIngenieria) {
        super(nombre);
        this.tipoIngenieria= tipoIngenieria;
    }
    /**
     * @return the tipoIngenieria
     */
    public String getTipoIngenieria() {
        return tipoIngenieria;
    }

    /**
     * @param tipoIngenieria the tipoIngenieria to set
     */
    public void setTipoIngenieria(String tipoIngenieria) {
        this.tipoIngenieria = tipoIngenieria;
    }
    public static void main(String[] args) {
        Ingenieros instClass = new Ingenieros("Diego", "Mecatronica");
    }
}
