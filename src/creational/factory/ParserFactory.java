package creational.factory;

public abstract class ParserFactory {

    enum Type {
        TEXT, CSV, XML
    }

    public void parse() {
        System.out.println("Parsing.....");
    }

    public abstract Parser createParser(Type type);

}
