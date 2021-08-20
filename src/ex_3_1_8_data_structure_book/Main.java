package ex_3_1_8_data_structure_book;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/** 1,1,2,3,5,8,13,21,...
 * Problem: how many summations do we have to calculate to find each fibonacci's sequence number?
 * Consider that: fib(n), wherein 0 <= n <= 10
 * Recursive formula:
 * -> |fib( 0 ) = 1
 * -> |fib( 1 ) = 1
 * -> |fib( n + 1 ) = fib( n ) + fib( n - 1 )
 * -> Direct formula: fib( n ) = ( pow( ( ( 1 + sqrt( 5 ) ) / 2 ), n + 1) - pow( ( ( 1 - sqrt( 5 ) ) / 2 ), n + 1 ) ) / sqrt( 5 )
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println( Main.fibFormula(7));
        System.out.println("----- Using iterator -----");
        for( byte counter = 0 ; counter <= 10 ; counter ++ ) System.out.println("fib( " + counter + " ) = " + Main.fibI( counter ) );
        System.out.println("\n\n");
        System.out.println("----- Using recursivity -----");
        for( byte counter = 0 ; counter <= 10 ; counter ++ ) System.out.println("fib( " + counter + " ) = " + Main.fibR( counter ) );
        System.out.printf("\n\n");
        System.out.println("----- Using formula -----");
        for ( byte counter = 0 ; counter <= 10 ; counter ++) System.out.println("fib( " + counter + " ) = " + Main.fibFormula( counter ));
    }

    private static int fibI( int position ) {
        if( position < 0) return -1;
        if (position == 0 || position == 1) return 1;
        int n1 = 1, n2 = 1, result = 0;
        int counter = 2;
        while ( counter <= position ){
            result = n1 + n2;
            n2 = n1;
            n1 = result;
            counter ++;
        }
        return result;
    }

    private static int fibR( int position ) {
        return position < 0 ? -1 : position == 0 || position == 1 ? 1 : fibR( position - 1 ) + fibR( position - 2 );
    }

    private static int fibFormula( int position ) {
        if( position < 0 ) return -1;
        return (int) (( pow( ( ( 1 + sqrt( 5.0 ) ) / 2 ),  position + 1) - pow( ( ( 1 - sqrt( 5.00 ) ) / 2 ), position + 1 ) ) / sqrt( 5.00 ));
    }
}
