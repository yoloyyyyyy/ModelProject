import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class DataProviderTest {
    @DataProvider(name = "provider")
    public Object[][] testData(){
        return new Object[][] {{10,20},{100,110}};
    }
    
    @Test(dataProvider = "provider")
    public void testProvider(int input,int except){
        Assert.assertEquals(input+10,except);
    }
}
