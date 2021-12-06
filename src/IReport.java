import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * IReport Interface
 * @author Gabe Demanche and Chris Chow
 */
public interface IReport {

    /**
     * calculates the average monthly temp for a given month and year
     * @param month the given month
     * @param year the given year
     * @return the average temp a double
     */
    double averageMonthTemp(int month, int year);

    /**
     * calculates the monthly rainfall total
     * @param month the given month
     * @param year the given year
     * @return the total a double
     */
    double totalMonthRainfall(int month, int year);


    /**
     * adds a report for a given day
     * @param date the given day
     * @param readings the given list of readings
     */
    void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings);
}
