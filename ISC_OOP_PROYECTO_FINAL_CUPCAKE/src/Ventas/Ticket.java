package Ventas;

import Personal.Clientes;
import Productos.*;
import SuperClases.Producto;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {

    static LocalDate fecha = LocalDate.now();

    public Ticket() {
    }

    Clientes cliente = new Clientes();

    public static void writeTicket(String ruta, Clientes cliente) throws IOException {

       
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        bufWriter.write("Fecha " + fecha);
        bufWriter.write("\nCliente: " + cliente.getNombre() + " " + cliente.getApellido()+"\n");
        bufWriter.write(cliente.datosTicket());
        bufWriter.write("Subtotal   $"+cliente.calcSubTotal()+"");

        

        bufWriter.close();
        fileWriter.close();

    }

}
