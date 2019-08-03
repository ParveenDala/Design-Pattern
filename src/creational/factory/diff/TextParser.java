package creational.factory.diff;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class TextParser implements Parser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing Text File - " + file.getName());
    }
}
