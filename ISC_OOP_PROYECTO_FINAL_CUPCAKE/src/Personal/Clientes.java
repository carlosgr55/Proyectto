package Personal;

import SuperClases.Persona;
import SuperClases.Producto;
import java.util.ArrayList;

/*
    La clase clientes maneja la informacion relacionada a los usuarios esta maneja
    datos relacionados a sus direcciones de entrega, facturacion, y medios de contacto
    En este archivo, igualmente, se encuentra la clase Direccion para guardar estos datos del usuario
 */
public class Clientes extends Persona {

    private String clientID; //ID para identificar al cliente, 
    private String email; //Medio de contacto para el cliente
    private Direccion dirFact; //Direcci�n de facturacion
    private Direccion dirEnvio; //Direcci�n de env�os de los productos

    //Constructores
    public Clientes(String clientID, String email, Direccion dirFact, Direccion dirEnvio, String nombre, String apellido, int edad, String telefono) {
        super(nombre, apellido, edad, telefono);
        this.clientID = clientID;
        this.email = email;
        this.dirFact = dirFact;
        this.dirEnvio = dirEnvio;
    }

    public Clientes() {
        super();
        this.clientID = "";
        this.email = "";
        this.dirFact = null;
        this.dirEnvio = null;
    }

    //M�todos get y set
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDirFact() {
        return dirFact;
    }

    public void setDirFact(Direccion dirFact) {
        this.dirFact = dirFact;
    }

    public Direccion getDirEnvio() {
        return dirEnvio;
    }

    public void setDirEnvio(Direccion dirEnvio) {
        this.dirEnvio = dirEnvio;
    }
    //CARRITO DE COMPRAS
    /*
    Lo que hace un cliente, cliente, es que tiene un carrito de compras
    en el que cual puede agregar o quitar productos como guste, en esta parte
    del c�digo se declaran dos ArrayList.
     */

    //Para almacenar los productos que el cliente desee comprar se crea 
    //carritoItems, un ArrayList que guarda las instancias de productos
    public ArrayList<Producto> carritoItems = new ArrayList<>();

    //Para almacenar la informacion de los precios, se guardan los precios en un
    //ArrayList diferente
    public ArrayList<Double> precios = new ArrayList<>();

    //M�todos get y set para los arraylists
    public ArrayList<Producto> getCarritoItems() {
        return carritoItems;
    }

    public ArrayList<Double> getPrecios() {
        return precios;
    }

    //El carrito se controla con los m�todos addItem, el cual agrega productos
    //Al carrito si estos est�n en existenci
    public void addItem(Producto producto, int unidades) {
        if (producto.getStock() >= unidades) { //Se verifica la disponibilidad del producto
            for (int i = 1; i <= unidades; i++) {
                carritoItems.add(producto); //Se a�aden el producto al carrito
                precios.add(producto.getPrecio());
            }            
            //Al inventario del producto, se le disminuye la cantidad de unidades por el usuario
            producto.setStock(producto.getStock() - unidades);
            

            //Se especifica el producto que fue a�adido
            System.out.println("Se ha a�adido un " + producto.getNombre());
        } //En caso de que el producto no est� disponible, se le hace saber
        //al usuario
        else {
            System.out.println("Producto no disponible");
        }
    }

    //El m�todo quitarItem sirve en caso de que el cliente desee eliminar un producto
    //Del carrito, el m�todo recibe la posici�n del carrito que se desee eliminar
    public void quitarItem(int index) {

        //Primero se obtiene el stock actual del producto
        int stock = carritoItems.get(index).getStock();
        //Y se le agrega una unidad
        int newStock = stock + 1;
        carritoItems.get(index).setStock(newStock);

        //Despu�s se borran del carrito los productos deseados
        carritoItems.remove(index);
        precios.remove(index);

    }

    //Con este metodo se calcula y devuelve el subtotal de los productos que 
    //Se encuentran en el carrito
    public double calcSubTotal() {
        double suma = 0; //Se inicializa la variable que guardar� la suma del subtotal
        for (int i = 0; i < precios.size(); i++) { //Iteraci�n para sumar los elementos del ArrayList
            suma += precios.get(i);
        }
        return suma;
    }

    public String datosTicket() {
        String datos = "";
        for(int i = 1; i <= carritoItems.size(); i++){
            datos += carritoItems.get(i-1).getNombre() + "    $"+precios.get(i-1)+"\n";
        }
        return datos;
    }
}
