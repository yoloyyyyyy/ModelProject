import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by yolo on 2018/4/20.
 */
public class TestProperties {
    public static void main(String[] args) throws IOException,FileNotFoundException {
//        Properties properties = System.getProperties();
//        properties.list(System.out);
        Properties properties = new Properties();
//        System.out.println(new File("mysql.properties").getAbsoluteFile());
        properties.load(new FileInputStream("C:\\Users\\yolo\\IdeaProjects\\ModelProject\\testcore\\src\\main\\resources\\mysql.properties"));
        Enumeration enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()){
            String strKey = (String)enumeration.nextElement();
            String strValue = properties.getProperty(strKey);
            System.out.println(strKey+": "+strValue);
        }
        
    }
}
