package ModificadoresAccesoStaticFinal;
//Si queremos romper la cadena de herencia podemos usar la palabra final. Nadie mas heredará de Rectangulo
//Tambien puede usarse para hacer métodos que no queremos que sean reescritos en la herencia.
final public class Rectangulo extends FiguraGeometrica {
    private double l1,l2;
    //Atributos
    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public Rectangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    //Metodos
    public void perimetro(){
        setPerimetro(2*(l1+l2));
        System.out.println(getPerimetro());
    }
    public void area(){
        setPerimetro(l1*l2);
        System.out.println(getPerimetro());
    }

}
