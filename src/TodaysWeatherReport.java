import java.util.GregorianCalendar;
import java.util.LinkedList;

public class TodaysWeatherReport{
    private GregorianCalendar date;
    private LinkedList<Double> tempReadings;
    private LinkedList<Double> rainfallDay;

    public TodaysWeatherReport(GregorianCalendar date,
                               LinkedList<Double> tempReadings,
                               LinkedList<Double> rainfallDay){
        this.date = date;
        this.tempReadings = tempReadings;
        this.rainfallDay = rainfallDay;
    }


    //This i made ~ not required
    public boolean checkMonth(int month){
        return this.date.get(GregorianCalendar.MONTH) == month;
    }
    //same here
    public boolean checkYear(int year){
        return this.date.get(GregorianCalendar.YEAR) == year;
    }

    public boolean dateCheck(int month, int year){
        return this.checkMonth(month) && this.checkYear(year);
    }

    public double dailyTempAvg(){
        double sum = 0;

        for(double check : this.tempReadings){
            sum += check;
        }

        return sum/this.tempReadings.size();
    }

    public double dailyRainTotal(){
        double sum = 0;

        for(double check : this.rainfallDay){
            sum += check;
        }

        return sum;
    }

}
