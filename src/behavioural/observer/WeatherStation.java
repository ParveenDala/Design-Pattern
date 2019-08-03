package behavioural.observer;

import java.util.*;

/******
 * Parveen D
 * Observable Pattern
 */
public class WeatherStation implements WeatherObservable {

    private List<WeatherObserver> observers;
    private Random random;
    private Timer timer;
    private WeatherTask weatherTask;

    public WeatherStation() {
        observers = new ArrayList<>();
        random = new Random();
        timer = new Timer();
        weatherTask = new WeatherTask();
        timer.schedule(weatherTask, 5000, 5000);
    }

    @Override
    public void add(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void remove(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        float temperature = (float) (Math.random() * (40 - 30)) + 30f;
        for (WeatherObserver observer : observers) {
            observer.onWeatherChanged(temperature);
        }
    }

    class WeatherTask extends TimerTask {

        @Override
        public void run() {
            notifyObservers();
        }
    }

}
