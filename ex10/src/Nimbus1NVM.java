



import java.io.*;

public class Nimbus1NVM implements PersistentImp {
    // TODO: Do not change this class and do not submit it.

    @Override
    public void store(String name, Serializable obj) throws IOException {
        System.out.println("Writing "+ obj +" to Nimbus1NVM file "+name+".");
        // You can uncomment this line or the next one (not both) to see how serialization works
//        FileOutputStream fileOutputStream = new FileOutputStream(name);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out);
        // If you chose to uncomment one of the lines above, also uncomment the lines below
//        System.out.println("The serialized data is:");
//        objectOutputStream.writeObject(obj);
//        System.out.println();
//        objectOutputStream.flush();
    }

    @Override
    public Object retrieve(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream
                = new FileInputStream(fileName);
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Object obj = objectInputStream.readObject();
        objectInputStream.close();
        return obj;
    }
}
