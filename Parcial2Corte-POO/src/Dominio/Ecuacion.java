package Dominio;

public abstract class Ecuacion {
    private double a;
    private double b;

    public Ecuacion(){
    }

    public Ecuacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //metodos
    public abstract String formaEcuacion();
    public abstract String obtenerSolucion();
}
