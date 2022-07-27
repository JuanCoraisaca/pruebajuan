/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.List;
import modelo.Categoria;

/**
 *
 * @author usuario
 */
public interface ICategoriaServicio {
    
     public Categoria crear(Categoria categoria);
     public Categoria buscarPorCodigo(int codigoCapitan);
     public List<Categoria> listar();
}
