import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples3 {
    private LinkedList<Double> rainAndTemp = new LinkedList<>();
    private GregorianCalendar jan20 = new GregorianCalendar(2020, Calendar.JANUARY, 12);
    private LinkedList<Double> rainTotal30 = new LinkedList<Double>();
    private LinkedList<Double> tempAverage50 = new LinkedList<Double>();

    public Examples3(){
        rainTotal30.add(10.0);
        rainTotal30.add(0.0);
        rainTotal30.add(20.0);

        tempAverage50.add(50.0);
        tempAverage50.add(0.0);
        tempAverage50.add(100.0);
    }

    //tests daily rainfall average
    @Test
    public void avg50Test(){
        TodaysWeatherReport avg50 = new TodaysWeatherReport(jan20, tempAverage50, rainTotal30);

        assertEquals(avg50.dailyTempAvg(), 50.0, .001);
    }

    //tests daily rainfall average
    @Test
    public void total10Test(){
        TodaysWeatherReport avg10 = new TodaysWeatherReport(jan20, tempAverage50, rainTotal30);

        assertEquals(avg10.dailyRainTotal(), 30.0, .001);
    }

    //checks when no temp data
    @Test
    public void avg0Test(){
        TodaysWeatherReport avg50 = new TodaysWeatherReport(jan20, rainAndTemp, rainAndTemp);

        assertEquals(avg50.dailyTempAvg(), 0.0, .001);
    }

    //checks when no rainfall data
    @Test
    public void total0Test(){
        TodaysWeatherReport avg10 = new TodaysWeatherReport(jan20, tempAverage50, rainAndTemp);

        assertEquals(avg10.dailyRainTotal(), 0.0, .001);
    }

    //checks the month when the month matches
    @Test
    public void validMonth(){
        TodaysWeatherReport dateReport = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertTrue(dateReport.checkMonth(0));
    }

    //checks the month with a month that does not match
    @Test
    public void invalidMonth(){
        TodaysWeatherReport dateReport2 = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertFalse(dateReport2.checkMonth(10));
    }

    //checks the year when the year matches
    @Test
    public void validYear(){
        TodaysWeatherReport dateReport = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertTrue(dateReport.checkYear(2020));
    }

    //checks the year with a year that does not match
    @Test
    public void invalidYear(){
        TodaysWeatherReport dateReport2 = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertFalse(dateReport2.checkYear(2010));
    }

    //checks when the year and month match the expected
    @Test
    public void validDate(){
        TodaysWeatherReport dateReport3 = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertTrue(dateReport3.dateCheck(0,2020));
    }

    @Test
    //checks when the year and month do not match the expected
    public void invalidDate(){
        TodaysWeatherReport dateReport3 = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertFalse(dateReport3.dateCheck(10,1999));
    }

}
