package Interfaces;

public class Main {
    public static void main(String[] args) {
        //Las interfaces en java son un conjunto de metodos que no definen un cuerpo o se dice que poseen un cuerpo vacio.
        //Se pueden describir como "contratos" que una clase debe "implementar" para exponer funcionalidad a otras clases.
        //Una clase puede implementar varias interfaces
        //Las interfaces tambien pueden heredar de otras o varias interfaces
        //Pueden actuar como un medio de "comunicación entre dos sistemas independientes"
        //Pueden contener constantes
        //No pueden instanciarse y todos sus métodos son public y abstract.

        System.out.println("Rectangulo de base 2 y altura 3: ");
        Rectangulo r1=new Rectangulo(2,3);
        System.out.println("El perímetro es: "+r1.perimetro()+" y el area es: "+r1.area());

        System.out.println("Circulo de radio 10: ");
        Circulo c1=new Circulo(10);
        System.out.println("El perímetro es: "+c1.perimetro()+" y el area es: "+c1.area());

        System.out.println("Cubo de lado 10: ");
        Cubo cu1=new Cubo(10);
        System.out.println("El perímetro es: "+cu1.perimetro()+" y el area es: "+cu1.area()+" y el volumen es: "+cu1.volumen());

        System.out.println("Cilindro de radio 10 y altura 5");
        Cilindro ci1=new Cilindro(10,5);
        System.out.println("El perímetro es: "+ci1.perimetro()+" y el area es: "+ci1.area()+" y el volumen es: "+ci1.volumen());
    }
}
