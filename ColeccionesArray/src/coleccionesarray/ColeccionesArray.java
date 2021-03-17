/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesarray;

/**
 *
 * @author YANETH
 */
public class ColeccionesArray {

    /**
     * @param args the command line arguments
     */
    //String Builder tipo de dato mutable
    public StringBuilder operaciones() {
        StringBuilder cadena = new StringBuilder("Programación ");
        //añadir texto al StringBuilder
        cadena.insert(13, "Orientada a objetos");
        //eliminar caracteres de la cadena
        cadena.delete(22, 32);
        return cadena;
    }

    public void operacionesAdicionales(StringBuilder cadena) {
        cadena.append(" Hemos capturado el retorno de la función ");
        //convertir a String
        String textoConvertido = cadena.toString();
        //Cuando es String y queremos añadir texto a la cadena
        textoConvertido = textoConvertido + "Team";
        System.out.println("Parametro " + textoConvertido);
    }

    public void longitudCadena(StringBuilder cadena) {
        System.out.println("Longitud del StringBuilder " + cadena.length());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ColeccionesArray instClass = new ColeccionesArray();
        StringBuilder capturarValor = instClass.operaciones();
        instClass.operacionesAdicionales(capturarValor);
        instClass.longitudCadena(capturarValor);
    }

}
