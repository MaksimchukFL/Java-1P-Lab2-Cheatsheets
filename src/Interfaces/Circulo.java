package Interfaces;

public class Circulo implements Figura2D{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return pi*radio*radio;
    }

    @Override
    public double perimetro() {
        return 2*pi*radio;
    }
}
