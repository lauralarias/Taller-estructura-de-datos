package linkedList;

public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void addValueAtStart(int data) {
        Node newNode = new Node(data);

        newNode.next = this.head;
        this.head = newNode;
        if (newNode.next == null) {
            this.tail = newNode;
        }
    }

    public void addValueAtEnd(int data){
        if(tail == null) {
            addValueAtStart(data);
        }else{
            Node newNode = new Node(data);
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
    
    public void addValueAtIndex(int data, int index){
        if(index == 0){
            this.addValueAtStart(data);
        } else if (index < 0){
            throw new IndexOutOfBoundsException("No se permiten posiciones negativas");
        } else {
            Node newNode =  new Node(data);
            Node current = this.head;
            for (int i = 0; i < index - 1; i++) {
                if(current == null) {
                    throw new IndexOutOfBoundsException("Indice " + index + " fuera del rango " +  i);
                }
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;

        }
    }

    @Override
    public String toString() {
        if (this.head == null) return "Empty List";

        String result = "";
        Node current = this.head;

        do {
            result += current.data + " > ";
            current = current.next;

        } while (current != null);

        return result;
    }
}
