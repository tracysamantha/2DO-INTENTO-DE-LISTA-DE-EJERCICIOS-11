/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorybiblioteca;

/**
 *
 * @author Sofía
 */
public class Libro {
    private int ID;
    private String titulo;
    private String autor;
    private String genero;
    private int añoPublicacion;
    private int numeroPaginas;
    private String estadoPrestamo;
    private int numeroCapitulos;
    private String fecha;

    public Libro(int ID,String titulo, String autor, String genero, int añoPublicacion, int numeroPaginas, String estadoPrestamo, int numeroCapitulos, String fecha) {
        this.ID = ID;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.estadoPrestamo = estadoPrestamo;
        this.numeroCapitulos = numeroCapitulos;
        this.fecha = fecha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    @Override
    public String toString() {
        return  ID+","+titulo + "," + autor + "," + genero + "," + añoPublicacion + "," + numeroPaginas + "," + estadoPrestamo + "," + numeroCapitulos + "," + fecha;
    }
    public static Libro fromString(String line) {
        String[] data = line.split(",");
        return new Libro(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]),Integer.parseInt(data[5]),data[6],Integer.parseInt(data[7]),data[8]);
    }
    
    
}
