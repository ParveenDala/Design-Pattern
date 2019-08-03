package behavioural.observer;

/******
 * Parveen D
 * Observable Pattern
 */
public class Mobile implements WeatherObserver {
    private WeatherObservable weatherObservable;

    public Mobile(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void onWeatherChanged(float temperature) {
        System.out.println("Mobile, onWeatherChanged " + temperature);
    }
}
