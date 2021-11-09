package java_language.anonymous_class.ex2;

import java.math.BigDecimal;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public BigDecimal calculate(BigDecimal n1, BigDecimal n2) {
        return this.operation.calculate(n1, n2);
    }
}
