package UpcastingDowncasting;

public class Main {
    public static void main(String[] args) {
    //Primeramente introducimos e concepto practico de polimorfismo y principio de sustitución:
        //Cuando hablamos de polimorfismo, nos referimos a, por ejemplo, que en dos objetos de tipos distintos, podemos enviar mensajes del mismo nombre, con diferentes comportamientos.
        //El principio de sustitución nos permite utilizar cualquier clase que hereda de otra como su padre, sin necesidad de conocer las diferencias entre ellas
    //Crearemos una lista de 3 empleados.
    Empleado empleados []=new Empleado[3];
    //Agregamos
    empleados[0]=new Empleado("Franco",1000);
    empleados[1]=new Empleado("Luciana",1200);
    //Por principio de sustitución, podemos realizar UPCASTING o implicito, tomando un jefe, y agregandolo a una lista de empleados.
    empleados[2]=new Jefe("Alejandro",1000,500);
    //Este tipo siempre es posible por principio de sustitución ya que un jefe siempre es un empleado, bajo una herencia.
        //Para hacer este procedimiento es importante utilizar toString() en las clases. Y agregarle las modificaciones que sean necesarias
        for (Empleado objeto:empleados
             ) {
            System.out.println(objeto.toString());
        }
    //Downcasting es cuando almacenamos una superclase en su clase. Este casting es preferible evitarlo y no se puede hacer por principio de sustitución.
    //Para realizarlo, debemos inicializarlo como upcasting y después especificar como parentesis la clase hija. Alli este objeto creado tendra los atributos del padre.
    Empleado down=new Jefe("Down",5000,100);
    Jefe downempleado=(Jefe) down;

    System.out.println("El nombre del empleado creado por downcasting es: "+downempleado.getNombre());
    downempleado.imprimir();
    }
}
