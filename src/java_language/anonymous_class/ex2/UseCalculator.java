package java_language.anonymous_class.ex2;

import java.math.*;
import javax.swing.JOptionPane;

public class UseCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String option, n1, n2;
        BigDecimal number1, number2;
        while (true) {
            option = JOptionPane.showInputDialog("""
                    --------------------------------------------------------------
                                               Calculator
                    --------------------------------------------------------------
                    (1) Sum
                    (2) Sub
                    (3) Mult
                    (4) Div
                    (5) Pow
                    (0) Exit
                    --------------------------------------------------------------
                    Your choice""");
            switch (option) {
                case "1", "2", "3", "4", "5" -> {
                    try {
                        n1 = JOptionPane.showInputDialog("""
                                --------------------------------------------------------------
                                                             Operand 1
                                --------------------------------------------------------------
                                """);
                        number1 = new BigDecimal(n1);
                        n2 = JOptionPane.showInputDialog("""
                                --------------------------------------------------------------
                                                             Operand 2
                                --------------------------------------------------------------
                                """);
                        number2 = new BigDecimal(n2);
                        calculator.setOperation(switch(option) {
                            case "1" -> new Operation(){
                               public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
                                   return n1.add(n2);
                               }
                            };
                            case "2" -> new Operation(){
                                public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
                                    return n1.subtract(n2);
                                }
                            };
                            case "3" -> new Operation(){
                                public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
                                    return n1.multiply(n2);
                                }
                            };
                            case "4" -> new Operation(){
                                public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
                                    return n1.divide(n2, new MathContext(3));
                                }
                            };
                            case "5" -> new Operation(){ //Anonymous class!
                                public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
                                    return n1.pow(n2.intValue());
                                }
                            };
                            default -> new Operation(){
                                public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
                                    return null;
                                }
                            };
                            //A class is created, it implements the interface Operation, and it is instantiated...
                            //All of this, at the same time!
                        });
                        //A switch statement can return values.
                        //In this case, it returns an Operation anonymous class.
                        JOptionPane.showMessageDialog(null, """
                                --------------------------------------------------------------
                                                            Result
                                --------------------------------------------------------------
                                """ + calculator.calculate(number1, number2));
                    } catch (NumberFormatException exc) {
                        JOptionPane.showMessageDialog(null,"""
                                --------------------------------------------------------------
                                                        Invalid Number
                                --------------------------------------------------------------
                                """);
                    }
                }
                case "0" -> { return; }
                default -> {
                    JOptionPane.showMessageDialog(null,"""
                                --------------------------------------------------------------
                                                        Invalid Option
                                --------------------------------------------------------------
                                """);
                }
            }
        }
    }
}
