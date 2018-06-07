import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class CharUtilTest {
    @DataProvider(name = "char")
    public Object[][] dataProvider(){
        return new Object[][]{
                { 'A', 65 },{ 'a', 97 },
                { 'B', 66 },{ 'b', 98 },
                { 'C', 67 },{ 'c', 99 },
                { 'D', 68 },{ 'd', 100 },
                { 'Z', 90 },{ 'z', 122 },
                { '1', 49 },{ '9', 57 }
        };
    }
    
    @Test(dataProvider = "char")
    public void testCharToAscii(final char charter,final int ascii){
        int result  = CharUtil.charToAscii(charter);
        Assert.assertEquals(result,ascii);

    }
    
    @Test(dataProvider = "char",invocationCount = 10)
    public void testASCIIToChar(final char charter, final int ascii){
        char result1 = CharUtil.ASCIIToChar(ascii);
        Assert.assertEquals(result1,charter);
    }
}
