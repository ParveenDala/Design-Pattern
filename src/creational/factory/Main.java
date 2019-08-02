package creational.factory;

/******
 * Parveen D
 * Factory Pattern
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "textFile.text";
        FileProcessor.Type parserType = FileProcessor.Type.TEXT;
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
            default:
                return null;
        }
    }
}
