package Herencia;

public class Persona {
    //La clase padre en este modelado será Persona.

    //Atributos
    private String nombre;
    private String apellido;
    private String id;

    //Constructor
    public Persona(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    //Propiedades. También, como métodos las heredaran las clases extendidas.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
