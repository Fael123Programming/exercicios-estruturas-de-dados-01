package _doubly_linked_list;

public class Cell {
    private Cell next;
    private Cell previous;
    private Object data;

    public Cell () {}

    public Cell(Cell next,Cell previous,Object data){
        this.next=next;
        this.previous=previous;
        this.data=data;
    }
    
    public Cell(Cell next,Object data){
        this(next,null,data);
    }
    
    public Cell(Object data){
        this(null,null,data);
    }

    public Cell getNext() {
        return this.next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getPrevious() {
        return this.previous;
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
