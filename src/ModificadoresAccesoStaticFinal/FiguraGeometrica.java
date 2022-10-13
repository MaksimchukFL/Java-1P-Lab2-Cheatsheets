package ModificadoresAccesoStaticFinal;

public class FiguraGeometrica {
    //Una manera util de definir constantes en java es con la palabra reservada final. También tiene otros usos a verse.
    //Con la palabra resevada protected, podemos acceder a ese atributo desde las clases que heredan
    //Atributos
    final protected double pi=3.14159265359;
    private double area;
    private double perimetro;
    //Propiedades
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    //
}
