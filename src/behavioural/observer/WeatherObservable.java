package behavioural.observer;

/******
 * Parveen D
 * Observable Pattern
 */
public interface WeatherObservable {
    void add(WeatherObserver weatherObserver);

    void remove(WeatherObserver weatherObserver);

    void notifyObservers();
}
