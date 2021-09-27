package _varargs;

public class VarArgsProgram {
    public static void main(String... args) {
        System.out.println("I'll show you below what you passed to this main method");
        System.out.print("[");
        for (String str : args) {
            if (str.equals(args[args.length - 1])) System.out.print(str);
            else System.out.print(str + ",");
        }
        System.out.println("]");
    }
}
