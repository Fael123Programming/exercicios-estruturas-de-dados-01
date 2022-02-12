package _dynamicqueue.structureclasses;

import _dynamicstack.structureclasses.Node;
import java.util.Arrays;

public class Queue<T> {
    private Node<T> first, last;

    public void enqueue(T data) {
       Node<T> newNode = new Node<>(data, null);
       if (this.isEmpty()) {
           this.first = newNode;
       } else {
           this.last.setPrevious(newNode);
       }
       this.last = newNode;
    }
    public T dequeue(){
        if(this.isEmpty())
            throw new EmptyQueueException();
        Node<T> toRemove = this.first;
        this.first = this.first.getPrevious();
        toRemove.setPrevious(null);
        return toRemove.getData();
    }

    public Object[] getElements(){
        if (this.isEmpty())
            return null;
        Object[] elements = new Object[this.size()];
        Node<T> current = this.first;
        int counter = 0;
        while (current != null) {
            elements[counter++] = current.getData();
            current = current.getPrevious();
        }
        return elements;
    }

    public int size() {
        if (this.isEmpty())
            return 0;
        Node<T> current = this.first;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.getPrevious();
        }
        return counter;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public T first() {
        if(this.isEmpty())
            return null;
        return this.first.getData();
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getElements());
    }
}
