package Observer.Subjects;

import java.util.Observable;

public class WeatherData extends Observable {
    private float Temperature;
    private float Humidity;
    private float Pressure;

    public WeatherData(){ }

    public void MeasurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void SetMeasurements(float temp, float humidity, float pressure){
        Temperature = temp;
        Humidity = humidity;
        Pressure = pressure;
        MeasurementsChanged();
    }

    public float GetTemperature(){
        return Temperature;
    }

    public float GetHumidity(){
        return Humidity;
    }

    public float GetPressure(){
        return Pressure;
    }
}
