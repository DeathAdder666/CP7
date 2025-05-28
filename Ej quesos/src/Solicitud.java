import Quesos.*;
import java.util.ArrayList;

public class Solicitud {
    private ArrayList<Queso> quesos;

    // Constructor
    public Solicitud(){
        quesos = new ArrayList<Queso>();  
    }

    // Getters and setters
    public ArrayList<Queso> getQuesos() {
        return quesos;
    }
    public void setQuesos(ArrayList<Queso> quesos) {
        this.quesos = quesos;
    }
    
    // Métodos
    // Obtener la cantidad de quesos dado un tipo de queso
    public int getUnidadQuesoFacturada(Queso tipoQueso){ // pasar directamente el string TODO 
        String nombreQueso = tipoQueso.getClass().getSimpleName();
        int cantQueso = 0;
       
     if(tipoQueso != null){
         for(Queso q : quesos){
            if(q.getClass().getSimpleName().equalsIgnoreCase(nombreQueso))
                cantQueso++;
        }    
    }
    return cantQueso;
    }

   public double precioTotal(){
        double precio = 0;

        for(Queso q : quesos){
            precio += q.calcularPrecioTotal();
        }
        return precio;
    }

    public double precioMayorQuesoEsferico(){
        double precio = 0;
        double volumen = -1;

        for(Queso q : quesos){
            if(q instanceof QuesoEsferico){
            if(((QuesoEsferico)q).volumen() > volumen){
                volumen = ((QuesoEsferico)q).volumen();
                precio = q.calcularPrecioTotal();
            }
        }
    }
    return precio;
    }
}
