/**
 * Reading Class
 * @author Gabe Demanche and Chris Cow
 */
public class Reading {
    private Time readingTime;
    private double readingTemp;
    private double readingRainfall;

    public Reading(Time readingTime, double readingTemp, double readingRainfall){
        this.readingTime = readingTime;
        this.readingTemp = readingTemp;
        this.readingRainfall = readingRainfall;
    }

    /**
     * Getter for the temperature data within the reading
     * @return the reading temperature data
     */
    public double getReadingTemp(){
        return this.readingTemp;
    }

    /**
     * Getter for the rainfall data within the reading
     * @return the reading rainfall data
     */
    public double getReadingRainfall(){
        return this.readingRainfall;
    }
}