package Productos;

import SuperClases.Metodos;
import SuperClases.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Tops es la clase para las playeras, blusas, etc. Tops is-a Producto
 */
public class Tops extends Producto implements Metodos{

    Scanner sc = new Scanner(System.in);
    private String escote; //Cuello alto, redondo, corte tortuga, etc.
    private String manga; //Larga, corta, sin mangas
    private String estampado; //Liso, de rayas, imagen, animal print, etc.
    public ArrayList<Tops> invTops = new ArrayList<>();

    //Constructores
    public Tops(String escote, String manga, String estampado, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.escote = escote;
        this.manga = manga;
        this.estampado = estampado;
    }

    public Tops() {
        super();
        this.escote = "";
        this.manga = "";
        this.estampado = "";
    }

    //Métodos get y set
    public String getEscote() {
        return escote;
    }

    public void setEscote(String escote) {
        this.escote = escote;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getEstampado() {
        return estampado;
    }

    public void setEstampado(String estampado) {
        this.estampado = estampado;
    }

    @Override
    public Tops crearProductos() {
        System.out.println("Nombre del producto");
        nombre = sc.nextLine();
        System.out.println("Descripcion breve");
        descripcion = sc.nextLine();
        System.out.println("El precio y el stock deben de ser cambiados por un empleado autorizado");
        System.out.println("Marca");
        marca = sc.nextLine();
        System.out.println("Talla");
        talla = sc.nextLine();
        System.out.println("Color");
        color = sc.nextLine();
        System.out.println("Categoría");
        categoria = sc.nextLine();
        System.out.println("Tipo");
        tipo = sc.nextLine();
        System.out.println("Género");
        genero = sc.nextLine();

        System.out.println("Escote");
        escote = sc.nextLine();
        System.out.println("Estampado");
        estampado = sc.nextLine();
        System.out.println("Manga");
        manga = sc.nextLine();

        Tops top = new Tops(escote, manga, estampado, nombre, descripcion, precio, stock,
                marca, talla, color, categoria, tipo, genero);
        return top;
    }

    @Override
    public void guardarProductos() {
        boolean done;
        do {
            invTops.add(this.crearProductos());
            System.out.println("Otro producto?");
            done = sc.nextBoolean();
        } while (done != false);
    }

    @Override
    public void imprimirDatos() {
        System.out.println(nombre);
        System.out.println("Descripción " + descripcion);
        System.out.println("Precio " + precio);
        System.out.println("Stock " + stock);
        System.out.println("Marca " + marca);

        System.out.println("Escote "+escote);
        System.out.println("Estampado "+estampado);
        System.out.println("Manga "+manga);
        
        System.out.println("INVENTARIO TOTAL "+invTops.size());
    }
}
