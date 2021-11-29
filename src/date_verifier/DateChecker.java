package date_verifier;

public class DateChecker {
    public static boolean isDateValid(int month, int day, int year) {
        if (month <= 0 || day <= 0 || year <= 0)
            return false;
        int daysOfMonth = switch(month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> year % 4 == 0 ? 29 : 28; //Leap year: february has 29 days.
            default -> 31;
        };
        return day <= daysOfMonth; //day must be between 0 and the true quantity of days of the month being referred to.
    }
}
