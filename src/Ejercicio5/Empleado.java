package Ejercicio5;

public class Empleado {
    private String nif, nombre;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String nif, String nombre, double sueldo) {
        this.nif = nif;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "NIF: '" + nif + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Sueldo: " + sueldo;
    }
}
