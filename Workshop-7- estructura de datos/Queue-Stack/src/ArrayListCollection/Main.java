package ArrayListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. Crear
        List<String> nombresList = new ArrayList<>();

        // 2. Agregar Elementos
        nombresList.add("1. Lugel");
        nombresList.add("2. Camilo");
        nombresList.add("3. Rosario");
        nombresList.add("4. Danna");
        nombresList.add("5. Juliana");

        // 3. Existencia
        boolean existsLugel = nombresList.contains("1. Lugel"); // True
        boolean  existsLaura = nombresList.contains("Laura"); // False


        // 4. Eliminar
        nombresList.remove("Lugel");
        nombresList.remove(0);

        // 5. Tamaño
        int tamano = nombresList.size();

        // 6. Recorrer
        
        // 6.1 for i
        System.out.println(" fori ");
        for (int i = 0; i < tamano; i++) {
            String nombreActual = nombresList.get(i);
            System.out.println(nombreActual);
        }
        
        // 6.2 foreach
        System.out.println(" foreach ");
        for (String nombreActual: nombresList) {
            System.out.println(nombreActual);
        }

        // 6.3 Iterator
        System.out.println(" Iterator ");
        Iterator<String> iterator = nombresList.iterator();
        while(iterator.hasNext()){
            String nombreActual = iterator.next();
            System.out.println(nombreActual);
        }

        // 6.4 Lambda
        System.out.println(" Lambda ");
        nombresList
                .stream()
                .forEach(
                        nombreActual ->
                                System.out.println(nombreActual)
                );

    }
}