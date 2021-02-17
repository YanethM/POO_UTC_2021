/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso1;
import repaso2.clase2;
/**
 *
 * @author YANETH
 */
public class modificarAccesoPublic {

    /**
     * @param args the command line arguments
     */
    //Es un método porque tiene la palabra reservada VOID
   public void imprimir(String datosImprimir1, String datosImprimir2) {
        System.out.println("Imprimiendo " + datosImprimir1 + " Otro valor " + datosImprimir2);
    }
   
   //lowerCamelCase: nroPuertoImpresora
   //upperCamelCase: NroPuertoImpresora
   
   public void escanear(String nombreDocumento, int nroPuerto){
       System.out.println("Escaneando el documento " + nombreDocumento +" por el puerto número "+ nroPuerto);
   }
    
   //Método ejecutor
    public static void main(String[] args) {
        // Creando instancia de las clases
        modificarAccesoPublic instClase = new modificarAccesoPublic();
        modificadorAccesoDefault insClaseDefault = new modificadorAccesoDefault();
        modificadorAccessPrivate insClasePrivate = new modificadorAccessPrivate();
        
        //instancia esta llamando el método imprimir()
        instClase.imprimir("Dato1 y Dato2","Otro mensaje");
        instClase.escanear("Cédula.pdf", 1500);
        //Llamando métodos de clases externas por medio de las instancias
        System.out.println("Se estima que la cantidad de km recorridos sean aproximadamente " +
                insClaseDefault.calcularKilometraje() + " km.");
        System.out.println(insClasePrivate.getCant_pasajeros());
        //Creación de instancia de clase externa contenida en otro paquete
        clase2 instClaseExterna = new clase2();
        instClaseExterna.mergePdf("Cédula", "H.V.", "Tarjeta profesional");
        
    }  
}
