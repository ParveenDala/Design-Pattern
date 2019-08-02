package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class TextProcessor extends FileProcessor {
    @Override
    public Parser createParser(File file) {
        return new TextParser(file);
    }
}
