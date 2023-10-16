package entities;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public double calculaP(){
        return ((getA() + getB() +getC())/2.0);
    }

    public double calculaArea(){
        return Math.sqrt(calculaP() * (calculaP() - getA()) * (calculaP() - getB()) *  (calculaP() - getC()));
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

