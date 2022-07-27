/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Servicio.CategoriaServicio;
import Servicio.LibroServicio;
import java.util.List;
import modelo.Categoria;
import modelo.Libro;

/**
 *
 * @author usuario
 */
public class LibroControl {
    
    private final LibroServicio libroServicio = new LibroServicio();
    private final CategoriaServicio categoriaServicio = new CategoriaServicio();
    
    public Libro crear(String [] args){
        
        Categoria categoria = this.categoriaServicio.buscarPorCodigo(Integer.valueOf(args[3]));
        Libro libro = new Libro(Integer.valueOf(args[0]),args[1],Integer.valueOf(2),categoria);
        this.libroServicio.crear(libro);
        return libro;
        
    }
    
    public List<Libro> listar(){
        return this.libroServicio.listar();
    }
    
}
