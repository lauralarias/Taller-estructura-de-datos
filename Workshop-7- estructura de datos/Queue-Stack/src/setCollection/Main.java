package setCollection;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. Crear
        Set<String> vocales = new HashSet<>();

        // 2. Agregar Elementos
        vocales.add("A");
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");

        // 3. Existencia
        boolean existsA = vocales.contains("A");
        boolean existsB = vocales.contains("B");


        // 4. Eliminar
        vocales.remove("A");
        // indice X nombresList.remove(0);

        // 5. Tamaño
        int tamano = vocales.size();

        // 6. Recorrer

        // 6.1 foreach
        System.out.println(" foreach ");
        for (String nombreActual : vocales) {
            System.out.println(nombreActual);
        }

        // 6.2 iterator
        System.out.println(" Iterator ");
        Iterator<String> iterator = vocales.iterator();
        while(iterator.hasNext()){
            String vocalActual = iterator.next();
            System.out.println(vocalActual);
        }

        // 6.3 fori
        System.out.println(" fori ");
        for (Iterator<String> vocal = vocales.iterator(); vocal.hasNext();) {
            String vocalActual = vocal.next();
            System.out.println(vocalActual);
        }

        // 6.4 lambda
        System.out.println(" lambda ");
        vocales.stream().forEach(vocal -> System.out.println(vocal));

    }
}