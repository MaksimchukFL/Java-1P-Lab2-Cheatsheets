package UpcastingDowncasting;

public class Jefe extends Empleado{
    private double incentivo;

    public Jefe(String nombre, double sueldo,double incentivo) {
        super(nombre, sueldo);
        this.incentivo=incentivo;
    }

    //Polimorfismo. Este metodo que esta presente en empleado, tambien esta en jefe, con un comportamiento diferente.
    public double getSueldo(){
        return super.getSueldo()+this.incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + super.getNombre() + '\'' +
                ", sueldo=" + super.getSueldo() +
                ", sueldo con incentivo=" + getSueldo() +
                ", incentivo=" + incentivo +
                '}';
    }
}
