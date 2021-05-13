package Vista;

import Dominio.*;

public class Ppal {
    public static void main(String[] args) {
        System.out.println("          -------------------");
        System.out.println(" \t       ECUACIONES");
        System.out.println("          -------------------");
        //objetos
        Libreta libreta = new Libreta();
        libreta.aggCuadratica(new Cuadratica());
        
        libreta.aggLineal(new Lineal(3,15));
        libreta.aggCuadratica(new Cuadratica(4,6,3));
        //imprimo
        libreta.mostrarContenido();
    }
}
