package com.company;

public class Prostokat implements Ksztalty{
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double powierzchnia() {
        return a * b;
    }

    @Override
    public double obwod() {
        return 2 * a + 2 * b;
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
}
