import java.io.Serializable;

/**
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
