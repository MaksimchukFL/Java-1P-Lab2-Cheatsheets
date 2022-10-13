package ClaseAbstracta;

public class Rectangulo extends FiguraGeometrica {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double perimetro() {
        return 2*(base+altura);
    }

    @Override
    double area() {
        return base*altura;
    }
}


