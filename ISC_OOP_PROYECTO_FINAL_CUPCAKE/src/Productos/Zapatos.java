package Productos;

import SuperClases.Metodos;
import SuperClases.Producto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Zapatos maneja todo el tipo de calzados is-a Producto
 */
public class Zapatos extends Producto implements Metodos {

    Scanner sc = new Scanner(System.in);
    private String material; //Cuero, tela, sintetico, etc.
    private String estilo; //Casual, deportivo, de vestir
    public ArrayList<Zapatos> invZapatos = new ArrayList<>();

    //Constructores
    public Zapatos(String material, String estilo, String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        super(nombre, descripcion, precio, stock, marca, talla, color, categoria, tipo, genero);
        this.material = material;
        this.estilo = estilo;
    }

    public Zapatos() {
        super();
        this.material = "";
        this.estilo = "";
    }

    //Metodos get y set
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public Zapatos crearProductos() {
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

        System.out.println("Estilo");
        estilo = sc.nextLine();
        System.out.println("Material");
        material = sc.nextLine();

        Zapatos zapato = new Zapatos(material, estilo, nombre, descripcion, precio,
                stock, marca, talla, color, categoria, tipo, genero);
        return zapato;
    }

    @Override
    public void guardarProductos() {
        boolean done;
        do {
            invZapatos.add(this.crearProductos());
            
            do{try{
            System.out.println("Otro producto?");
            done = sc.nextBoolean();}
            catch(InputMismatchException e){
                System.out.println("Error solo puede ser true or false"); 
                done = sc.nextBoolean();
            }
            }while(true);
            
        } while (done != false);

    }

    @Override
    public void imprimirDatos() {
        System.out.println(nombre);
        System.out.println("Descripción " + descripcion);
        System.out.println("Precio " + precio);
        System.out.println("Stock " + stock);
        System.out.println("Marca " + marca);
        
        System.out.println("Estilo "+estilo);
        System.out.println("Material "+material);
        
        System.out.println("INVENTARIO TOTAL "+invZapatos.size());

    }
}
