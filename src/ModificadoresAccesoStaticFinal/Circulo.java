package ModificadoresAccesoStaticFinal;

final public class Circulo extends FiguraGeometrica {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Metodos
    public void perimetro(){
        setPerimetro(2*pi*radio);
        System.out.println(getPerimetro());
    }
    public void area(){
        setArea(pi*(radio*radio));
        System.out.println(getArea());
    }
}
