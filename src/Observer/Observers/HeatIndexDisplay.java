package Observer.Observers;

import Observer.Subjects.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float HeatIndex;
    private Subject currentSubj;

    public HeatIndexDisplay(Subject subject){
        currentSubj = subject;
        subject.RegisterObserver(this);
    }

    public void Update(float temp, float humidity, float pressure){
        HeatIndex = (temp + humidity) / 2;
        Display();
    }

    public void Display(){
        System.out.println("Current heat index: " + HeatIndex);
    }
}
