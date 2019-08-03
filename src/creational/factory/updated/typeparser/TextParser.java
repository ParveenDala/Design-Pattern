package creational.factory.updated.typeparser;

import creational.factory.updated.Parser;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class TextParser implements Parser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing TEXT File - " + file.getName());
    }
}
