import java.io.Serializable;

/**
 * Copy of {@link singletons.SingletonField} class with field variables
 * for demonstration purposes.
 *
 * @author Dulaj Atapattu
 */
public class Singleton implements Serializable{

    public static final Singleton INSTANCE = new Singleton();

    private int value = 0;

    private Singleton() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
