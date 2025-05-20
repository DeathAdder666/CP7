public class Pieza {
protected int id; //puede ser string tmb pero solo quiero poner numeros
protected String descripcion;
protected double costoProduccion;
protected double volumen;

public Pieza(int id,String descripcion,double costoProduccion, double volumen){
setId(id);
setDescripcion(descripcion);    
setCostoProduccion(costoProduccion);
setVolumen(volumen);

}

public int getId() {
    return id;
}

public void setId(int id) {
    if(id>0){
    this.id = id;
    }
    else{
        throw new IllegalArgumentException("EL id no puede estar vacio baby");
    }
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    if(descripcion!=null){
    this.descripcion = descripcion;
    }
    else{
        throw new IllegalArgumentException("La descripcion no puede estar vacia baby");
    }
}

public double getCostoProduccion() {
    return costoProduccion;
}

public void setCostoProduccion(double costoProduccion) {
    if(costoProduccion > 0 && costoProduccion < 6.5){
    this.costoProduccion = costoProduccion;
}

else{
    throw new IllegalArgumentException("EL costo de produccion no puede ser menor que cero baby");
}

}

public double getVolumen() {
    return volumen;
}

public void setVolumen(double volumen) {
    if(volumen > 0){
    this.volumen = volumen;
}
    else{
        throw new IllegalArgumentException("El volumen no puede ser menor que cero baby");
    }
}

public double calcularValorPieza(double costoProduccion, double volumen){

return costoProduccion*volumen;

}
 
 

}
