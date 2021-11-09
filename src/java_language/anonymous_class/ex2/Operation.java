package java_language.anonymous_class.ex2;

import java.math.BigDecimal;

public interface Operation {
    //As it has only one method, it is called as a functional interface!
    //It can be used implementing a lambda code.
    BigDecimal calculate(BigDecimal n1, BigDecimal n2);
}
