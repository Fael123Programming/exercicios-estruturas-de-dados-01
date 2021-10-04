package _dynamicstack;

import _dynamicstack.Node;

public class Stack {
    private Node top;

    public Stack(){
        this.top=null;
    }

    public void push(Object data){
        Node newNode = new Node(data, this.top);
        this.top = newNode;
    }

    public Object pop(){
        if(this.isEmpty()) return null;
        Node nodeToRemove = this.top;
        this.top = nodeToRemove.getPrevious();
        nodeToRemove.setPrevious(null);
        return nodeToRemove.getData();
    }

    public Node top(){
        return this.top;
    }

    public int size(){
        if(this.isEmpty()) return 0;
        Node element = this.top;
        int counter = 0;
        while(element != null){
            counter ++;
            element = element.getPrevious();
        }
        return counter;
    }

    public boolean isEmpty(){
        return this.top == null;
    }

    public Node[] getElements(){
        if(this.isEmpty()) return null;
        Node elements[] = new Node[this.size()];
        Node node = this.top;
        for(int counter = 0; counter < elements.length; counter ++){
            elements[counter] = node;
            node = node.getPrevious();
        }
        return elements;
    }

    public boolean clean(){
        if(this.isEmpty()) return false;
        this.top = null;
        return true;
    }
}
