package Herencia;

public class Profesor extends Persona{
    //Atributos
    private int sueldo;
    private String catedra;
    //Propiedades
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    //Constructor
    public Profesor(String nombre, String apellido, String id, int sueldo, String catedra) {
        super(nombre, apellido, id);
        this.sueldo = sueldo;
        this.catedra = catedra;
    }
    //Metodo
    public void mostrarDatos(){
        System.out.println("El profesor "+getNombre()+" "+getApellido()+" enseña la materia "+getCatedra()+" y cobra "+getSueldo()+" pesos");
    }
}
