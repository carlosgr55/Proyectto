package SuperClases;

/*
La clase Persona se crea con el próposito de generalizar los aspectos de todo
el personal humano que se vea involucrado en la operación de la empresa
tanto como clientes, empleados, proveedores, etc.
 */
public class Persona {

    /*
    Los atributos se declaran con el modificador de acceso protected para 
    simplificar sus usos en las subclases
     */
    protected String nombre; //Nombre de la persona
    protected String apellido; //Apellido de la persona
    protected int edad; //Edad en años de la persona
    protected String telefono; //Número telefónico de la persona

    //Constructor con atributos
    public Persona(String nombre, String apellido, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    //Constructor default
    public Persona() {
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.edad = 0;
        this.telefono = "6141234567";
    }

    //Métodos get y set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
