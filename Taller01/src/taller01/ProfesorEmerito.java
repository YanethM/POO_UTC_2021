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
public class ProfesorEmerito extends Profesor{
    private int añosEmerito=5;
    
    //Hay dos tipos de constructores en Java this() y super()
    public ProfesorEmerito(int añosConsolidados){
        super(añosConsolidados);
    }
    
    public double obtenerSalarioBase (){
        return 3500000 + añosConsolidados * 40 * añosEmerito;
    }
    
    public static void main(String[] args) {
        ProfesorEmerito instClass = new ProfesorEmerito(15);
        System.out.println(instClass.obtenerSalarioBase());
    }
}
