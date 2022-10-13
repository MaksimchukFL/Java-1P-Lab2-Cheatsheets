package Interfaces;

public class Cubo implements Figura3D{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return 6*lado*lado;
    }

    @Override
    public double perimetro() {
        return 12*lado;
    }

    @Override
    public double volumen() {
        return lado*lado*lado;
    }
}
