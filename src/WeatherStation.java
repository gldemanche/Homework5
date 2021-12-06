import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation {

    private IReport report;

    public WeatherStation(IReport report){
        this.report = report;
    }

    public double averageMonthTemp(int month, int year){
        double tempavg = report.averageMonthTemp(month, year);
        return tempavg;
    }

    public double totalMonthRainfall(int month, int year){
        double rainTotal = report.totalMonthRainfall(month, year);
        return rainTotal;
    }

    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> readings){
        report.addDailyReport(date, readings);
    }
}