package Observer.Observers;

import Observer.Subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;
//import Observer.Subjects.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float Temperature;
    private float Humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if (obs instanceof WeatherData){
            WeatherData wd = (WeatherData) obs;
            Temperature = wd.GetTemperature();
            Humidity = wd.GetHumidity();
            Display();
        }
    }

    public void Display(){
        System.out.println("Current condition is " + Temperature +
                " celcium degrees and " + Humidity + " % humidity");
    }
}
