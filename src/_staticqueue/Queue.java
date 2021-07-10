package _staticqueue;
public class Queue {
    private Object objects[];
    private int lastPosition;
    
    public Queue(int size){
        if(size<=0) this.objects=new Object[1];
        this.objects=new Object[size];
        this.lastPosition=-1;
    }
    
    public int size(){
        return this.lastPosition+1;
    }
    
    public boolean isEmpty(){
        return this.size()==0;
    }
    
    public boolean insert(Object newObject){
        if(this.size()==this.objects.length) return false;
        this.objects[++this.lastPosition]=newObject;
        return true;
    }
}
