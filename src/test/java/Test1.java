import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

/**
 * Created by yolo on 2018/4/11.
 */
public class Test1 {
    @Test
    public void testCase1(){
        Assert.assertTrue(false);
        System.out.println("case1");
        Reporter.log("测试1失败");
    }
    
    @Test
    public void testCase2(){
        Assert.assertTrue(true);
        System.out.println("case2");
        Reporter.log("测试2通过");
    }
    
    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("before method");
    }
    
    @AfterMethod
    public void afterMethod(){
        System.out.println("after Mthod");
    }
    
    @BeforeClass
    public void beforeClass(){
        System.out.println("before Class");
    }
    
    @AfterClass
    public void afterClass(){
        System.out.println("after Class");
    }
    
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
    
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite");
    }
}
