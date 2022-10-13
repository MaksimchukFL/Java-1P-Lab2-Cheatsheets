package Excepciones;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*En base a la jerarquía de errores, los que los programadores pueden controlar estan dentro de la clase Trowable.
        Estos errores son los que ocurren en el tiempo de ejecución (que no tienen que ver con la sintaxis). Los Error no
        los podemos controlar porque la mayor parte del tiempo tienen que ver con el hardware o el sistema operativo.
        Los Exception son los que vamos a controlar.
         */
        /*IOException o excepciones verificadas son las que tienen que ver con la entrada y salida. No dependen directamente del programador.
        La mayoría de estos errores se presentan cuando nosotros debemos chequear la presencia, por ejemplo, de un archivo.
        Siempre que queremos tratar errores, es util consultar e internet en la API de JAVA
         */
        /*De paso introducimos el bloque try-catch. Este bloque es una estructura de control, funciona similar a un IF.
        Dentro de try van las instrucciones a realizar y dentro de catch(parametros) va el reporte de excepción al atrapar el error
        presente en el parámetro.
         */
        BufferedImage sus=null;
        BufferedReader texto=null;
        try {
            sus= ImageIO.read(new File("src/Excepciones/sus.jpg"));
            System.out.println("La imagen existe");
        } catch (IOException e){
            System.out.println("LA IMAGEN NO EXISTE");
        }
        //Otro ejemplo con un archivo de texto
        try {
            texto= new BufferedReader(new FileReader("src/Excepciones/texto.txt"));
            String linea;
            while((linea=texto.readLine())!=null){
                System.out.println(linea);
            }
        } catch (IOException ex){
            System.out.println("NO SE ENCONTRO EL ARCHIVO");
        }
        /*
        Las excepciones no verificadas o RuntimeExeption son las que deben ser previstas por el programador. Son los que ocurren
        cuando por ejemplo un método intenta acceder a un miembro de un objeto con una referencia nula, o la division por cero:
         */
        System.out.println("\nVamos a dividir dos números!");
        Scanner s=new Scanner(System.in);
        int a,b;
        double resultado;

        try{
            System.out.println("Ingrese un número entero: ");
            a=s.nextInt();
            System.out.println("Ingrese otro número entero: ");
            b=s.nextInt();
            resultado=a/b;
            System.out.println("El resultado es: "+resultado);
        } catch (InputMismatchException ie){
            System.out.println("ERROR EN EL INGRESO DE DATOS");
        } catch (RuntimeException re){
            System.out.println("ALGO HA SALIDO MAL, O DIVIDIÓ POR CERO O HIZO ALGUNA OTRA COSA RARA, INTENTE DE NUEVO");
        }
        //Como se ve, se pueden capturar varias excepciones con catch.

        //Al invocar a los métodos que contienen throws la IDE nos obliga a manejar el correspondiente error declarado.
        //Esto ocurre en este caso al ser una excepción veridicada

        try {
            leerArchivo();
            System.out.println("Archivo encontrado con throws");
        } catch (FileNotFoundException e) {
            System.out.println("ARCHIVO NO ENCONTRADO");
            throw new RuntimeException(e);
        }

        //Cuando la excepción es de tipo no verificada, throws no nos obliga a utilizar la clausula trycatch, es opcional.
        //Para probar el error se deben cambiar los parametros de la division
        System.out.println("\nVamos a dividir para probar throws opcional, yay!");
        try {
            dividir(12, 4);
        } catch (ArithmeticException ae){
            System.out.println("DIVISION POR CERO");
            ae.printStackTrace();
        }

        //También podemos crear nuestras propias excepciones utilizando herencia!
        System.out.println("\nEste es mi propio método para dividir que contempla la división por cero con mi propia excepción!");
        dividirPropio(12,4);

        //Existe la cláusula finally, con la que podemos colocar código que se ha de ejecutar siempre
        System.out.println("\nCapturaremos mi propia excepción, y ocurra o no, se verá el código a continuacion");
        try {
            dividirPropio(12,1);
        } catch (DivisionPorCero d0){
            d0.printStackTrace();
        } finally{
            System.out.println("Hayas visto o no a la langosta, esto lo verás siempre.");
        }
    }
    //Podemos analizar posibles errores en un método utilizando throws. Cuando manejamos archivos esto es necesario, por ejemplo:
    //Declaramos la excepción en el método.
    private static void leerArchivo() throws FileNotFoundException {
        File archivo=new File("src/Excepciones/texto.txt");
        FileReader fr=new FileReader(archivo);
    }
    private static void dividir(int a,int b) throws ArithmeticException {
        double resultado=a/b;
        System.out.println(resultado);
    }
    private static void dividirPropio(int a, int b) throws DivisionPorCero{
        if (a==0||b==0){
            DivisionPorCero miExepción=new DivisionPorCero("DIVIDIO POR CERO,QUE NO FUE A LA PRIMARIA?!, AHORA PRESENCIA LA LANGOSTA \n" +
                    "    ╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╦╦╦░╫╫\n" +
                    "    ╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫▓▓▓╫╫▓▓▓╜Ü░░░░»╚╢▓╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫░╦╫╫╫\n" +
                    "    ╫╫╫▓╫╫╫╫╫▓▓▓╫╫╫╫▓▓▓▓▓▓▓▓▓▓▓▓▓░╥╫╩░û░╦╦╦░░╣▓▓▓▓▓╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫\n" +
                    "    ╫╫╫╫╫╫╫╫╫╫╫╫▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌»░░û╦╩░╦╦ÑN═≈░╫▀▓▓╫╫▓▓▓▓▓▓▓▓▓▓▓▓▓╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫╫▓\n" +
                    "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░.╦░ ¿]░╦░»░µ╚░░╠▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╫╫╫╫╫╫╫▓▓▓▓\n" +
                    "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓M░░j░':╫╫▓▓▓╫╫╫╩╣▄▄░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌░/░╨ ,╔╬╫▓▓▓▓▄╚▓▓▓▀U╫▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀]░░╦µ»╦▓R╫╫▓╫╫╫╣╫▓▓▓▓╫▓▓▓▓▌╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀░╫╣▓▓▓▌╨╫≥]╫╬╫▓▄╫╬▓▓▌╫▓▓▓╫▓╬╫╫▓╫KQ╦Ü░▀▀▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌]╫╫▓▓▀▀░░╦╫N╫╫╫▓█▓▄╫╫╫╫▓╫╫╟█▓▓▓╣╫╫╫░░░░`,░▄╨▀▀▀▀▀██▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "    ▓█▀▀▀▀╠╠░░░░░û░╦H╫╫▌Ü╦╦╦Ñ╫╫╫╫╫╫╫▓██▓╫╫▓╫▓▓╣╫▓▓▓╫╫╫╫Ñ╦µ░╦╫NÖMU╫D░░Ü░░░░░░░░Ö╙╨▀▀▀\n" +
                    "    D░╦░░░û╦╦░╫Ñ╩╩╬╩╩\"╫░`\"░╠╫╩Ñ╠░╫╫╫▓▓▓▓▓╫╫╫▓▓╫███▓▓╫╬╫╫▓▓▓▓▀Ñ╨Ü╦░░╨╩░░░░░░░░░»░░░░░\n" +
                    "    Ñ░Ñ╩╫╫╫╫╫╫╫Ñ╦╦╫╫╫Ñ╙░░░╫╫╫░╫╫╦░╫▓▓████▒╫▓▓█╫╫█▓██▓╫▓▓▓▓╫╫╬░░ÑÑ╫╫╦╦>╙╨╫╬╫Ñ░U░░░░░░\n" +
                    "    ╫╫╫Ñ╫╫╫╫╫╫╬╫╫╫╬╫Ñ╫░H,░╩╬Ö╫╬╫╦░╫██████▌╫▓██▓╫█████▓▓▓▓▓Ñ╫╦░░╬░╫╬Ñ╫╫U.`╨╫╫░░░░░░░░\n" +
                    "    ╫╫╫╫╫╫╫╫╬╣╫▓▓╫╫▓▓╫░░«░╫╬╫╬▀╫╫▓████████╫▓███╫╫███▓▓▓▓▓▀╫╫╫╫╫Ñ░╫╫╫╫Ñ╫U`»░╨╫╬╦╦╦╦╦░\n" +
                    "    ╬╫╣╫▓▓▓▓▓▓▓▓▓▓▓▓▌╫╫╦╩░╫╫╫╫╦╫░╦░╨░╬████╫╣████╫▓▌╣▓▓▓██▓▓╬╫░╫╫ÑÑÑ╫╫╫╫╫░─]N░╩╫R╫ÑM░\n" +
                    "    ▓▓▓▓▓▓╫▓╫╫▓▓▓███]░╫░╦Ñ╠╫╫╫╫╫╫╫╫╬░╦╫╫▓▓╫╫███▓▓╫██▓█▓▓▓▓▓╬Ñ░N╫╨░░╨╨╫╫ÑÑ>!╨░░╬╫M╦░╩\n" +
                    "    ▓╣▓╫▓▓╫╫╫▓███▀╫H]░░░░╫Ñ╫╫▓╫╫╫╫╬Ñ╫░ÑÑ╫╫▌╫▓▓▓██╫▓▓▓▓▓╫▓▓╫▓╦░░╦▄╦m╔╦]╫╫Ñ░>'░╫╠Ü╚╫╦╦\n" +
                    "    █▓▓╫▓╫▓╫▓███╬╫▓H]╫░╦╫╫Ü╫╫╫╫╫╫▓╬Ñ╫╫╬ÑÑ╫▌╫███▓█▓╫▓▓▓▓▓▓▓▓▓Ñ╗╠╫╜░µ╫▀▄╩░░░╦ »)░H░░╫Ñ\n" +
                    "    ▓▓╣╫╫╫╫▓███▓▓▓▓H]╫╦╫╫╫░╫╫╫╫▓╫╫╫╫╫╫╫╫╫╫▓╫▓█████╫█▓▓▓▓▓▓▓▓▌▓▓░╦╬╬╫Ñ╨▀▄░░╫╦µ'»░╫╠K╟\n" +
                    "    \n" +
                    "---\n" +
                    "TIRURIIIIII TIRIRIRIRIIIRIIIIIII\n");
            throw miExepción;
        }
        double resultado=a/b;
        System.out.println(resultado);
    }
}

