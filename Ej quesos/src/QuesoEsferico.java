package Quesos;
public class QuesoEsferico extends Queso {
    private static double precioUnitario;

    // Constructor
    public QuesoEsferico(double radio, double precioUnitario){
        super(radio);
        setPrecioUnitario(precioUnitario);
    }

    // Getters and setters
    public double getPrecioUnitario() {
        return precioUnitario;
    }
     public void setPrecioUnitario(double nuevoPrecio) {
        if(nuevoPrecio > 0)
        precioUnitario = nuevoPrecio;
    }

    // Métodos
    public double volumen(){
        return (4.0 / 3.0) * PI * Math.pow(radio, 3);
    }
    @Override
    public double calcularPrecioTotal(){
        return getPrecioBase() + precioUnitario + volumen();
    }
}
