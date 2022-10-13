package Interfaces;

public class Cilindro implements Figura3D{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (2*pi*radio*(radio+altura));
    }

    @Override
    public double perimetro() {
        return ((2*pi*radio)*2)+((altura*2)+((2*pi*radio)*2));
    }

    @Override
    public double volumen() {
        return pi*radio*radio*altura;
    }
}
