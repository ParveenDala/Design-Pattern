package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class CsvProcessor extends FileProcessor {
    @Override
    public Parser createParser(File file) {
        return new CsvParser(file);
    }
}
