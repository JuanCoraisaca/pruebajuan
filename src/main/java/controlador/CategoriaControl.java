/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Servicio.CategoriaServicio;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author usuario
 */
public class CategoriaControl {
    
    private final CategoriaServicio categoriaServicio = new CategoriaServicio();
    
    public Categoria crear(String [] args){
        var categoria = new Categoria(Integer.valueOf(0),args[1]);
        this.categoriaServicio.crear(categoria);
        return categoria;
    }
    
    public List<Categoria> listar(){
        return this.categoriaServicio.listar();
    }
    
}
