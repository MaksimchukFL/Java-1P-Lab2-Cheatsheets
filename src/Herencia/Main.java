package Herencia;

public class Main {
    public static void main(String[] args) {
    //Permite la definición de una clase a partir de la definición de otra ya existente.
    //La herencia permite, principalmente, compartir automáticamente métodos y datos entre clases, subclases y objetos.
    //Un tip importante al diseñar la herencia es preguntarse ¿Clase1 es siempre un/una Clase2?
    //Esto es clave para tener siempre una herencia bien planteada.
    //Las zonas mas arriba de la cadena herencia deben ser mas generales y las zonas mas abajo serán más específicas.
        //Alumno hereda de Persona
    Alumno a1=new Alumno("Franco","Maksimchuk","27111","Laboratorio 2","Programacion 2","ASO");
    a1.mostrarDatos();
        //Becario hereda de Alumno
    Becario b1=new Becario("Luciana","Benitez","41081","Derecho Comercial","Derecho Administrativo","Derecho Procesal",1000);
    b1.mostrarDatos();
        //Profesor hereda de Persona
    Profesor p1=new Profesor("Facundo","Matoff","12345",100000,"Programacion 2");
    p1.mostrarDatos();
    }
}
