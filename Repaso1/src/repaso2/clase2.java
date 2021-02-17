/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;
//La sentencia import permite usar clases de otros paquetes
import repaso1.modificarAccesoPublic;
import repaso1.modificadorAccesoDefault;
/**
 *
 * @author YANETH
 */
public class clase2 {
    
    public void mergePdf(String pdf1,String pdf2,String pdf3){
        System.out.println("Se han unido los PDF con nombre "+ pdf1+", " + pdf2+" y "+pdf3);
    }
    
    //Método ejecutor psvm+TAB
    public static void main(String[] args) {
        //Instancia de la clase
        modificarAccesoPublic instClaseExterna = new modificarAccesoPublic();
        modificadorAccesoDefault instClaseExt2 = new modificadorAccesoDefault();
        
        instClaseExterna.escanear("Hoja de vida", 4300);      
    }
 
}
