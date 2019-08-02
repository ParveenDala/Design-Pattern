package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class XmlProcessor extends FileProcessor {
    @Override
    public Parser createParser(File file) {
        return new XmlParser(file);
    }
}
