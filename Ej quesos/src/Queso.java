public abstract class Queso {
    private static double precioBase = 12;// static pa q tenga el mismo valor en todos los kesos
    protected double radio;
    protected static final double PI = Math.PI;


    public Queso(double radio){
        setRadio(radio);
    }

    public static void setPrecioBase(double nuevoPrecio){
        if(precioBase > 0)
            precioBase = nuevoPrecio;
    }
    protected double getPrecioBase(){
        return precioBase;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }

    public abstract double volumen();
    public abstract double calcularPrecioTotal();
}
