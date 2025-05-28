public class QuesoCilindrico extends Queso {
    private static double precioUnitario;
    protected double longitud;

    public QuesoCilindrico(double radio, double precioUnitario, double longitud){
        super(radio);
        setPrecioUnitario(precioUnitario);
        setLongitud(longitud);
    }

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

    @Override
    public double volumen(){ // esto aki tuve q buscar el math.pow
        return PI * Math.pow(radio, 2) * longitud;
    }
    @Override
    public double calcularPrecioTotal(){
        return getPrecioBase() + precioUnitario * volumen();
    }
}
