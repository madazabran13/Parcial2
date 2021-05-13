package Dominio;

import Excepciones.Excepciones_Ecuacion;

public interface ICuadratica {
    double calcularSolucion1()throws Excepciones_Ecuacion;
    double calcularSolucion2()throws Excepciones_Ecuacion;
    String obtener_Solucion();
}
