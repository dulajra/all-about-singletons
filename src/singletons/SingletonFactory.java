package singletons;

/**
 * Singleton with static factory method.
 * Not safe with deserialization.
 *
 * @author Dulaj Atapattu
 */
public class SingletonFactory {

    private static final SingletonFactory INSTANCE = new SingletonFactory();

    private SingletonFactory() {
    }

    public static SingletonFactory getInstance() {
        return INSTANCE;
    }

}