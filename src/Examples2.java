import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.GregorianCalendar;

public class Examples2 {

    private LinkedList<TodaysWeatherReport> reports = new LinkedList<>();
    private IReport list = new ReportList(reports);
    private WeatherStation station = new WeatherStation(list);

    public Examples2(){


        LinkedList<Double> day1temps = new LinkedList<>();
        LinkedList<Double> day1rain = new LinkedList<>();
        day1temps.add(50.0);
        day1temps.add(50.0);

        day1rain.add(10.0);
        day1rain.add(10.0);

        LinkedList<Double> day2temps = new LinkedList<>();
        LinkedList<Double> day2rain = new LinkedList<>();
        day2temps.add(50.0);
        day2temps.add(50.0);

        day2rain.add(10.0);
        day2rain.add(10.0);


        LinkedList<Double> day3temps = new LinkedList<>();
        LinkedList<Double> day3rain = new LinkedList<>();
        day3temps.add(50.0);
        day3temps.add(50.0);

        day3rain.add(10.0);
        day3rain.add(10.0);

        LinkedList<Double> day4temps = new LinkedList<>();
        LinkedList<Double> day4rain = new LinkedList<>();
        day4temps.add(50.0);
        day4temps.add(50.0);

        day4rain.add(10.0);
        day4rain.add(10.0);

        LinkedList<Double> day5temps = new LinkedList<>();
        LinkedList<Double> day5rain = new LinkedList<>();
        day5temps.add(50.0);
        day5temps.add(50.0);

        day5rain.add(10.0);
        day5rain.add(10.0);


        reports.add(new TodaysWeatherReport(new GregorianCalendar(2021, Calendar.JANUARY,10), day1temps, day1rain));
        reports.add(new TodaysWeatherReport(new GregorianCalendar(2021,Calendar.DECEMBER,11), day2temps, day2rain));
        reports.add(new TodaysWeatherReport(new GregorianCalendar(2021, Calendar.DECEMBER,9), day3temps, day3rain));
        reports.add(new TodaysWeatherReport(new GregorianCalendar(2021, Calendar.JANUARY,4), day4temps, day4rain));
        reports.add(new TodaysWeatherReport(new GregorianCalendar(2021, Calendar.JUNE,4), day5temps, day5rain));
    }

    @Test
    public void validRainfal() {
        assertEquals(station.totalMonthRainfall(0, 2021), 40.0, 0.001);
    }

    @Test
    public void validTemp() {
        assertEquals(station.averageMonthTemp(0, 2021), 50.0, 0.001);
    }
}
