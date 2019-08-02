package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class TextParser implements Parser {
    private File file;

    public TextParser(File file) {
        this.file = file;
    }

    @Override
    public void parse() {
        System.out.println("Parsing Text File - " + file.getName());
    }
}
