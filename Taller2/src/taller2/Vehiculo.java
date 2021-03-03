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
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    
    private String matricula;
    private int modelo;
    private int potenciaCV;
   
    
    public Vehiculo(String matricula, int modelo, int potencia){
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potencia;
    }
    
    public String getAtributos(){
        return "La matricula del vehiculo es: " + matricula + " \nEs modelo año " + modelo + "\nY tiene una potencia correspondiente a " + potenciaCV + " caballos.";
    }
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the potenciaCV
     */
    public int getPotenciaCV() {
        return potenciaCV;
    }

    /**
     * @param potenciaCV the potenciaCV to set
     */
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
}
