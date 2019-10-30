package Observer.Subjects;

import Observer.Observers.Observer;

public interface Subject {
    void RegisterObserver(Observer o);
    void RemoveObserver(Observer o);
    void NotifyObservers();
}
