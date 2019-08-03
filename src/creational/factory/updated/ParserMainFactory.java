package creational.factory.updated;

/******
 * Parveen D
 * Factory Pattern
 */
public interface ParserMainFactory {
    enum Type {
        TEXT, CSV, XML
    }

    enum Size {
        SMALL, BIG
    }

    Parser createParser();

}
