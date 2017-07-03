package singletons;

/**
 * @author Dulaj Atapattu
 */
public class SingletonField {

    public static final SingletonField INSTANCE = new SingletonField();

    private SingletonField() {
    }

}