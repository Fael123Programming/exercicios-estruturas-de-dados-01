package ex_problema_de_josephus;
import _simply_linked_list.SimplyLinkedList;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        SimplyLinkedList people=new SimplyLinkedList();
        //Adding people to my list - they're 20.
        people.addEnd(new Person("Rafael","(64) 99123-3456","Rua das Flores","123.546.234-89",1));//1
        people.addEnd(new Person("Ana","(64) 99312-4589","Rua H","905.123.009-11",2));//2
        people.addEnd(new Person("Pedro","(62) 99111-3916","Rua Pablo Coelho","008.375.111-16",3));//3
        people.addEnd(new Person("Mariana","(62) 99210-1500","Av. Joaquim de Castro","444.317.907-00",4));//4
        people.addEnd(new Person("Roberta","(11) 99400-2015","Av. do Comercio","333.601.287-22",5));//5
        people.addEnd(new Person("Pablo","(62) 99321-4300","Rua Pedro Bento","998.184.000-64",6));//6
        people.addEnd(new Person("Jessica","(64) 99211-0011","Rua do Assalto","001.100.876-33",7));//7
        people.addEnd(new Person("Fernando","(61) 99113-7104","Av. Frederico Rico","938.645.432-00",8));//8
        people.addEnd(new Person("Marcos","(64) 99911-2020","Rua dos Nordestinos","007.142.951-98",9));//9
        people.addEnd(new Person("Eduardo","(61) 990101-1010","Rua Feita de Pedras","374.826.501-99",10));//10
        people.addEnd(new Person("Antonieta","(32) 99911-0901","Av. dos Acidentes","059.132.998-01",11));//11
        people.addEnd(new Person("Maicon","(15) 99097-1111","Av. Nacional","111.033.300-99",12));//12
        people.addEnd(new Person("Bruno","(64) 99211-3729","Rua Sem Graça","081.396.300-66",13));//13
        people.addEnd(new Person("Steffani","(44) 89961-1123","Av. do Rafael","098.285.163-07",14));//14
        people.addEnd(new Person("Frederico","(90) 99813-3456","Rua das Fofoqueiras","321.123.111-22",15));//15
        people.addEnd(new Person("Pietro","(63) 99111-0000","Rua Sem Fim","321.814.803-00",16));//16
        people.addEnd(new Person("Marcela","(44) 99098-1213","Rua Com Fim","001.555.444-11",17));//17
        people.addEnd(new Person("Joelson","(64) 99312-4466","Av. dos Aviões","101.567.209-22",18));//18
        people.addEnd(new Person("Cristiano Ronaldo","(13) 89971-2424","Rua do Futebol","999.897.001-16",19));//19
        people.addEnd(new Person("Paulo","(19) 91510-1015","Rua dos Programadores","251.111.945-88",20));//20
        while(people.size()>1){
            people.removePos(Main.generateRandomNumber(0,people.size()-1));
        }
        System.out.println(people.getFirst().getData());
        System.out.printf("Sua lista tem %d elemento.%n",people.size());
        
    }
    
    public static int generateRandomNumber(int firstBound,int secondBound){
        Random rd=new Random();
        return (int) (firstBound+rd.nextDouble()*((secondBound+1)-firstBound));
    }
}
