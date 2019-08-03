package creational.factory.updated.typeparser;

import creational.factory.updated.Parser;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class XmlParser implements Parser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing XML File - " + file.getName());
    }
}
