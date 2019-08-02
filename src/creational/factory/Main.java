package creational.factory;

/******
 * Parveen D
 * Factory Pattern
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "textFile.csv";
        FileProcessor.Type parserType = FileProcessor.Type.CSV;
        FileProcessor fileProcessor = getFileProcessor(parserType);
        fileProcessor.processFile(fileName);
        System.out.println("Done");
    }

    private static FileProcessor getFileProcessor(FileProcessor.Type type) {
        switch (type) {
            case CSV:
                return new CsvProcessor();
            default:
                return null;
        }
    }
}
