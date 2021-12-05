public class Reading {
    private Time readingTime;
    private double readingTemp;
    private double readingRainfall;

    public Reading(Time readingTime, double readingTemp, double readingRainfall){
        this.readingTime = readingTime;
        this.readingTemp = readingTemp;
        this.readingRainfall = readingRainfall;
    }

    public double getReadingTemp(){
        return this.readingTemp;
    }

    public double getReadingRainfall(){
        return this.readingRainfall;
    }


}