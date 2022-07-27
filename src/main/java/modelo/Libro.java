/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Libro {
    private int codigo;
    private String nombre;
    private int year;
    private Categoria categoria;

    public Libro(int codigo, String nombre, int year, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.year = year;
        this.categoria = categoria;
    }
    
    public Libro(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", nombre=" + nombre + ", year=" + year + ", categoria=" + categoria + '}';
    }
    

    
    
    
}
