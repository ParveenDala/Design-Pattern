package creational.factory.diff;

/******
 * Parveen D
 * Factory Pattern
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "textFile.csv";
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile(new ParserTypeBasedFactory(), fileName, ParserMainFactory.Type.CSV);
        System.out.println("Done");
    }
}
