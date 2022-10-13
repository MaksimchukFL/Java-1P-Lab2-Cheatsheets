package POOEstructura;

public class UsoCuenta {
    public static void main(String[] args) {
        //En la clase principal hacer lo siguiente:
        //Crea una clase principal con el nombre de UsoCuenta.
        //Crea dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2.
        //Haz una transferencia de Cuenta1 a Cuenta2 por importe de $2500.
        //Imprime los datos de las dos cuentas en consola.
        CuentaCorriente Cuenta1=new CuentaCorriente("Franco",10000);
        CuentaCorriente Cuenta2=new CuentaCorriente("Luciana",10000);
        CuentaCorriente.Transferencia(Cuenta1,Cuenta2,2500);
        CuentaCorriente.getDatos(Cuenta1);
        CuentaCorriente.getDatos(Cuenta2);
    }
}
