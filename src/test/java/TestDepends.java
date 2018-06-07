import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class TestDepends {
    @Test
    public void setup(){
        System.out.println("init");
    }
    
    @Test(dependsOnMethods = {"setup"})
    public void testDenpends(){
        System.out.println("nothing");
    }
}
