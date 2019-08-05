package behavioural.observer;

/******
 * Parveen D
 * Observable Pattern
 */
public class Main {
    public static void main(String[] args) {
        WeatherObservable weatherStation2 = new WeatherStation();
        weatherStation.add(new Mobile(weatherStation));
        weatherStation.add(new Tv(weatherStation));
    }
}
