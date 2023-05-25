package isc_oop_proyecto_final_cupcake;

import Personal.*;
import Productos.*;
import Ventas.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ISC_OOP_PROYECTO_FINAL_CUPCAKE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String ruta = "D:\\Escuela\\OOP\\Tickets\\";
        Clientes cliente = new Clientes();
        cliente.setApellido("Rosa");
        cliente.setNombre("Laura");
        try {
            Ticket.writeTicket(ruta+"prueba2.txt", cliente);
        } catch (IOException ex) {
            Logger.getLogger(ISC_OOP_PROYECTO_FINAL_CUPCAKE.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        Clientes cliente = new Clientes();
        Pantalones pant = new Pantalones();
        pant.setNombre("Pantalons 1");
        pant.setPrecio(185.15);
        pant.setStock(15);
        cliente.addItem(pant, 3);
        Tops top = new Tops();
        top.setNombre("Top");
        top.setPrecio(256.5);
        top.setStock(2);
        cliente.addItem(top, 2);
        System.out.println(cliente.carritoItems);
        System.out.println(cliente.precios);
        
        String ruta = "D:\\Escuela\\OOP\\Tickets\\pruebaConDatos.txt";
        try {
            Ticket.writeTicket(ruta, cliente);
        } catch (IOException ex) {
            Logger.getLogger(ISC_OOP_PROYECTO_FINAL_CUPCAKE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

