import java.io.*;

/**
 * This class demonstrates how the singleton property is broken with deserialization,
 * when using private constructors based methods.
 *
 * @author Dulaj Atapattu
 */
public class SerializeDemo implements Serializable {

    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.setValue(1);

        // Serialize the singleton with value = 1
        try {
            FileOutputStream fileOut = new FileOutputStream("out.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(singleton);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        singleton.setValue(2); // Change the value of the singleton in memory to 2

        // Deserialize the serialized singleton with value 1
        Singleton singleton2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("out.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton2 = (Singleton) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("singletons.SingletonEnum class not found");
            c.printStackTrace();
        }

        if (singleton == singleton2) {
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());

    }

}
