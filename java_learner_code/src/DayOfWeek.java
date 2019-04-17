import java.time.LocalDate;

public class DayOfWeek {

    public String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString(); //or .name()
    }
}
