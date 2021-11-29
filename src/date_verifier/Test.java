package date_verifier;

public class Test {
    public static void main(String[] args) {
        System.out.println(DateChecker.isDateValid(12,31,2021));
        System.out.println(DateChecker.isDateValid(2,29,2029));
        System.out.println(DateChecker.isDateValid(6,11,2021));
    }
}
