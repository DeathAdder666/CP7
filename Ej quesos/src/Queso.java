package Quesos;
public abstract class Queso {
    private static double precioBase = 12;
    protected double radio;
    protected static final double PI = Math.PI;

    // Constructor
    public Queso(double radio){
        setRadio(radio);
    }

    // Getters and setters
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

    // Métodos
    public abstract double volumen();
    public abstract double calcularPrecioTotal();
}
