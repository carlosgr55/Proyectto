package SuperClases;

public interface Metodos {

    //Se crean en una interfaz los siguientes metodos para ser implementados en las subclases de Producto
    //Poder guardarlos en un ArrayList
    Producto crearProductos();

    //Este m�todo guarda los productos que son creados 
    //Con el m�todod crearProductos, el comportamiento var�a seg�n el producto
    void guardarProductos();

    //Imprime los datos de los productos
    void imprimirDatos();

    /*
    Se ejemplifica el funcionamiento de los metodos
    
    @Override
    public Pantalones crearProductos() {
    
        ---SE SOLICITA AL USUARIO LOS DATOS DEL PRODUCTO-----
    
        System.out.println("Nombre del producto");
        nombre = sc.nextLine();
    
        ---UNA VEZ SON SOLICITADOS LOS DATOS, SE CREAN CON ESTOS EL PRODUCTO---------
        Pantalones pantalon = new Pantalones(corte, tela, largo, estilo, nombre, descripcion,
                precio, stock, marca, talla, color, categoria, tipo, genero);
        
        ---SE REGRESA EL PRODUCTO CREADO----
        return pantalon;
    }

    @Override
    public void guardarProductos() {
        -----SE DECLARA UN VALOR BOOLEANO PARA EL CICLO----
    boolean done;
        do {
    
        -----EN CADA PRODUCTO SE CREA UN ARRAYLIST EN EL CUAL SE GUARDAR�N LOS PRODUCTOS CREADOS-----
        -----SE INVOCA EL M�TODO CREARPRODUCTOS Y SE INSERTA COMO PARAMETRO EN .ADD----    
        invPantalones.add(this.crearProductos());
        ---SE PREGUNTA AL USUARIO SI DESEA CREAR OTRO PRODUCTO----
            System.out.println("Otro producto'");
            done = sc.nextBoolean();
        }while(done != false);
    }
     */
}
