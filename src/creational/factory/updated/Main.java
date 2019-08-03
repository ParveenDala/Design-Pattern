package creational.factory.updated;

/******
 * Parveen D
 * Factory Pattern
 */
public class Main {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileProcessor();

        //Using TypeBasedParser Factory - CSV Parser
        String fileName = "csvFile.csv";
        fileProcessor.processFile(new ParserTypeBasedFactory(ParserMainFactory.Type.CSV), fileName);

        System.out.println();

        //Using TypeBasedParser Factory - TXT Parser
        fileName = "textFile.txt";
        fileProcessor.processFile(new ParserTypeBasedFactory(ParserMainFactory.Type.TEXT), fileName);

        System.out.println();

        //Using SizeBasedParser Factory - Small File Parser
        fileName = "smallFile.txt";
        fileProcessor.processFile(new ParserSizeBasedFactory(ParserMainFactory.Size.SMALL), fileName);

        System.out.println();

        //Using SizeBasedParser Factory - Big File Parser
        fileName = "bigFile.txt";
        fileProcessor.processFile(new ParserSizeBasedFactory(ParserMainFactory.Size.BIG), fileName);

    }
}
