/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadArticulo;

/**
 *
 * @author YANETH
 */
public class Libro extends Articulo{
    private int numeroPaginas = 238;
    
    public Libro(String titulo, String autor){
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }
    
    public String getAtributos(){
        return super.getAtributos() + "El libro tiene " + numeroPaginas + " páginas";
    }
    public static void main(String[] args) {
        Libro instClass= new Libro(" Laravel 8.12", " Frameworks");
        System.out.println(instClass.getAtributos());
    }
}
