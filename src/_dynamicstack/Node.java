package _dynamicstack;

public class Node {
    private Object data;
    private Node previous;

    public Node(Object data, Node previous){
        this.data = data;
        this.previous = previous;
    }

    public Object getData(){ return this.data;}

    public Node getPrevious(){ return this.previous;}

    public void setData(Object newData){ this.data = newData;}

    public void setPrevious(Node newPrevious){ this.previous = newPrevious;}
}
