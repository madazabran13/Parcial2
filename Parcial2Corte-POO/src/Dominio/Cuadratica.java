package Dominio;

import Excepciones.Excepciones_Ecuacion;

public class Cuadratica extends Ecuacion implements ICuadratica {
    private int c; //valor c
    private double d; //discriminante

    public Cuadratica() {
    }

    public Cuadratica(int c, double d) {
        this.c = c;
        this.d = d;
    }

    public Cuadratica(int a, int b, int c) {
        super(a, b);
        this.c = c; 
    }
    //Herencia de ecuacion
    @Override
    public String formaEcuacion(){
        return "d = "+"("+(super.getB()+"*"+super.getB())+")"+" - 4*("+super.getA()+")*"+this.c;
    }

    @Override
    public String obtenerSolucion() {
        try {
            return "x1 = "+String.valueOf(calcularSolucion1());
        } catch (Excepciones_Ecuacion excepcionEcuacion) {
            return excepcionEcuacion.getMessage();
        }
    }
    
    //implementacion de la interfaz icuadratica
    @Override
    public double calcularSolucion1() throws Excepciones_Ecuacion {
        if (super.getA()==0 && super.getB()!=0) //no tendrá solucion
            throw new Excepciones_Ecuacion("......");
        d = (super.getB()*super.getB()) - (4*super.getA()*this.c);
        double valor = (- (super.getB()) - d) / 2*super.getA();
        return valor;
    }

    @Override
    public double calcularSolucion2() throws Excepciones_Ecuacion{
        if (super.getA()==0 && super.getB()!=0) //no tendrá solucion
            throw new Excepciones_Ecuacion("......");
        d = (super.getB()*super.getB()) - (4*super.getA()*this.c);
        double valor = (- (super.getB()) + d) / 2*super.getA();
        return valor;
    }
  
    @Override
    public String obtener_Solucion() {
        try {
            return "x2 = "+String.valueOf(calcularSolucion2());
        } catch (Excepciones_Ecuacion excepcionEcuacion) {
            return excepcionEcuacion.getMessage();
        }
    }
}
