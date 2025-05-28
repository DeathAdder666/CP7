import java.util.ArrayList;

public class Solicitud {
    private ArrayList<Queso> quesos;

    public Solicitud(){
        quesos = new ArrayList<Queso>();  
    }

    public ArrayList<Queso> getQuesos() {
        return quesos; 
    }
    public void setQuesos(ArrayList<Queso> quesos) {
        this.quesos = quesos;
    }
    

    public int getUnidadQuesoFacturada(Queso tipoQueso){ // aki tmb podia hacer un metodo toString 
        String nombreQueso = tipoQueso.getClass().getSimpleName();
        int cantQueso = 0;
       
     if(tipoQueso != null){
         for(Queso q : quesos){
            if(q.getClass().getSimpleName().equalsIgnoreCase(nombreQueso)) // esto tuve q hacerlo con chat gpt, ni idea
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
