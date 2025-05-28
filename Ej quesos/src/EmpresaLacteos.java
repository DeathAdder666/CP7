import java.util.ArrayList;
import Quesos.*;

public class EmpresaLacteos {
    private ArrayList<Factura> facturas;
    private ArrayList<Cliente> clientes;

    // Constructor
    public EmpresaLacteos(){
        facturas = new ArrayList<Factura>();
        clientes = new ArrayList<Cliente>();
    }

    // Getters and Setters 
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }    

    // Métodos
    public double precioTotalFacturas(){
        double precio = 0;

        for(Factura f : facturas){
            precio += f.precioTotal();
        }
        return precio;
    }
    
    public int cantQuesoTipo(Queso q){
        int cant = 0;

        for(Factura f : facturas){
            cant += f.cantQuesoTipo(q);
        }
        return cant;
    }

    public double precioMayorQuesoEsferico(){
        double precioMayor = 0;
        double precio = 0;

        for(Factura f : facturas){
            precio = f.precioMayorQuesoEsferico();
            if(precio > precioMayor)
                precioMayor = precio;
        }
        return precioMayor;
    }

    public ArrayList<String> clientesMayorTotalQuesos(){
       ArrayList<String> nombres = new ArrayList<String>();

       for(Factura f : facturas){
       nombres = f.clientesMayorTotalQuesos();
       }
       return nombres;
    }
}
