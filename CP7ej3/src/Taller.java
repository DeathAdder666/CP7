import java.util.ArrayList;

public class Taller {
    protected ArrayList<Pieza> piezas;

    public Taller() {
      piezas=new ArrayList<>();
        
    }
 public void agregarPiezas( Pieza pieza){
   piezas.add(pieza);
 }
 public void mostrarPiezas(){
   for(Pieza p:piezas){
      System.out.println(p);

   }
 }
  
 public void compararCostosPiezas(){ //metodo para comparar el costo de las piezas locales y las d materiales imp
 double costoPiezas=0;
 double costoPiezasMPimportacion=0;

 for(Pieza p: piezas ){ //estuve 3 dias pa hacer esta pinga xd
  if(p instanceof Pieza){
   costoPiezas += p.calcularValorPieza(costoPiezas, costoPiezasMPimportacion);

  }
  else if(p instanceof PiezasMPimportacion){

   costoPiezasMPimportacion += p.calcularValorPieza(costoPiezas, costoPiezasMPimportacion);

  }
   
 }
   System.out.println("Total piezas con MP importada: " + costoPiezas);
   System.out.println("Total piezas sin MP importada: " + costoPiezasMPimportacion);

   if (costoPiezasMPimportacion > costoPiezas) {
      System.out.println("Las piezas con materias primas de importación costaron un poco mas.");
  } else if (costoPiezasMPimportacion < costoPiezas) {
      System.out.println("Las piezas sin materias primas de importación costaron un poco mas.");
  } else {
      System.out.println("Ambos tipos de piezas tienen el mismo valor total.");
  }
}



 }







