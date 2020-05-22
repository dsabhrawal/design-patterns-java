package dp.creational.singleton;

import java.io.*;

/**
 * In this class we will resolve the serialization problem that we face in our simple singleton approach
 * Here we are resolving serialization problem
 */

class SerializedSingleton implements  Serializable{

    private int value;
    private SerializedSingleton(){
        this.value = 0;
    }
    private static final SerializedSingleton INSTANCE = new SerializedSingleton();

    public static SerializedSingleton getInstance(){
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Resolving serialization problem by providing custom readResolve method
    protected Object readResolve(){
        return INSTANCE;
    }
}
public class SerializedSingletonMain {

    public static void main(String[] args) throws Exception {
        SerializedSingleton obj1 = SerializedSingleton.getInstance();
        obj1.setValue(101);
        writeToFile(obj1, "singleton");
        obj1.setValue(102);
        SerializedSingleton obj2 = readFromFile("singleton");
        System.out.println(obj1 == obj2);
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

    }
    public static void writeToFile(Object object, String fileName) throws Exception {
        try(FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(object);
        }
    }

    public static SerializedSingleton readFromFile(String fileName) throws Exception{
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);){
            return (SerializedSingleton) ois.readObject();
        }
    }
}
