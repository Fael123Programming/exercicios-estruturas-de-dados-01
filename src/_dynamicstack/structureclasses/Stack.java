package _dynamicstack.structureclasses;

import java.util.Arrays;

public class Stack<T> {
    private Node<T> top;

    public void push(T data) {
        this.top = new Node<>(data, this.top);
    }

    public T pop() {
        if (this.isEmpty())
            throw new StackUnderflowException();
        Node<T> nodeToRemove = this.top;
        this.top = nodeToRemove.getPrevious();
        nodeToRemove.setPrevious(null);
        return nodeToRemove.getData();
    }

    public T top() {
        return this.top.getData();
    }

    public int size() {
        if (this.isEmpty())
            return 0;
        Node<T> element = this.top;
        int counter = 0;
        while (element != null) {
            counter++;
            element = element.getPrevious();
        }
        return counter;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public boolean clean() {
        if (this.isEmpty())
            return false;
        this.top = null;
        return true;
    }

    public Object[] getElements() {
        if (this.isEmpty())
            return null;
        Object[] elements = new Object[this.size()];
        Node<T> top = this.top;
        int counter = 0;
        while (top != null) {
            elements[counter++] = top.getData();
            top = top.getPrevious();
        }
        return elements;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getElements());
    }
}
