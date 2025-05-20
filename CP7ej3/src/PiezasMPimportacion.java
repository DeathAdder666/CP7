
public class PiezasMPimportacion extends Pieza{
    protected double costoMateriaPrima;
    

    public PiezasMPimportacion(double costoMateriaPrima, int id,String descripcion,double costoProduccion, double volumen){
    super(id, descripcion, costoProduccion, volumen);
    setCostoMateriaPrima(costoMateriaPrima);
    }

    public double getCostoMateriaPrima() {
        return costoMateriaPrima;
    }

    public void setCostoMateriaPrima(double costoMateriaPrima) {
        if(costoMateriaPrima > 0 && costoMateriaPrima<6.5){
        this.costoMateriaPrima = costoMateriaPrima;
    }
    else{
        throw new IllegalArgumentException("El costo de la materia prima debe ser mayor que cero y menor que 6.5 baby");
    }

    }

    @Override
    public double calcularValorPieza(double costoProduccion, double volumen){

    return (costoProduccion*volumen) +(costoMateriaPrima*2.5);
  
        }


}
