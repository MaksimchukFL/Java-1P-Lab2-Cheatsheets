package Interfaces;

public class Rectangulo implements Figura2D {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return 2*(base+altura);
    }
}
