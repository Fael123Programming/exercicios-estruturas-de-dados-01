package _staticstack;
public class Stack{
    private int[]data;
    private int top;
    
    public Stack(int size){
        this.data=new int[size];
        this.top=-1;
    }
    
    public int getSize(){return this.top+1;}
    
    public int[] getData(){return this.data;}
    
    public boolean isEmpty(){return this.getSize()==0;}
    
    public boolean isFull(){return this.top+1==this.data.length;}
    
    public int top(){
        if(this.isEmpty()) return -1;
        return this.data[this.top];
    }
    
    public boolean push(int number){
        if(this.isFull()) return false;
        this.data[++this.top]=number;
        return true;
    } 
    
    public boolean pop(){
        if(this.isEmpty()) return false;
        this.data[this.top--]=0;
        return true;
    }
    
    public boolean clean(){
        if(this.isEmpty()) return false;
        for(int counter=this.top;counter>=0;counter--) this.data[counter]=0;
        this.top=-1;
        return true;
    }
}
