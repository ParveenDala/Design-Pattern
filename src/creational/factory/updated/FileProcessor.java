package creational.factory.updated;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public class FileProcessor {

    public void processFile(ParserMainFactory parserMainFactory, String fileName) {
        File file = new File(fileName);
        System.out.println("Started");
        Parser parser = parserMainFactory.createParser();
        parser.parse(file);
        System.out.println("Done");
    }

}
