package Colecciones;

import java.util.Comparator;

public class Cliente implements Comparator<Cliente> {
    private String nombre;
    private int idcuenta;
    private double saldo;

    public Cliente() {
    }

    public Cliente(String nombre, int idcuenta, double saldo) {
        this.nombre = nombre;
        this.idcuenta = idcuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", idcuenta=" + idcuenta +
                ", saldo=" + saldo +
                '}';
    }

    //Ordenamos de mayor a menor segun el saldo
    @Override
    public int compare(Cliente o1, Cliente o2) {
        if (o1.saldo>o2.saldo) return -1;
        if (o1.saldo<o2.saldo) return 1;
        else return 0;
    }
}
