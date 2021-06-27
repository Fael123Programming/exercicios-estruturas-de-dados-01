package _dynamicstack;
public class Node {
    private int data;
    private Node previous;
    
    public Node(int data,Node previous){
        this.data=data;
        this.previous=previous;
    }
    
    public int getData(){return this.data;}
    
    public Node getPrevious(){return this.previous;}
    
    public void setData(int newData){this.data=newData;}
    
    public void setPrevious(Node newPrevious){this.previous=newPrevious;}
}
