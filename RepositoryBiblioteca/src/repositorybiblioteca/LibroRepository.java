/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorybiblioteca;

import java.util.List;

/**
 *
 * @author Sofía
 */
public interface LibroRepository {
    void guardar(Libro libro);
    void buscar(Libro libro);
    List<Libro> buscarPorAutor(String autor);
    List<Libro> buscarPorGenero(String genero);
    List<Libro> obtenerTodosLosLibros();
    void actualizar(Libro libro);
    
}
