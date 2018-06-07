import java.io.*;

/**
 * Created by yolo on 2018/5/26.
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializableFlyby();
        FlyBy flyBy = deSerializableFlyby();
        System.out.println(flyBy.toString());
    }
    
    private static void serializableFlyby() throws IOException {
        FlyBy flyBy = new FlyBy();
        flyBy.setCar("wulin");
        flyBy.setColor("yellow");
        flyBy.setName("james");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\work\\110.txt")));
        outputStream.writeObject(flyBy);
        System.out.println("序列化成功");
        outputStream.close();
    }
    
    private static   FlyBy deSerializableFlyby() throws IOException,ClassNotFoundException,FileNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\work\\110.txt")));
        FlyBy flyBy = (FlyBy) ois.readObject();
        System.out.println("反序列化成功");
        ois.close();
        return  flyBy;
    }
}
