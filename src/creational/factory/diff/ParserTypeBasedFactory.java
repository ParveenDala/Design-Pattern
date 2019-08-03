package creational.factory.diff;

/******
 * Parveen D
 * Factory Pattern
 */
public class ParserTypeBasedFactory implements ParserMainFactory {

    @Override
    public Parser createParser(Type type) {
        switch (type) {
            case CSV:
                return new CsvParser();
            case TEXT:
                return new TextParser();
            case XML:
                return new XmlParser();
            default:
                return null;
        }
    }
}
