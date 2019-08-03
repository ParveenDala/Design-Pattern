package behavioural.observer;

/******
 * Parveen D
 * Observable Pattern
 */
public class Tv implements WeatherObserver {
    private WeatherObservable weatherObservable;

    public Tv(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void onWeatherChanged(float temperature) {
        System.out.println("Tv, onWeatherChanged " + temperature);
    }
}
