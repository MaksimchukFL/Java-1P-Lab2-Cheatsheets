package Herencia;

public class Becario extends Alumno{
    //Atributos
    private double sueldo;
    //Propiedades
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //Constructor
    public Becario(String nombre, String apellido, String id, String materia1, String materia2, String materia3, double sueldo) {
        super(nombre, apellido, id, materia1, materia2, materia3);
        this.sueldo = sueldo;
    }
    //Metodo
    public void mostrarDatos(){
        System.out.println("El becario "+getNombre()+" "+getApellido()+" cursa las materias: "+getMateria1()+","+getMateria2()+","+getMateria3()+" y cobra "+getSueldo()+" pesos");
    }
}
