import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {

    public Examples(){}

    //Times
    //Morning
    private Time morning = new Time(7, 30);
    //Afternoon
    private Time afternoon = new Time(1,30);
    //Night
    private Time night = new Time(9, 30);

    //Readings
    private Reading newReadingMorning1 = new Reading(morning, 30, 10);
    private Reading newReadingAfternoon1 = new Reading(afternoon, 50, 8);
    private Reading newReadingNight1 = new Reading(night, 32, 0);

    private Reading newReadingMorning2 = new Reading(morning, 20, 20);
    private Reading newReadingAfternoon2 = new Reading(afternoon, 40, 0);
    private Reading newReadingNight2 = new Reading(night, 26, 10);

    //Dates
    private GregorianCalendar day1 = new GregorianCalendar(2021, 11,6);
    private GregorianCalendar day2 = new GregorianCalendar(2021, 11,7);
    GregorianCalendar day3 = new GregorianCalendar(2022, 0,8);
    GregorianCalendar day4 = new GregorianCalendar(2022, 0,9);

    //Temp Readings
    LinkedList<Double> tempReadings1 = new LinkedList<>();

    //Rainfall Readings
    LinkedList<Double> rainfallReadings1 = new LinkedList<>();

    //WeatherReports
    TodaysWeatherReport newWeatherReport1 = new TodaysWeatherReport(day1, tempReadings1, rainfallReadings1);

    //Readings
    LinkedList<Reading> newReading1 = new LinkedList<>();
    LinkedList<Reading> newReading2 = new LinkedList<>();

    //Report
    ReportList newReportList1 = new ReportList();

    //Weather Station
    WeatherStation newWeatherStation1 = new WeatherStation(newReportList1);

    @Before
    public void setUp(){
        tempReadings1.add(newReadingMorning1.getReadingTemp());
        tempReadings1.add(newReadingAfternoon1.getReadingTemp());
        tempReadings1.add(newReadingNight1.getReadingTemp());

        rainfallReadings1.add(newReadingMorning1.getReadingRainfall());
        rainfallReadings1.add(newReadingAfternoon1.getReadingRainfall());
        rainfallReadings1.add(newReadingNight1.getReadingRainfall());

        newReading1.add(newReadingMorning1);
        newReading1.add(newReadingAfternoon1);
        newReading1.add(newReadingNight1);

        newReading2.add(newReadingMorning2);
        newReading2.add(newReadingAfternoon2);
        newReading2.add(newReadingNight2);

        newReportList1.addDailyReport(day1, newReading1);
        newReportList1.addDailyReport(day2, newReading2);

    }

    //test average month temp
    @Test
    public void validAvgTemp () {
        assertEquals(newWeatherStation1.averageMonthTemp(11, 2021), 33.0, 0.001);
    }

    //tests monthly rainfall
    @Test
    public void validMonthlyRainfall() {
        assertEquals(newWeatherStation1.totalMonthRainfall(11,2021), 48.0, 0.001);
    }

    /*
    //tests addTodaysReport
    @Test
    public void validAddReport(){
        assertEquals();
    }

     */




}


