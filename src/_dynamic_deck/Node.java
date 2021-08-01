package _dynamic_deck;

public class Node {
    private Node next,previous;
    private Object data;
    
    public Node(Node next,Node previous,Object data){
        this.next=next;
        this.previous=previous;
        this.data=data;
    }
    
    public Node(Object data){
        this.data=data;
    }
    
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
