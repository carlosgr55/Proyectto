package Productos;

import SuperClases.Metodos;
import SuperClases.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Vestidos maneja todo el tipo de Vestidos is-a Producto
 */
public class Vestidos extends Producto implements Metodos {

    Scanner sc = new Scanner(System.in);
    private String largo; //Corto, mediano, largo
    private String escote; //Redonod, corte V, etc
    private String estampado; //Florar, liso, rayas, etc.
    public ArrayList invVestidos = new ArrayList<>();
            
    //Constructores
    public Vestidos(String largo, String escote, String estampado, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.largo = largo;
        this.escote = escote;
        this.estampado = estampado;
    }

    public Vestidos() {
        super();
        this.largo = "";
        this.escote = "";
        this.estampado = "";
    }

    //Métodos get y set
    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getEscote() {
        return escote;
    }

    public void setEscote(String escote) {
        this.escote = escote;
    }

    public String getEstampado() {
        return estampado;
    }

    public void setEstampado(String estampado) {
        this.estampado = estampado;
    }
@Override
    public Vestidos crearProductos() {
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
        System.out.println("Largo");
        largo = sc.nextLine();
        
        Vestidos vestido = new Vestidos(largo, escote, estampado, nombre, descripcion, 
                precio, stock, marca, talla, color, categoria, tipo, genero);
        return vestido;
                
    }
    @Override
    public void guardarProductos() {
        boolean done;
        do {
            invVestidos.add(this.crearProductos());
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
        System.out.println("Largo "+largo);
        
        System.out.println("INVENTARIO TOTAL "+invVestidos.size());
                

    }
}
