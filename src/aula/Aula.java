package aula;

public class Aula {
    public static void main(String[] args){
        Calculator ct=new Calculator();
        while(true){    
            ct.getValues();
            ct.calculate("sum");
            ct.calculate("subt");
            ct.calculate("mult");
            ct.calculate("div");
        }
    }
}
