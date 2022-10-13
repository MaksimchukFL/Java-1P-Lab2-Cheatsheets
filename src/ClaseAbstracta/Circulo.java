package ClaseAbstracta;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double perimetro() {
        return 2*pi*radio;
    }

    @Override
    double area() {
        return pi*radio*radio;
    }
}
