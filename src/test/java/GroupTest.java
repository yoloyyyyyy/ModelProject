import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class GroupTest {
    @Test(groups = "group1")
    public void groupMethod1(){
        System.out.println("group1Method1");
    }

    @Test(groups = "group1")
    public void groupMethod2(){
        System.out.println("group1Method2");
    }

    @Test(groups = "group2")
    public void groupTwoMethod1(){
        System.out.println("group2Method1");
    }
    
/*    @Test(timeOut = 1000)
    public void caseTimeout(){
        while(true){
            
        }
    }*/
    @Test
    @Parameters("test1")
    public void caseParameterized(String test1){
        System.out.println("this is"+test1);
    }    
}
