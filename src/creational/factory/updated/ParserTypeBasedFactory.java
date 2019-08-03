package creational.factory.updated;

import creational.factory.updated.typeparser.CsvParser;
import creational.factory.updated.typeparser.TextParser;
import creational.factory.updated.typeparser.XmlParser;

/******
 * Parveen D
 * Factory Pattern
 */
public class ParserTypeBasedFactory implements ParserMainFactory {
    private Type type;

    public ParserTypeBasedFactory(Type type) {
        this.type = type;
    }

    @Override
    public Parser createParser() {
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
