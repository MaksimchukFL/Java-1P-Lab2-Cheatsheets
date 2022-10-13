package Colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        Las colecciones son un almacén de objetos dinámico (es decir, no hay que establecerles un tamaño), pueden estar previstas
        de ordenamiento y se puede insertar y eliminar elementos
         */

        /*
        Las primeras que veremos son las de tipo Set. No permiten elementos duplicados y tienen uso sencillo del elemento add para no tener elementos duplicados.
        Tienen la desventaja de no tener acceso aleatorio y tienen poca eficiencia al ordenar elementos.
        Probaremos las del tipo HashSet que no tienen ordenamiento y las de tipo TreeSet que si tienen.
         */

        Cliente c1=new Cliente("Franco Maksimchuk",1,10000);
        Cliente c2=new Cliente("Luciana Benitez",2,150000);
        Cliente c3=new Cliente("Elon Musk",3,100000000);
        Cliente c4=new Cliente("Pobre Diabla",4,100);
        Cliente c5=new Cliente("Ete Sech",5,5);

        //Declaración de la colección HashSet
        Set<Cliente> coleccion1=new HashSet<Cliente>();

        coleccion1.add(c1);
        coleccion1.add(c2);
        coleccion1.add(c3);
        coleccion1.add(c4);

        //Recorremos la colección
        System.out.println("Colección HashSet: ");
        for (Cliente cliente:coleccion1){
            System.out.println(cliente.toString());
        }

        //Probamos ahora con una colección de tipo TreeSet
        //Para poder realizar un ordenamiento efectivo podemos hacer una lista de strings
        TreeSet<String> coleccion2=new TreeSet<String>();
        coleccion2.add(c1.getNombre());
        coleccion2.add(c2.getNombre());
        coleccion2.add(c3.getNombre());
        coleccion2.add(c4.getNombre());
        System.out.println("\nColección TreeSet de nombres: ");
        for (String cliente:coleccion2) {
            System.out.println(cliente);
        }
        /*
        Si queremos realizar un ordenamiento específico para una clase, podemos implementarle la interfaz Comparable<> o Comparator<> a la clase
        y establecerle un criterio. Por ejemplo, si queremos ordenar según el saldo, se mayor a menor lo implementamos en la clase Cliente.
        Con Strings es un poco mas complicado pero con números las comparaciones son sencillas.
         */
        Cliente comparador=new Cliente();
        TreeSet<Cliente> coleccion3= new TreeSet<>(comparador);
        coleccion3.add(c1);
        coleccion3.add(c2);
        coleccion3.add(c3);
        coleccion3.add(c4);
        coleccion3.add(c5);
        System.out.println("\nColección TreeSet ordenada según saldo: ");
        for (Cliente cliente:coleccion3){
            System.out.println(cliente.toString());
        }

    }
}
