package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Evento {
    private final Queue<Asistente> cola;
    private final int aforo;

    public Evento(int aforo) {
        this.aforo = aforo;
        this.cola = new LinkedList<>();
    }

    public void registrarComprador(Asistente asistente) {
        cola.add(asistente);
    }

    public void procesarSiguienteCompra() {
        if (!cola.isEmpty()) {
            Asistente asistente = cola.poll();
            System.out.println("Procesando compra de " + asistente.getTiquetesComprados() + " tiquetes para " + asistente.getNombre() + ".");
        } else {
            System.out.println("No hay compradores en la cola.");
        }
    }

    public void verificarEstado() {
        if (cola.isEmpty()) {
            System.out.println("Sold out. Todos los tiquetes han sido vendidos.");
        } else {
            System.out.println("Tiquetes disponibles: " + (aforo - cola.size()));
        }
    }
}