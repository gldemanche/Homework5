import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples3 {
    private LinkedList<Double> rainAndTemp = new LinkedList<>();
    private GregorianCalendar jan20 = new GregorianCalendar(2020, Calendar.JANUARY, 12);

    public Examples3(){
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
    public void validDate(){
        TodaysWeatherReport dateReport3 = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertTrue(dateReport3.dateCheck(0,2020));
    }

    //checks when the year and month do not match the expected
    public void invalidDate(){
        TodaysWeatherReport dateReport3 = new TodaysWeatherReport(jan20, rainAndTemp,rainAndTemp);

        assertTrue(dateReport3.dateCheck(10,1999));
    }

}
