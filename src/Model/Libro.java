package Model;

import Model.Autor;

public class Libro {

    String titulo;
    Double precio;
    Integer stock;
    Autor autor;

    public Libro(String titulo, Double precio, Integer stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: " +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor.nombre + " " + autor.apellido;
    }
    //Agregue un método a la clase Libro que posibilite imprimir en
    //pantalla el siguiente mensaje: “El libro, {título} de {nombre del autor}.
    //Se vende a {precio} pesos.

    public void imprimir(){
        System.out.println("El libro, " + titulo + "de " + autor.nombre + " " + autor.apellido + ".Se vende a " + precio +  "pesos");
    }


}
