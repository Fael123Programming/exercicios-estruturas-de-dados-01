package ex_2_3_10_data_structure_book;

import java.util.Stack;

/**
 * This class simulates a register operation set. It includes the following operations with a register:
 * -> LD A: to put variable A into register;
 * -> ST A: to put register content into A;
 * -> AD A: to increment register content by A;
 * -> SB A: to decrement register content by A;
 * -> ML A: to multiply register content by A and to assign register with the result of it;
 * -> DV A: to divide register content by A and to assign register with the result of it;
 */
public class Register {
    private final Stack<String> operands;

    public Register() {
        this.operands = new Stack<>();
    }

    public String getResult() {
        if (this.operands.isEmpty()) return null;
        return this.operands.peek();
    }

    public String process(String postfixExp) {
        this.operands.clear();
        StringBuilder result = new StringBuilder();
        String op1, op2;
        int counterOfTempVars = 1;
        for (char perExp : postfixExp.toCharArray()) {
            if (perExp == ' ') continue;
            if (this.isOperand(perExp)) this.operands.push(Character.toString(perExp));
            else if (this.isOperator(perExp)) {
                op2 = this.operands.pop();
                op1 = this.operands.pop();
                result.append("LD ").append(op1).append("\n");
                switch (perExp) {
                    case '+' -> result.append("AD ");
                    case '-' -> result.append("SB ");
                    case '*' -> result.append("ML ");
                    case '/' -> result.append("DV ");
                }
                result.append(op2).append("\n");
                result.append("ST TEMP").append(counterOfTempVars).append("\n");
                this.operands.push("TEMP" + counterOfTempVars++);
            }
        }
        return result.toString();
    }

    private boolean isOperator(char operator) {
        return operator == '*' || operator == '/' || operator == '+' || operator == '-';
    }

    private boolean isOperand(char operand) {
        operand = Character.toLowerCase(operand);
        return operand >= 'a' && operand <= 'z';
    }
}
