import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IReport {
    double averageMonthTemp(int month, int year);

    double totalMonthRainfall(int month, int year);

    void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings);
}
