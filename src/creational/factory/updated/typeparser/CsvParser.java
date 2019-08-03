package creational.factory.updated.typeparser;

import creational.factory.updated.Parser;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class CsvParser implements Parser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing CSV File - " + file.getName());
    }
}
