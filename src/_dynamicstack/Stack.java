package _dynamicstack;
public class Stack {
    private Node top;
    
    public Stack(){
        this.top=null;
    }
    
    public void push(int data){
        Node newNode=new Node(data,this.top);
        this.top=newNode;
    }
    
    public boolean pop(){
        if(this.isEmpty()) return false;
        Node nodeToRemove=this.top;
        this.top=nodeToRemove.getPrevious();
        nodeToRemove.setPrevious(null);//Unlinking element.
        return true;
    }
    
    public Node top(){
        return this.top;
    }
    
    public int size(){
        if(this.isEmpty()) return 0;
        Node element=this.top;
        int counter=0;
        while(element!=null){
            counter++;
            element=element.getPrevious();
        }
        return counter;
    }
    
    public boolean isEmpty(){
        return this.top==null;
    }
    
    public Node[] getElements(){
        if(this.isEmpty()) return null;
        Node elements[]=new Node[this.size()];
        Node node=this.top;
        for(int counter=0;counter<elements.length;counter++){
            elements[counter]=node;
            node=node.getPrevious();
        }
        return elements;
    }
    
    public boolean clean(){
        /*if(this.isEmpty()) return false;
        Node elementToRemove=this.top;
        while(elementToRemove!=null){
            this.top=elementToRemove.getPrevious();
            elementToRemove.setPrevious(null);
            elementToRemove=this.top;
        }
        return true;*/
        if(this.isEmpty()) return false;
        while(this.pop()) this.pop();
        return true;
    }
}
