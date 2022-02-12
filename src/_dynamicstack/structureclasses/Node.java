package _dynamicstack.structureclasses;

public class Node<T> {
    private T data;
    private Node<T> previous;

    public Node(T data, Node<T> previous) {
        this.data = data;
        this.previous = previous;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public void setPrevious(Node<T> newPrevious) {
        this.previous = newPrevious;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
