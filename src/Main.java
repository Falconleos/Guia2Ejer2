
import Model.Autor;
import Model.Libro;

public class Main {
    public static void main(String[] args) {

        Autor a1 = new Autor("Joshua","Bloch","Joshua@email.com",'M');
        System.out.println(a1.toString());

        Libro l1 = new Libro("Effective Java",450.0,150, a1);
        System.out.println(l1.toString());

        //modificar el libro a 500 y aumentar las copias a 50
        l1.setPrecio(500.0);
        l1.setStock(l1.getStock()+50);

        System.out.println(l1.toString());

        System.out.println(l1.getAutor().toString());

        l1.imprimir();

        }
    }
