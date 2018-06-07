import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class TestNGlearn1 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    
    @Test
    public void test2(){
        System.out.println("the second method");
    }
    
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
}
