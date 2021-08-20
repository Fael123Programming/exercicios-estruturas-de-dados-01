package ex_3_3_3_data_structure_book;

/**
 * || -> logic OR
 * && -> logic AND
 * @  -> logic NOT
 * Examples:
 *      INFIX       PREFIX      POSTFIX
 * OR   A || B      || A B       A B ||
 * AND  A && B      && A B       A B &&
 * NOT  ------       @ A          A @
 *
 * A set of more complex examples:
 *    @ ( ( A || B ) && C ) <- This is in infix notation
 * -> Prefix:  @ && || A B C
 * -> Postfix: A B || C && @
 *
 *    @ ( ( A || B ) && ( C || D ) ) || @ ( E && F ) <- This is in infix notation
 * -> Prefix:  || @ && || A B || C D @ && E F
 * -> Postfix: A B || C D || && @ E F && @ ||
 */
public class Main {
    public static void main(String[] args) {
        ExpressionConverter expCon = new ExpressionConverter(); //||&&||AB||CD&&EF
        System.out.println( expCon.prefixToPostfixR( "@A" ) );
        System.out.println( expCon.prefixToPostfixR( "@ && || A B C" ) );
        System.out.println( expCon.prefixToPostfixR ( "@ @ && A B" ) );
        System.out.println(expCon.prefixToPostfixR ( "|| @ && || A B || C D @ && E F" ));
    }
}
