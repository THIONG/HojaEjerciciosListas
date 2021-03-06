package Ejercicio4;

public class Empleado {
    private String nombre;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: '" + nombre + '\'' +
                ", Sueldo: " + sueldo;
    }
}
