package ex_2_3_10_data_structure_book;

/** The symbols of each operation are:
 * -> + for sum;
 * -> - for subtraction;
 * -> * for multiplication; and
 * -> / for division;
 */

public class Main {
    public static void main(String[] args) {
        Register rg = new Register();
        System.out.println(rg.process("A B C * + D E - /") );
        System.out.println("Then, the result is " + rg.getResult() + "\n");
        System.out.println(rg.process("Z Y * I O + P W / - +") );
        System.out.println("Then, the result is " + rg.getResult() + "\n");
        System.out.println(rg.process("Q W B + *"));
        System.out.println("Then, the result is " + rg.getResult());
    }
}
