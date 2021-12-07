import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * Todays Weather Report Class
 * @author Gabe Demanche and Chris Chow
 */
public class TodaysWeatherReport{
    private GregorianCalendar date;
    private LinkedList<Double> tempReadings;
    private LinkedList<Double> rainfallDay;

    public TodaysWeatherReport(GregorianCalendar date,
                               LinkedList<Double> tempReadings,
                               LinkedList<Double> rainfallDay){
        this.date = date;
        this.tempReadings = tempReadings;
        this.rainfallDay = rainfallDay;
    }


    /**
     * Checks to see if the given month is the same of a dates month
     * @param month the given month
     * @return if the month of the given is the same of the month of the date
     */
    public boolean checkMonth(int month){
        return this.date.get(GregorianCalendar.MONTH) == month;
    }

    /**
     * Checks to see if the given year is the same of a dates year
     * @param year the given year
     * @return if the year of the given is the same of the year of the date
     */
    public boolean checkYear(int year){
        return this.date.get(GregorianCalendar.YEAR) == year;
    }

    /**
     * Checks both to see if the given month is the same of a dates month and if the given year is the same as
     * the year of the date
     * @param month the given month
     * @param year the given year
     * @return true if the month & year of the given is the same of the month & year of the date
     */
    public boolean dateCheck(int month, int year){
        return this.checkMonth(month) && this.checkYear(year);
    }

    /**
     * Calculates the daily temperature average
     * @return the sum of the temps stored in the todays report divided by the total number of temp readings
     */
    public double dailyTempAvg(){
        double sum = 0;

        for(double check : this.tempReadings){
            sum += check;
        }

        return sum/this.tempReadings.size();
    }

    /**
     * Calculates the daily rainfall total
     * @return the sum of the rainfalls stored in the todays report
     */
    public double dailyRainTotal(){
        double sum = 0;

        for(double check : this.rainfallDay){
            sum += check;
        }

        return sum;
    }
}
