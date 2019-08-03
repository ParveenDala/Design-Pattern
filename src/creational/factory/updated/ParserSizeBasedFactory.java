package creational.factory.updated;

import creational.factory.updated.sizeparser.BigParser;
import creational.factory.updated.sizeparser.SmallParser;

/******
 * Parveen D
 * Factory Pattern
 */
public class ParserSizeBasedFactory implements ParserMainFactory {
    private Size size;

    public ParserSizeBasedFactory(Size size) {
        this.size = size;
    }

    @Override
    public Parser createParser() {
        switch (size) {
            case SMALL:
                return new SmallParser();
            case BIG:
                return new BigParser();
            default:
                return null;
        }
    }
}
