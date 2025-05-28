public class QuesoCilindricoHueco extends QuesoCilindrico {
    private double radioInterior;

    public QuesoCilindricoHueco(double radio, double precioUnitario, double longitud, double radioInterior){
        super(radio, precioUnitario, longitud);
        setRadioInterior(radioInterior);
    }

    public double getRadioInterior() {
        return radioInterior;
    }
    public void setRadioInterior(double radioInterior) {
        if(radioInterior < radio)
            this.radioInterior = radioInterior;
        else
            throw new IllegalArgumentException("El radio interior tiene q ser menor q el exterior");
        }

    public double volumen(){
    return PI * longitud * (Math.pow(radio, 2) - Math.pow(radioInterior, 2));
    }

    @Override
    public double calcularPrecioTotal(){
        return super.calcularPrecioTotal();
    }
}
