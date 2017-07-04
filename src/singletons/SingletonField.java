package singletons;

/**
 * Singleton with public static final field.
 * Not safe with deserialization.
 *
 * @author Dulaj Atapattu
 */
public class SingletonField {

    public static final SingletonField INSTANCE = new SingletonField();

    private SingletonField() {
    }

}