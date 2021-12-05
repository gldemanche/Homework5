import java.util.GregorianCalendar;
import java.util.LinkedList;

public class ReportList implements IReport{
    private LinkedList<TodaysWeatherReport> reports;

    public ReportList(){
        this.reports = new LinkedList<>();
    }

    @Override
    public double avergageMonthTemp(int month, int year) {
        double sum = 0;
        int tempCount = 0;

        for(TodaysWeatherReport check : reports){
            if(check.dateCheck(month, year)){
              sum += check.dailyTempAvg();
              tempCount ++;
            }
        }
        return sum/tempCount;
    }

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

        reports.add(new TodaysWeatherReport(date, rainfalls, temps));
    }
}
