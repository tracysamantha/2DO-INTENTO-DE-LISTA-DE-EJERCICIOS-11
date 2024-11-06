/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyectobiblioteca;

import java.util.List;
import repositorybiblioteca.AplicarRepository;
import repositorybiblioteca.Libro;
import repositorybiblioteca.LibroRepository;

/**
 *
 * @author Sofía
 */
public class Main {
     public static void main(String[] args) {
     LibroRepository repositorio = new AplicarRepository();
     Libro libro = new Libro(0123, "Cien años de soledad","Gabriel Garcia Marquez","Drama",2008,300,"Disponible",20,"10/09/2024" );
     repositorio.guardar(libro);
       
      //int ID,String titulo, String autor, String genero, int añoPublicacion, int numeroPaginas, String estadoPrestamo, int numeroCapitulos, String fecha

   
      

        
        
     }
}
