package behavioural.strategy.simulation;

/******
 * Parveen D
 * Strategy Pattern
 */
public class FileWriter implements Writer {
    @Override
    public void write(String result) {
        System.out.println("File writer - " + result);
    }
}
