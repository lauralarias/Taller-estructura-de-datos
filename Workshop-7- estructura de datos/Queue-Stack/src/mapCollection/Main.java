package mapCollection;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. Crear
        Map<String, Integer> numbersMap = new HashMap<>();

        // 2. Agregar Elementos
        numbersMap.put("uno", 10);
        numbersMap.put("dos", 2);
        numbersMap.put("tres", 3);
        numbersMap.put("cuatro", 4);
        numbersMap.put("uno", 1);

        // 3. Existencia
        boolean existsUno = numbersMap.containsKey("uno"); // True
        boolean  exists10 = numbersMap.containsValue(10); // False


        // 4. Eliminar
        numbersMap.remove("dos");

        // 5. Tamaño
        int tamano = numbersMap.size();

        // 6. Recorrer

        
        // 6.1 foreach
        System.out.println(" foreach ");
        for (Map.Entry<String, Integer> entry: numbersMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 6.3 Iterator
        System.out.println(" Iterator ");
        Iterator<Map.Entry<String, Integer>> iterator = numbersMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 6.4 Lambda
        System.out.println(" Lambda ");
        numbersMap
                .entrySet()
                .stream()
                .forEach(
                        entry ->
                                System.out.println(entry.getKey() + ": " + entry.getValue())
                );

    }
}