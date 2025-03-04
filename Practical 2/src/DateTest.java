public class DateTest {
    public static void main(String[] args) {
        // Actual variables:
        int month = 3;
        int day = 4;
        int year = 2025;

        // Setting my date object:
        Date date = new Date(month, day, year);

        System.out.println("The date is "+date.displayDate());
    }
}
