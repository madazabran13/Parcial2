package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Libreta {
    private List<Lineal> lineales;
    private List<Cuadratica> cuadraticas;

    public Libreta() {
        this.lineales = new ArrayList<>();
        this.cuadraticas = new ArrayList<>();
    }

    public void aggLineal(Lineal l) {
        this.lineales.add(l);
    }

    public void aggCuadratica(Cuadratica c) {
        cuadraticas.add(c);
    }

    public void mostrarContenido() {
        System.out.print("ECUACIONES LINEALES:\n");
        for (Lineal l : lineales) {
            System.out.print("Ecuacion general: "+l.formaEcuacion()+"\n");
            System.out.print("Solucion: "+l.obtenerSolucion()+"\n");
        }
        System.out.print("\nECUACIONES CUADRATICAS:\n");
        for (Cuadratica c : cuadraticas) {
            System.out.print("Ecuacion general: "+c.formaEcuacion()+"\n");
            System.out.print("Solucion: "+c.obtenerSolucion()+"\n");
        }
    }
}