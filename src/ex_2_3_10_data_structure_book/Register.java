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
    private Stack <String> operands;

    public Register(){ this.operands = new Stack<>(); }

    public String getResult(){
        if( this.operands.isEmpty() ) return null;
        return this.operands.peek();
    }

    public String process( String postfixExp ) {
        this.operands.clear();
        String result = "", op1, op2;
        int counterOfTempVars = 1;
        for ( String perExp : postfixExp.split("") ){ //Z Y * I O + P W / - +
            if ( perExp.equals(" ")) continue;
            if ( this.isOperand( perExp ) ) this.operands.push(perExp);
            else if( this.isOperator( perExp )) {
                op2 = this.operands.pop();
                op1 = this.operands.pop();
                result += "LD " + op1 + "\n";
                switch( perExp ) {
                    case "+":
                        result += "AD " + op2 + "\n";
                        break;
                    case "-":
                        result += "SB " + op2 + "\n";
                        break;
                    case "*":
                        result += "ML " + op2 + "\n";
                        break;
                    case "/":
                        result += "DV " + op2 + "\n";
                        break;
                }
                result += "ST TEMP" + counterOfTempVars + "\n";
                this.operands.push("TEMP" + counterOfTempVars++);
            }
        }
        return result;
    }

    private boolean isOperator(String operator){ return "*/+-".contains(operator);}

    private boolean isOperand( String operand ) { return "abcdefghijklmnopqrstuvxwyz".contains(operand.toLowerCase());}
}
