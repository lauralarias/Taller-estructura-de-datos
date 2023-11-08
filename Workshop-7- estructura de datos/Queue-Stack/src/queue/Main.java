package queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el aforo del evento: ");
        int aforo = scanner.nextInt();
        Evento evento = new Evento(aforo);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar un asistente");
            System.out.println("2. Procesar siguiente compra");
            System.out.println("3. Verificar estado del evento");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del asistente: ");
                    String nombre = scanner.next();
                    System.out.print("Número de tiquetes a comprar: ");
                    int tiquetesComprados = scanner.nextInt();
                    Asistente asistente = new Asistente(nombre, tiquetesComprados);
                    evento.registrarComprador(asistente);
                    break;
                case 2:
                    evento.procesarSiguienteCompra();
                    break;
                case 3:
                    evento.verificarEstado();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}