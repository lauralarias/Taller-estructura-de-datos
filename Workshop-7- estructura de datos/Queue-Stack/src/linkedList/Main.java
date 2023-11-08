package linkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addValueAtEnd(30);
        list.addValueAtEnd(17);
        list.addValueAtEnd(14);
        list.addValueAtEnd(28);

        System.out.println(list);

        list.addValueAtEnd(61);
        System.out.println(list);

        list.addValueAtIndex(73, 5);
        System.out.println(list);

    }
}