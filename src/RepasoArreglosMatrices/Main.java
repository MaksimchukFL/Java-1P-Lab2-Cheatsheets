package RepasoArreglosMatrices;

public class Main {
    public static void main(String[] args) {
        //Los arreglos son una estructura de datos que contiene una colección de valores del mismo tipo.
        //Sirve para almacenar valores que normalmente tienen alguna relación entre sí.

        //Sintaxis: Declaramos un arreglo de longitud 5  le asignamos valores.
        //En java, las posiciones se cuentan desde el cero
        int arr1[]=new int [5];
        arr1[0]=15;
        arr1[1]=25;
        arr1[2]=8;
        arr1[3]=-7;
        arr1[4]=92;
        //Si conocemos de antemano los elementos, podemos definirlo así
        int arr2[]={15,25,8,-7,92};
        //Los arreglos pueden contener cualquier tipo de dato primitivo, por ejemplo strings.
        String arrstrings[]={"Hola","como","estas"};

        //Recorrida de un arreglo: Utilizamos la estructura repetitiva for para recorrerlo:
        for (int i=0;i<arrstrings.length;i++){
            System.out.println(arrstrings[i]+" ");
        }


        //Las matrices son arreglos de dos dimensiones. Tambien las posiciones se empiezan a contar desde el cero.
        //Los podemos declarar de las siguientes maneras, elemento a elemento como el caso anterior o tambien de forma matricial
        //Para una matriz de 5 columnas y 3 filas:
        //Para hacerlo mas legible podemos declararla de forma amtricial usando corchetes y comas
        int [][] mat1=new int[5][3];
        int [][] mat2={
                {7,17,37,71,32},
                {9,29,49,18,41},
                {27,2,25,91,54},
        };

        //Es practico recorrer las matrices con la estructura for each:
        for (int [] fila:mat2){
            for(int elemento:fila){
                System.out.print(elemento+" ");
            }
            System.out.println("");
        }
    }
}
