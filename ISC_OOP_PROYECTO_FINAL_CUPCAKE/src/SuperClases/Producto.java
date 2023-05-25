package SuperClases;

import Personal.Empleados;
import java.util.ArrayList;
import java.util.Scanner;

/*
La clase Producto se crea con el principal objetivo de servir como Superclase
para las subclases que utilizarán para modelar los atributos y métodos de cada
uno de los productos que maneje la empresa; y de estas subclases se instancien 
los productos individuales según su clase.

Las subclases de esta clase se encuentran en el paquete Productos.
 */
public abstract class Producto {

    Scanner sc = new Scanner(System.in);
    /*
    Los atributos se declaran con el modificador de acceso protected para 
    simplificar sus usos en las subclases
     */
    protected String nombre; // Nombre del producto
    protected String descripcion; //Descripción breve del producto
    protected double precio; //Precio en pesos del producto

    protected int stock; //Unidades del producto con las que se cuentan
    protected String marca; //Marca del producto
    //Talla, ya sea en XCH, CH, M, G, EG, etc. O En forma númerica para el calzado
    protected String talla;

    protected String color; //Color del producto
    protected String categoria; //Ya sea si es un top, vestido, calzado, pantalon, etc.

    //El tipo varía según cada producto, pero puede ser ya sea:
    //De vestir, casual, deportivo, etc.
    protected String tipo;

    /*Enfoque principal del producto, puede ser enfoque masculino, femenino o unisex
    Los productos no se caracterizaran principalmente por el enfoque en el que
    estos fueron diseñados, pero sirven como marco de referencia para el 
    consumidor final
     */
    protected String genero;
    ArrayList<Producto> productos = new ArrayList<>();
    //Constructor con argumentos 
    public Producto(String nombre, String descripcion, double precio, int stock, String marca, String talla, String color, String categoria, String tipo, String genero) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.categoria = categoria;
        this.tipo = tipo;
        this.genero = genero;
    }

    //Constructor default
    public Producto() {
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
        this.stock = 0;
        this.marca = "";
        this.talla = "";
        this.color = "";
        this.categoria = "";
        this.tipo = "";
        this.genero = "";
    }

    //Metodos get y set para cada atributo
    // *El atributo de precio solo cuenta con metodo get, ya que
    //Para modificar este atributo es necesaria una autorización que solo 
    //Los gerentes o supervisores tienen
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //El metodo para cambiar los precios de los productos debe de recibir un
    //Empleado como parametro
    public void cambiarPrecio(Empleados empleado) {
        
        //Se utiliza al parametro de empleado para verificar si este tiene la 
        //Autorización para realizar la operación
        if (empleado.isAutorizado(empleado)) {
            //Si es autorizado se le pregunta el precio y se cambia
            System.out.println("Precio nuevo");
            this.precio = sc.nextDouble();
        } else {
            System.out.println("No tienes autorización para cambiar el precio");
        }

    }
    
    //El metodo de cambiar stock funciona de la misma manera que el metodo de 
    //Cambiar precio, solo que en vez de cambiar el precio, cambia el stock
    public void cambiarStock(Empleados empleado) {
        if (empleado.isAutorizado(empleado)) {
            System.out.println("Stock nuevo");
            this.stock = sc.nextInt();
        } else {
            System.out.println("No tienes autorizacion");
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    

}
