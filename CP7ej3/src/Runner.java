public class Runner{
    public static void main(String[] args){
        Taller tallerXD =new Taller();
        Pieza pieza1= new Pieza(777, "Parabrisas", 2.7, 1.7);
        Pieza pieza2= new Pieza(778, "Foco", 2.9, 1.6);
        Pieza pieza3= new Pieza(779, "Antena", 4.5, 0.5);
        Pieza pieza4= new Pieza(780, "Alternador", 5.7, 7.8);
        PiezasMPimportacion pieza5 = new PiezasMPimportacion(3.5, 781, "Motor ", 3.2, 1.2);
        PiezasMPimportacion pieza6 = new PiezasMPimportacion(3.9, 782, "CajaDeCambios", 1.2, 5.2);
        PiezasMPimportacion pieza7 = new PiezasMPimportacion(3.2, 783, "PalancaDeCambios", 4.2, 2.2);
    

        tallerXD.agregarPiezas(pieza1);
        tallerXD.agregarPiezas(pieza2);
        tallerXD.agregarPiezas(pieza3);
        tallerXD.agregarPiezas(pieza4);
        tallerXD.agregarPiezas(pieza5);
        tallerXD.agregarPiezas(pieza6);
        tallerXD.agregarPiezas(pieza7);
        


    }
}
