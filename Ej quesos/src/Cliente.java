import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String numeroCliente;
    private ArrayList<Factura> facturas;


    public Cliente(String nombre, String direccion, String telefono, String numeroCliente){
        facturas = new ArrayList<Factura>();
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setNumeroCliente(numeroCliente);
    }

  
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    

    

}
