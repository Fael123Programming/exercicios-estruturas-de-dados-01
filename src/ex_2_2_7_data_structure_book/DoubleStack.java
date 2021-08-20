package ex_2_2_7_data_structure_book;

public class DoubleStack {
    private int []vector;
    private int size1,size2; //Size of each stack we'll construct inside our vector
    private int stack2NextPos; //It marks the next free position in the second stack. See that the second stack begins at the end of our vector.

    public DoubleStack(){
        this.vector = new int[10];
        this.size1 = 0;
        this.size2 = 0;
        this.stack2NextPos = 9;
    }

    public DoubleStack(int size){
        if(size <= 0) size = 10;
        this.vector = new int[size];
        this.size1 = 0;
        this.size2 = 0;
        this.stack2NextPos = size - 1; //First position of the second stack is the last position of the vector.
    }

    public int size1(){return this.size1;}

    public int size2(){return this.size2;}

    public int totalSize(){return this.size1 + this.size2;}

    public boolean isEmpty1(){return this.size1 == 0;}

    public boolean isEmpty2(){return this.size2 == 0;}

    public boolean isAllEmpty(){return this.isEmpty1() && this.isEmpty2();}

    public boolean isFull1(){return this.size1 == this.vector.length / 2;}

    public boolean isFull2(){return this.size2 == this.vector.length / 2;}

    public boolean isAllFull(){return this.isFull1() && this.isFull2();}

    //Push operations
    public boolean push1(int data){
        if(this.isFull1()) return false;
        this.vector[this.size1++] = data;
        return true;
    }

    public boolean push2(int data){
        if(this.isFull2()) return false;
        this.vector[this.stack2NextPos--] = data;
        this.size2++;
        return true;
    }

    //Pop operations
    public boolean pop1(){
        if(this.isEmpty1()) return false;
        this.vector[--this.size1] = 0;
        return true;
    }

    public boolean pop2(){
        if(this.isEmpty2()) return false;
        this.vector[++this.stack2NextPos] = 0;
        this.size2--;
        return true;
    }

    //Clean operations
    public boolean clean1(){
        if(this.isEmpty1()) return false;
        while(!this.isEmpty1()) this.pop1();
        return true;
    }

    public boolean clean2(){
        if(this.isEmpty2()) return false;
        while(!this.isEmpty2()) this.pop2();
        return true;
    }

    public boolean cleanAll(){
        if(this.isEmpty1() && this.isEmpty2()) return false;
        while(!this.isEmpty1() || !this.isEmpty2()){
            if(!this.isEmpty1()) this.pop1();
            if(!this.isEmpty2()) this.pop2();
        }
        return true;
    }

    //To get our vector
    public int[] getVector(){return this.vector;}
}
