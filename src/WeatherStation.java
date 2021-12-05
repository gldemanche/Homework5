import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation {

    IReport report;

    public WeatherStation(IReport report){
        this.report = report;
    }

    public double avergageMonthTemp(int month, int year){
        return 0.0;
    }

    public double totalMonthRainfall(int month, int year){
        return 0.0;
    }

    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> readings){
    }
}
