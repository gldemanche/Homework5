import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * Weather Station Class
 * @author Gabe Demache and Chris Chow
 */
public class WeatherStation {

    private IReport report;

    public WeatherStation(IReport report){
        this.report = report;
    }


    /**
     * Calculates the average monthly temperature for a given month and year
     * @param month the given month
     * @param year the given year
     * @return the average monthly temp a double
     */
    public double averageMonthTemp(int month, int year){
        double tempavg = report.averageMonthTemp(month, year);
        return tempavg;
    }


    /**
     * Calculates the total monthly rainfall for a given month and year
     * @param month the given month
     * @param year the given year
     * @return the total monthly rainfall a double
     */
    public double totalMonthRainfall(int month, int year){
        double rainTotal = report.totalMonthRainfall(month, year);
        return rainTotal;
    }

    /**
     * adds todays report to the weather station
     * @param date the given date
     * @param readings a list of readings from a weather sensor
     */
    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> readings){
        report.addDailyReport(date, readings);
    }
}