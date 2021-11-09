package java_language.lambda;

import java_language.anonymous_class.ex2.Calculator;
import java_language.anonymous_class.ex2.Operation;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.MathContext;

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
                            case "1" -> (Operation) BigDecimal::add;
                            case "2" -> (Operation) BigDecimal::subtract;
                            case "3" -> (Operation) BigDecimal::multiply;
                            case "4" -> (Operation) BigDecimal::divide;
                            case "5" -> (Operation) (a, b) -> a.pow(b.intValue());
                            default -> (Operation) (a, b) -> null;
                            //Using lambda expressions instead of anonymous classes.
                            //Lambdas can be used only with 'functional interfaces': those which
//                            have only one method.
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
