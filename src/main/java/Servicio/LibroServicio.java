package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class LibroServicio implements ILibroServicio{
    
     private static List<Libro> libroList = new ArrayList<>();

    @Override
    public Libro crear(Libro libro) {
        this.libroList.add(libro);
        return libro;

    }

    @Override
    public List<Libro> listar() {
        return this.libroList;

    }
    
}
