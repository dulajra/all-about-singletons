package singletons;

import java.io.Serializable;

/**
 * Deserialization safe singleton with public static final factory method.
 *
 * @author Dulaj Atapattu
 */
public class SingletonFieldSerializable implements Serializable{

    public static final SingletonFieldSerializable INSTANCE = new SingletonFieldSerializable();

    private SingletonFieldSerializable() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }

}