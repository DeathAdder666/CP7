import java.util.ArrayList;

public class Factura {
    private String codigo;
    private String fecha;
    private ArrayList<Solicitud> solicitudes;
    private Cliente cliente;

  
    public Factura(String codigo, String fecha, Cliente cliente){
        setCodigo(codigo);
        setFecha(fecha);
        setCliente(cliente);
        solicitudes = new ArrayList<Solicitud>();
    }

    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double precioTotal(){
        double precio = 0;

        for(Solicitud s : solicitudes){
            precio += s.precioTotal();
        }
        return precio;
    }

    public int cantQuesoTipo(Queso q){ 
        int cant = 0;

        for(Solicitud s : solicitudes){
           cant += s.getUnidadQuesoFacturada(q);
        }
        return cant;
    }

    public double precioMayorQuesoEsferico(){
        double precioMayor = 0;
        double precio = 0;

        for(Solicitud s : solicitudes){
            precio = s.precioMayorQuesoEsferico();
            if(precio > precioMayor)
               precioMayor = s.precioMayorQuesoEsferico(); 
        }
        return precioMayor;
    }

    public ArrayList<String> clientesMayorTotalQuesos(){ // aki necesite ayuda para hcerlo
        ArrayList<String> nombres = new ArrayList<String>();
        int cant = -1;

        for(Solicitud s : solicitudes){
            if(cant < s.getQuesos().size()){
                nombres.clear();
                cant = s.getQuesos().size();
                nombres.add(getCliente().getNombre());
            }
            else if (cant == s.getQuesos().size()){
                nombres.add(getCliente().getNombre());
            }
        }
        return nombres;
    }
}
