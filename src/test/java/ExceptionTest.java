import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class ExceptionTest {
    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
    public void testException(){
        throw new IllegalArgumentException("NullPoint");
    }
}
