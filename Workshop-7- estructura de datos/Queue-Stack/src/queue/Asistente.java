package queue;

public class Asistente {
    private final String nombre;
    private final int tiquetesComprados;

    public Asistente(String nombre, int tiquetesComprados) {
        this.nombre = nombre;
        this.tiquetesComprados = tiquetesComprados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiquetesComprados() {
        return tiquetesComprados;
    }
}
