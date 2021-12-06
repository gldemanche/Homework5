import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * ReportList Class
 * @author Gabe Demanche and Chris Chow
 */
public class ReportList implements IReport{
    private LinkedList<TodaysWeatherReport> reports;

    public ReportList(LinkedList<TodaysWeatherReport> reports){
        this.reports = reports;
    }

    public ReportList(){
        this.reports = new LinkedList<>();
    }

    /**
     * calculates the average monthly temp for a given month and year
     * @param month the given month
     * @param year  the given year
     * @return the monthly temp average by summing all the given daily temp averages and dividing by the number of
     * daily temp averages
     */
    @Override
    public double averageMonthTemp(int month, int year) {
        double sum = 0;
        double tempCount = 0;

        for(TodaysWeatherReport check : reports){
            if(check.dateCheck(month, year)){
              sum = sum + check.dailyTempAvg();
              tempCount ++;
            }
        }

        return sum/tempCount;
    }


    /**
     * calculates the monthly rainfall total for a given month and year
     * @param month the given month
     * @param year the given year
     * @return the total rainfall for the month by summing all the daily totals for the given month and year
     */
    @Override
    public double totalMonthRainfall(int month, int year) {
        double sum = 0;

        for(TodaysWeatherReport check : reports){
            if(check.dateCheck(month, year)){
                sum += check.dailyRainTotal();
            }
        }
        return sum;
    }

    /**
     * Adds a report to the list of today weather reports from a given date and list of readings
     * @param date     the given day
     * @param readings the given list of readings
     */
    @Override
    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
        LinkedList<Double> rainfalls = new LinkedList<>();
        LinkedList<Double> temps = new LinkedList<>();

        for(Reading check : readings){
            rainfalls.add(check.getReadingRainfall());
            temps.add(check.getReadingTemp());
        }

        reports.add(new TodaysWeatherReport(date, temps, rainfalls));
    }
}
