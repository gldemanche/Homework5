import java.util.GregorianCalendar;
import java.util.LinkedList;

public class TodaysWeatherReport implements IReport{
    GregorianCalendar date;
    LinkedList<Double> tempReadings;
    LinkedList<Double> rainfallDay;

    public TodaysWeatherReport(GregorianCalendar date,
                               LinkedList<Double> tempReadings,
                               LinkedList<Double> rainfallDay){
        this.date = date;
        this.tempReadings = tempReadings;
        this.rainfallDay = rainfallDay;
    }


    //This i made ~ not required
    public boolean checkMonth(int month){
        return this.date.get(month) == month;
    }
    //same here
    public boolean checkYear(int year){
        return this.date.get(year) == year;
    }
}
