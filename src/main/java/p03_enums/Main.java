package p03_enums;// 08-21-2026
// Just a simple test of enumerations, override method on constructors and abstract method.
import p03_enums.domain.Days;

public class Main {
    public static void main(String[] args) {
        Days day1 = Days.SUNDAY;
        Days day2 = Days.MONDAY;
        Days day3 = Days.TUESDAY;
        Days day4 = Days.WEDNESDAY;
        Days day5 = Days.THURSDAY;
        Days day6 = Days.FRIDAY;
        Days day7 = Days.SATURDAY;
        System.out.println(day1.IsWeekendMessage());
        System.out.println(day2.IsWeekendMessage());
        System.out.println(day3.IsWeekendMessage());
        System.out.println(day4.IsWeekendMessage());
        System.out.println(day5.IsWeekendMessage());
        System.out.println(day6.IsWeekendMessage());
        System.out.println(day7.IsWeekendMessage());
    }
}
