package creational.factory;

import java.io.File;

/******
 * Parveen D
 * Factory Pattern
 */
public abstract class FileProcessor {

    enum Type {
        TEXT, CSV, XML
    }

    public void processFile(String fileName) {
        File file = new File(fileName);
        System.out.println("Parsing Started");
        Parser parser = createParser(file);
        parser.parse();
        System.out.println("Parsing Done");
        System.out.println("Close File");
    }

    protected abstract Parser createParser(File file);

}
