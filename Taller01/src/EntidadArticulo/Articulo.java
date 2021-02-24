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
public class Articulo {
    private String titulo;
    private String autor;
    
    public Articulo(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAtributos(){
        return "El nombre del articulo es" + titulo + " el autor es " + autor;
    }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
