/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author usuario
 */
public class CategoriaServicio implements ICategoriaServicio{
    
     private static List<Categoria> categoriaList = new ArrayList<>();

    @Override
    public Categoria crear(Categoria categoria) {
        this.categoriaList.add(categoria);
        return categoria;
        

    }
    
    @Override
    public Categoria buscarPorCodigo(int codigoCategoria) {
         Categoria categoria=null;
        for(var c:this.categoriaList){
            if(codigoCategoria==c.getCodigo()){
                categoria=c;
                break;
            }
        }
        return categoria;

    }

    @Override
    public List<Categoria> listar() {
        
        return this.categoriaList;
  
    }

    
    
}
