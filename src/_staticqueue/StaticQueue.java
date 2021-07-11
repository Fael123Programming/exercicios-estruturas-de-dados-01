package _staticqueue;
/**
 * -> Static queue with a generalized array which supports whatever data type.
 * It implements the basic actions that is possible to do with a queue.
 * @author Rafael.
 */
public class StaticQueue {
    private Object objects[];
    private int positionLastElement;
    
    public StaticQueue(int size){
        if(size<=0) this.objects=new Object[1];
        else this.objects=new Object[size];
        this.positionLastElement=-1;
    }
    
    public int size(){
        return this.positionLastElement+1;
    }
    
    public boolean isEmpty(){
        return this.size()==0;
    }
    
    public boolean isFull(){
        return this.size()==this.objects.length;
    }
    
    public boolean insert(Object newObject){
        if(this.isFull()) return false;
        this.objects[++this.positionLastElement]=newObject;
        return true;
    }
    
    public boolean remove(){
        if(this.isEmpty()) return false;
        for(int counter=0;counter<this.positionLastElement;counter++){
            this.objects[counter]=this.objects[counter+1];
        }
        this.positionLastElement--;
        return true;
    }
    
    public boolean remove(int position){
        if(this.isEmpty() || position<0 || this.positionLastElement<position) return false;
        for(int counter=position;counter<this.positionLastElement;counter++){
            this.objects[counter]=this.objects[counter+1];
        }
        this.positionLastElement--;
        return true;
    }
    
    public Object peek(){
        if(this.isEmpty()) return null;
        return this.objects[0];
    }
    
    public Object get(int position){
        if(this.isEmpty() || position<0 || this.positionLastElement<position) return null;
        return this.objects[position];
    }
}
