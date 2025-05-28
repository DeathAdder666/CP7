public class QuesoEsferico extends Queso {
    private static double precioUnitario;

    public QuesoEsferico(double radio, double precioUnitario){
        super(radio);
        setPrecioUnitario(precioUnitario);
    }

 
    public double getPrecioUnitario() {
        return precioUnitario;
    }
     public void setPrecioUnitario(double nuevoPrecio) {
        if(nuevoPrecio > 0)
        precioUnitario = nuevoPrecio;
    }

    public double volumen(){
        return (4.0 / 3.0) * PI * Math.pow(radio, 3);
    }
    @Override
    public double calcularPrecioTotal(){
        return getPrecioBase() + precioUnitario + volumen();
    }
}
