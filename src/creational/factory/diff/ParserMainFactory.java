package creational.factory.diff;

/******
 * Parveen D
 * Factory Pattern
 */
public interface ParserMainFactory {
    enum Type {
        TEXT, CSV, XML
    }

    Parser createParser(Type type);
}
