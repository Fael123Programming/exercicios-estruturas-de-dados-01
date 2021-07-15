package _dynamicqueue;
import java.util.List;
import java.util.ArrayList;
public class DynamicQueue{
    private List<Object> objects=new ArrayList<>();
    
    public List getObjects(){
        return this.objects;
    }
    
    public int size(){
        return this.objects.size();
    }
    
    public boolean isEmpty(){
        return this.objects.isEmpty();
    }
    
    public void insert(Object newObject){
        this.objects.add(newObject);
    }
    
    public boolean remove(){
        if(this.isEmpty()) return false;
        this.objects.remove(0);
        return true;
    }
    
    /* Queues doesn't have a method that removes an element from a different position than the first.
    public boolean remove(int position){
        if(this.isEmpty() || position<0 || this.size()-1<position) return false;
        this.objects.remove(position);
        return true;
    }*/
    
    public Object peek(){
        if(this.isEmpty()) return null;
        return this.objects.get(0);
    }
    
    public Object get(int position){
        if(this.isEmpty()||position<0||this.size()-1<position) return null;
        return this.objects.get(position);
    }
}
