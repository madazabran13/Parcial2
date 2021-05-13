package Dominio;

import Excepciones.Excepciones_Ecuacion;

public class Lineal extends Ecuacion implements ILineal{
    public Lineal(){
    }

    public Lineal(int a, int b){
        super(a,b);
    }

    @Override
    public String formaEcuacion(){
        return super.getA()+"x = "+super.getB();
    }

    @Override
    public double calcularSolucion() throws Excepciones_Ecuacion{
        if (super.getA()==0 && super.getB()==0) //tiene infinidad de solucion
            throw new Excepciones_Ecuacion("La ecuación tiene infinitas soluciones.");
        if (super.getA()==0 && super.getB()!=0) //no tendrá solucion
            throw new Excepciones_Ecuacion("La ecuación no tiene solución.");
        return super.getB()/super.getA();
    }

    @Override
    public String obtenerSolucion(){
        try {
            return "x = "+String.valueOf(calcularSolucion());
        } catch (Excepciones_Ecuacion excepcionEcuacion) {
            return excepcionEcuacion.getMessage();
        }
    }
}
