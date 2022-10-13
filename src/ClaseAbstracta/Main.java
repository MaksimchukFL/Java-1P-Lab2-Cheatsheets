package ClaseAbstracta;

public class Main {
    public static void main(String[] args) {
        //Una clase declarada abstracta, puede o no incluir metodos abstractos. No pueden ser instanciadas, pero pueden generar herencia.
        //El metodo abstracto es un metodo sin implementación o cuerpo, que debera ser implementado si o si por sus subclases.

        /*Diferencia con las interfaces: Son similares en el sentido de que no se pueden instanciar y contienen metodos que pueden o no
        tener una implementación. Con las clases abstractas sin embargo, pueden declararse campos que no sean static o final, y definir
        metodos publicos, privados y concretos. Con interfaces, todos los campos son automaticamente public, static y final y todos los
        métodos son públicos. Solo puedes implementar una clase abstracta (no hay herencia multiple), sin embargo, se pueden implementar
        varias interfaces.
         */
        Rectangulo r1=new Rectangulo(10,15);
        System.out.println(r1.perimetro());
        System.out.println(r1.area());

        Circulo c1=new Circulo(10);
        System.out.println(c1.perimetro());
        System.out.println(c1.area());
    }
}
