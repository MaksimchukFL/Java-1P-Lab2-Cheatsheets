package Herencia;
//La palabra reservada extends se utiliza para indicar "hereda de"
public class Alumno extends Persona{
    //Atributos
    private String materia1;
    private String materia2;
    private String materia3;
    //Propiedades

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }
    //Constructor

    public Alumno(String nombre, String apellido, String id, String materia1, String materia2, String materia3) {
        //La palabra reservada super se utiliza siempre que querramos hacer referencia a una variable o método de la superclase
        //En este caso hacemos referencia al constructor
        super(nombre, apellido, id);
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    //Metodos
    public void mostrarDatos(){
        System.out.println("El estudiante "+getNombre()+" "+getApellido()+" estudia las materias: "+getMateria1()+","+getMateria2()+","+getMateria3());
    }
}
