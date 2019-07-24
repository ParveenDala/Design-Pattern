package creational.singleton;

/*******
 * Parveen D
 * Design-Pattern
 */
class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {
        System.out.println("Instance Created");
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(Singleton::getInstance);
        Thread t2 = new Thread(Singleton::getInstance);
        t1.start();
        t2.start();
    }
}