import entities.enums.Day;

public class SwitchExample {

    public static void main(String[] args) {

        for (Day day : Day.values()) {
            int dayNumber = whatDayNumberIsToday(day);
            System.out.println("I print number of day = " + dayNumber);
            whatDayIsToday(day);
        }
    }

    public static int whatDayNumberIsToday(Day day) {
        int dayNumber = switch (day) {
            case MONDAY -> {
                System.out.println("Today is a 1st day of week");
                yield 1;
            }
            case TUESDAY -> {
                System.out.println("Today is a 2nd day of week");
                yield 2;
            }
            case WEDNESDAY -> {
                System.out.println("Today is a 3rd day of week");
                yield 3;
            }
            case THURSDAY -> {
                System.out.println("Today is a 4th day of week");
                yield 4;
            }
            case FRIDAY -> {
                System.out.println("Today is a 5th day of week");
                yield 5;
            }
            case SATURDAY -> {
                System.out.println("Today is a 6th day of week");
                yield 6;
            }
            case SUNDAY -> {
                System.out.println("Today is a 7th day of week");
                yield 7;
            }
        };
        return dayNumber;
    }

    public static void whatDayIsToday(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("Today is a working day");
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("Today is a weekend");
            }
        }
    }
}
