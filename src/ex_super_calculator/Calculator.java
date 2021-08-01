package ex_super_calculator;

import java.util.Stack;

public class Calculator {
    public static final int INFIX=1,POSTFIX=2,PREFIX=3;
    //1 - infix; 2 - postfix; 3 - prefix.
    
    private int mode;//Indicates the mode this calculator will lead its expression analysis toward result.
    
    public Calculator(int mode){
        if(mode<1 || mode>3) this.mode=Calculator.INFIX;
        else this.mode=mode;
    }
    
    public Calculator(){
        this.mode=Calculator.INFIX;
        
    }
    
    public int getMode(){return this.mode;}
    
    public void setMode(int newMode){
        if(newMode<Calculator.INFIX || newMode>Calculator.PREFIX) this.mode=Calculator.INFIX;
        else this.mode = newMode;
    }
    
    public double eval(final String str) {
        switch(this.mode){
            case Calculator.INFIX:    
                return new Object() {
                    int pos = -1, ch;

                    void nextChar() {
                        ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                    }

                    boolean eat(int charToEat) {
                        while (ch == ' ') nextChar();
                        if (ch == charToEat) {
                            nextChar();
                            return true;
                        }
                        return false;
                    }

                    double parse() {
                        nextChar();
                        double x = parseExpression();
                        if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                        return x;
                    }

                    // Grammar:
                    // expression = term | expression `+` term | expression `-` term
                    // term = factor | term `*` factor | term `/` factor
                    // factor = `+` factor | `-` factor | `(` expression `)`
                    //        | number | functionName factor | factor `^` factor

                    double parseExpression() {
                        double x = parseTerm();
                        for (;;) {
                            if      (eat('+')) x += parseTerm(); // addition
                            else if (eat('-')) x -= parseTerm(); // subtraction
                            else return x;
                        }
                    }

                    double parseTerm() {
                        double x = parseFactor();
                        for (;;) {
                            if      (eat('*')) x *= parseFactor(); // multiplication
                            else if (eat('/')) x /= parseFactor(); // division
                            else return x;
                        }
                    }

                    double parseFactor() {
                        if (eat('+')) return parseFactor(); // unary plus
                        if (eat('-')) return -parseFactor(); // unary minus

                        double x;
                        int startPos = this.pos;
                        if (eat('(')) { // parentheses
                            x = parseExpression();
                            eat(')');
                        } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                            while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                            x = Double.parseDouble(str.substring(startPos, this.pos));
                        } else if (ch >= 'a' && ch <= 'z') { // functions
                            while (ch >= 'a' && ch <= 'z') nextChar();
                            String func = str.substring(startPos, this.pos);
                            x = parseFactor();
                            switch (func) {
                                case "sqrt":
                                    x = Math.sqrt(x);
                                    break;
                                case "sin":
                                    x = Math.sin(Math.toRadians(x));
                                    break;
                                case "cos":
                                    x = Math.cos(Math.toRadians(x));
                                    break;
                                case "tan":
                                    x = Math.tan(Math.toRadians(x));
                                    break;
                                default:
                                    throw new RuntimeException("Unknown function: " + func);
                            }
                        } else {
                            throw new RuntimeException("Unexpected: " + (char)ch);
                        }

                        if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                        return x;
                    }
                }.parse();
            case Calculator.POSTFIX:
                return 1;
            case Calculator.PREFIX:
                return 1;
            default: return 0;//Unreachable statement due validations done in attribute this.mode.
        }       
    }
    
    public String parseExp(int baseMode,int targetMode,String expression){
        if(baseMode==targetMode || baseMode<Calculator.INFIX || baseMode>Calculator.PREFIX || targetMode<Calculator.INFIX || targetMode>Calculator.PREFIX) return expression;
        switch(baseMode){
            case Calculator.INFIX://infix to another
                switch(targetMode){//to postfix
                    case Calculator.POSTFIX:
                        String postfix = "";
                        expression=this.insertBlankSpacesBetweenTerms(expression);
                        Stack<Integer> stack = new Stack<>();
                        int cont = 0;
                        char c;
                        while(cont < expression.length()){
                            c=expression.charAt(cont);
                            if(this.isOperator(c)){
                                while((!stack.empty()) && this.getPrecedence(c) <= this.getPrecedence((char)((int) stack.peek()))){
                                    postfix += (char)((int)stack.pop());
                                }
                                stack.add((int)c);
                            }else if(c=='('){
                                stack.add((int)c);
                            }else if(c==')'){
                                while((char)((int)stack.peek()) != '(') postfix += (char)((int)stack.pop());
	         		if((char)((int)stack.peek()) == '(') stack.pop();
                            }else{
                                postfix+=expression.charAt(cont);
                            }
                            cont++;
                        }
                        while(!stack.isEmpty()){
                            if((char)((int)stack.peek()) != '(') postfix+=(char)((int)stack.pop());
                            else stack.pop();
                        }
                        return postfix;
                }
        }
        return expression;
    }
    
    private String insertBlankSpacesBetweenTerms(String expression){
        String newExpression=" ";
        char ch;
        for(int counter=0;counter<expression.length();counter++){
            ch=expression.charAt(counter);
            if("()+-*/^".contains(Character.toString(ch))){
                if(newExpression.charAt(newExpression.length()-1)==' ') newExpression+=ch+" ";
                else newExpression+=" "+ch+" ";
            }else newExpression+=ch;
        }
        return newExpression.trim();
    }
    
    private int getPrecedence(char operator){
        switch(operator){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return 0;
        }
    }
   
    private boolean isOperator(char op){
        switch(op){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
            default: return false;
        }
    }
}
