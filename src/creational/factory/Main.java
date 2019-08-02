package creational.factory;

/******
 * Parveen D
 * Factory Pattern
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "textFile.xml";
        FileProcessor.Type parserType = FileProcessor.Type.XML;
        FileProcessor fileProcessor = getFileProcessor(parserType);
        fileProcessor.processFile(fileName);
        System.out.println("Done");
    }

    private static FileProcessor getFileProcessor(FileProcessor.Type type) {
        switch (type) {
            case CSV:
                return new CsvProcessor();
            case TEXT:
                return new TextProcessor();
            case XML:
                return new XmlProcessor();
            default:
                return null;
        }
    }
}
