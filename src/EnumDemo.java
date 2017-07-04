/**
 * This class provides an demonstration of how to use singletons with enums.
 *
 * @author Dulaj Atapattu
 */
public class EnumDemo {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
