package _SimpleLinkedlist;
public class Cell {
    private Object data;
    private Cell next;
    
    public Cell(Object data,Cell next){
        this.data=data;
        this.next=next;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Cell getNext() {
        return this.next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }
}
