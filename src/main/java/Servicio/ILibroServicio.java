/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.List;
import modelo.Libro;

/**
 *
 * @author usuario
 */
public interface ILibroServicio {
    public Libro crear(Libro libro);
    public List<Libro> listar();
    
    
}
