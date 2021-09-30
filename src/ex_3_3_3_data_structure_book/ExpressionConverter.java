package ex_3_3_3_data_structure_book;

public class ExpressionConverter {
    public String prefixToPostfixR(String expression) {
        if (expression.contains(" ")) expression = expression.replaceAll(" ", "");
        String opnd1, opnd2, post1, post2, temp;
        int length, m, n;
        String op;
        if ((length = expression.length()) == 1) {
            if (Character.isLetter(expression.charAt(0))) return expression;
            return "Unique character is invalid";
        }
        if (expression.charAt(0) == '@') {
            op = this.substr(expression, 0, 1);
            //temp = this.substr ( expression , 1 , length - 1 );
            m = length - 1; //Size of the unique operand of NOT
            if (m == 0) return "Your expression has invalid elements";
            opnd1 = this.substr(expression, 1, m);
            post1 = this.prefixToPostfixR(opnd1);
            post1 += op;
        } else {
            op = this.substr(expression, 0, 2); //Operator comes first in a prefix expression
            temp = this.substr(expression, 2, length - 2);
            m = this.find(temp);
            temp = this.substr(expression, m + 2, length - m - 2);
            n = this.find(temp);
            if (!this.isOperator(op) || (m == 0) || (n == 0) || (m + n + 2 != length))
                return "Your expression has invalid elements";
            opnd1 = this.substr(expression, 2, m);
            opnd2 = this.substr(expression, m + 2, n);
            post1 = this.prefixToPostfixR(opnd1);
            post2 = this.prefixToPostfixR(opnd2);
            post1 += post2 + op;
        }
        return post1;
    }

    public boolean isOperator(String str) {
        return "&&||@".contains(str);
    }

    public boolean isOperand(String str) {
        return "abcdefghijklmnopqrstuvwxyz".contains(str.toLowerCase());
    }

    public String substr(String str, int beginIndex, int characters) {
        String toReturn = "";
        for (int counter = 0, begin = beginIndex; counter < characters; counter++, begin++) {
            toReturn += str.split("")[begin];
        }
        return toReturn;
    }

    public int find(String expression) {
        String temp;
        int length, m, n;
        if ((length = expression.length()) == 0) return 0;
        if (Character.isLetter(expression.charAt(0))) return 1;
        if (expression.length() < 2) return 0;
        if (expression.charAt(0) == '@') {
            temp = this.substr(expression, 1, length - 1);
            m = this.find(temp);
            if (m == 0 || expression.length() == m) return 0;
            return m + 1;
        }
        temp = this.substr(expression, 2, length - 2);
        m = this.find(temp);
        if (m == 0 || expression.length() == m) return 0;
        temp = this.substr(expression, m + 2, length - m - 2);
        n = this.find(temp);
        if (n == 0) return 0;
        return m + n + 2;
    }
}
