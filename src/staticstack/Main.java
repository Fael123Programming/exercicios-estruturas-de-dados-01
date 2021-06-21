package staticstack;
public class Main {
    public static void main(String[] args){
        Stack stackOfNumbers=new Stack(2);
        Main.showStackData(stackOfNumbers);//Shows nothing
        System.out.println(stackOfNumbers.getSize());
        stackOfNumbers.push(0);
        stackOfNumbers.push(123);
        stackOfNumbers.push(799);//Not added due limit size declared above
        Main.showStackData(stackOfNumbers);
        stackOfNumbers.pop();
        stackOfNumbers.pop();
        Main.showStackData(stackOfNumbers);//Shows nothing
        System.out.println(stackOfNumbers.top());
        stackOfNumbers.push(0);
        stackOfNumbers.push(1);
        System.out.println(stackOfNumbers.isFull());
        Main.showStackData(stackOfNumbers);
        stackOfNumbers.clean();
        Main.showStackData(stackOfNumbers);//Shows nothing
        System.out.println(stackOfNumbers.isEmpty());
    }
    
    public static void showStackData(Stack st){
        for(int counter=st.getSize()-1;counter>=0;counter--){
            System.out.println((counter+1)+"º elemento: "+st.getData()[counter]);
        }
    }
}
