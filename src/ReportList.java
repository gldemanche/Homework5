import java.util.GregorianCalendar;
import java.util.LinkedList;

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
     * @param month the given month
     * @param year the given year
     * @return the
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
