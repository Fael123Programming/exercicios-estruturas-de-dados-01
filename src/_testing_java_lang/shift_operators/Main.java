package _testing_java_lang.shift_operators;

public class Main {
    public static void main(String[] args) {
        //>>> marks for unsigned right shift operations.
        //>> marks for signed right shift operations.
        //Pattern: [number] [operator] [bitsToMoveRightWard]
        //Ex.: 128 >>> 3 is the same as 128 / 2 ^ 3 = 128 / 8 = 16.
        System.out.println(10 >>> 1); //10 / 2
        System.out.println(-20 >> 1); //-20 / 2
        System.out.println(1000 >>> 3); //1000 / 8 = 125
        System.out.println(128 >>> 3);
        //Let us examine more accurately: 1010(2) which is 10(10).
        //Moving one bit rightward it would become: 101(2) which is 5(10).
        //In Java: 10 >>> 1 (move 1 bit rightward).
        System.out.println(30 << 1); //Left shift operation: instead of divide it multiplies.
        //30 << 1 is equal to 30 * 2 ^ 1 = 30 * 2 = 60.
        //30(10) is 11110(2). Adding a new bit or moving it leftward: 111100(2) which is 60(10).
    }
}
