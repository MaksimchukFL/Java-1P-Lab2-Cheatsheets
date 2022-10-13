package POOEstructura;

public class CuentaCorriente {
    //En esta clase se repasará la estructura básica de una clase en java.

    //Atributos. Siempre deben ser private, salvo casos excepcionales.
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    //Propiedades. Aquí establecemos los getters y setters. Se implementará uno por variable por conveniencia.
    //Un getter es un método que permite acceder al valor de un atributo y el setter permiten fijar el valor de un atributo.
    //Se pueden realizar con la IDE con facilidad.
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Constructor por defecto, es buena práctica incluirlo siempre.
    public CuentaCorriente() {
    }

    /* Constructor con parámetros. Es muy util para que cuando instanciamos un objeto de esta clase, ya podemos darle valores
    a sus atributos */
    public CuentaCorriente(String nombreTitular,double saldo) {
        //Para especificar una propiedad o método propio de la clase dentro de otro contexto.
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
        //Le generamos un número de cuenta aleatorio
        this.numeroCuenta=(long)(Math.random()*9999999);
    }

    //Metodos
    public void setIngreso(double ingreso){
        if (ingreso<=0)
            System.out.println("El valor debe ser mayor a cero");
        else
            saldo=saldo+ingreso;
    }

    public void setReintegro(double reintegro)
    {
        if (reintegro<=0)
            System.out.println("El valor debe ser mayor a cero");
        else
            saldo=saldo-reintegro;
    }

    public static void Transferencia(CuentaCorriente c1, CuentaCorriente c2, double importe)
    {
        //Podemos hacer referencia tranquilamente a otro objeto en un método implicado.
        c1.saldo=c1.saldo-importe;
        c2.saldo=c2.saldo+importe;
    }

    public static void getDatos(CuentaCorriente c1){
        System.out.println("El número de cuenta de "+c1.getNombreTitular()+" es "+c1.numeroCuenta+" y el saldo es de $"+c1.getSaldo());
    }

}
