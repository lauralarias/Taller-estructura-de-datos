package queue;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> list = new LinkedList<>();

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void add(Integer value) {
        this.list.addLast(value);
    }

    public Integer peek() {
        if(this.list.isEmpty()) return null;
        return this.list.getFirst();
    }
    public Integer remove(){
        return this.list.remove();
    }


}

