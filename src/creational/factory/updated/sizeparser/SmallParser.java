package creational.factory.updated.sizeparser;

import creational.factory.updated.Parser;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class SmallParser implements Parser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing SMALL File - " + file.getName());
    }
}
