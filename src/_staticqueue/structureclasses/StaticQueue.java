package _staticqueue.structureclasses;

import java.util.Arrays;

public class StaticQueue<T> {
    private final Object[] elements;
    private int positionLastElement;

    public StaticQueue(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("size must be > 0");
        else
            this.elements = new Object[size];
        this.positionLastElement = -1;
    }

    public int size() {
        return this.positionLastElement + 1;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean isFull() {
        return this.size() == this.elements.length;
    }

    public void enqueue(T data) {
        if (this.isFull())
            throw new QueueOverflowException();
        this.elements[++this.positionLastElement] = data;
    }

    public T dequeue() {
        if (this.isEmpty())
            throw new QueueUnderflowException();
        T dataToReturn = (T) this.elements[0];
        for (int counter = 0; counter < this.positionLastElement; counter++)
            this.elements[counter] = this.elements[counter + 1];
        this.positionLastElement--;
        return dataToReturn;
    }

    public T first() {
        if (this.isEmpty())
            return null;
        return (T) this.elements[0];
    }

    public T[] getElements() {
        if (this.isEmpty())
            return null;
        Object[] realElements = new Object[this.size()];
        for (int i = 0; i < this.size(); i++)
            realElements[i] = this.elements[i];
        return (T[]) realElements;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getElements());
    }
}
