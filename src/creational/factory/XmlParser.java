package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class XmlParser implements Parser {
    private File file;

    public XmlParser(File file) {
        this.file = file;
    }

    @Override
    public void parse() {
        System.out.println("Parsing XML File - " + file.getName());
    }
}
