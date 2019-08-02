package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class CsvParser implements Parser {
    private File file;

    public CsvParser(File file) {
        this.file = file;
    }

    @Override
    public void parse() {
        System.out.println("Parsing CSV File - " + file.getName());
    }
}
