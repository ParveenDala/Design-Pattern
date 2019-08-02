package behavioural.strategy.simulation;

/******
 * Parveen D
 * Strategy Pattern
 */
public class ConsoleWriter implements Writer {
    @Override
    public void write(String result) {
        System.out.println(result);
    }
}
