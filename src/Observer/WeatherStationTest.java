package Observer;

import Observer.Observers.CurrentConditionsDisplay;
import Observer.Subjects.WeatherData;

public class WeatherStationTest {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new
                CurrentConditionsDisplay(weatherData);
        weatherData.SetMeasurements(14, 80, 30.4f);
        weatherData.SetMeasurements(10, 65, 22.2f);
        weatherData.SetMeasurements(4, 80, 33.2f);
    }
}
