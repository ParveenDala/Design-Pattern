package creational.factory.diff;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class FileProcessor {

    public void processFile(ParserMainFactory parserMainFactory, String fileName, ParserMainFactory.Type type) {
        File file = new File(fileName);
        System.out.println("Parsing Started");
        Parser parser = parserMainFactory.createParser(type);
        parser.parse(file);
        System.out.println("Parsing Done");
        System.out.println("Close File");
    }

}
