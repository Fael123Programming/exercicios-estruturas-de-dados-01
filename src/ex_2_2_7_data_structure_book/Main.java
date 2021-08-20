package ex_2_2_7_data_structure_book;

public class Main {
    public static void main(String[] args) {
        DoubleStack ds = new DoubleStack(20);

        for(byte counter = 1; counter <= ds.getVector().length / 2; counter++){
            ds.push1(counter);
            ds.push2(counter);
        }
        //ds.cleanAll();
        ds.clean1();
        Main.showVector(ds.getVector());
        System.out.println("Size stack 1: " + ds.size1());
        System.out.println("Size stack 2: " + ds.size2());
        System.out.printf("Total size: " + ds.totalSize());
    }

    private static void showVector(int[] vector){
        if(vector == null) System.out.println("Can't iterate over null");
        else for(int data:vector) System.out.println("-> " + data);
    }
}
