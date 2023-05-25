package Productos;

import SuperClases.Producto;
import SuperClases.Metodos;
import java.util.ArrayList;
import java.util.Scanner;

/*
    La clase Pantalones se crea para guardar los productos de la tienda que sean
    pantalones, Pantalones is-a Producto
 */
public class Pantalones extends Producto implements Metodos{

    Scanner sc = new Scanner(System.in);

    private String corte; //Recto, slim, leggins, etc.
    private String tela;  //Mezclilla, algodon, poliester, demin, etc.
    private String largo; //Short, 7/8, largo, etc.
    private String estilo; //Casual, deportivo, de vestir, etc.

    public ArrayList<Pantalones> invPantalones = new ArrayList<>();

    //Constructores
    public Pantalones(String corte, String tela, String largo, String estilo, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.corte = corte;
        this.tela = tela;
        this.largo = largo;
        this.estilo = estilo;
    }

    public Pantalones() {
        super();
        this.corte = "";
        this.tela = "";
        this.largo = "";
        this.estilo = "";
    }

    //Métodos get y set
    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public Pantalones crearProductos() {
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

        System.out.println("Corte");
        corte = sc.nextLine();
        System.out.println("Estilo");
        estilo = sc.nextLine();
        System.out.println("Largo");
        largo = sc.nextLine();
        System.out.println("Tela");
        tela = sc.nextLine();

        Pantalones pantalon = new Pantalones(corte, tela, largo, estilo, nombre, descripcion,
                precio, stock, marca, talla, color, categoria, tipo, genero);
        return pantalon;
    }

    @Override
    public void guardarProductos() {
        boolean done;
        do {
            invPantalones.add(this.crearProductos());
            System.out.println("Otro producto'");
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
        
        System.out.println("Corte "+corte);
        System.out.println("Estilo "+estilo);
        System.out.println("Largo "+largo);
        System.out.println("Tela "+tela);
        
        System.out.println("INVENTARIO TOTAL "+invPantalones.size());

    }

}
