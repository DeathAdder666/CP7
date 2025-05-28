package Quesos;
public class QuesoCilindrico extends Queso {
    private static double precioUnitario;
    protected double longitud;
   
    // Constructor
    public QuesoCilindrico(double radio, double precioUnitario, double longitud){
        super(radio);
        setPrecioUnitario(precioUnitario);
        setLongitud(longitud);
    }
    // Getters and setters
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double nuevoPrecio) {
        if(nuevoPrecio > 0)
        precioUnitario = nuevoPrecio;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Métodos
    @Override
    public double volumen(){
        return PI * Math.pow(radio, 2) * longitud;
    }
    @Override
    public double calcularPrecioTotal(){
        return getPrecioBase() + precioUnitario * volumen();
    }
}
