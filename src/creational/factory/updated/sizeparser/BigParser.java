package creational.factory.updated.sizeparser;

import creational.factory.updated.Parser;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class BigParser implements Parser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing BIG File - " + file.getName());
    }
}
