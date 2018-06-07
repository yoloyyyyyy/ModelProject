import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yolo on 2018/5/8.
 */
public class TestMultipleThreads {
    @Test(invocationCount = 3,enabled = false)
    public void loadTest() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        System.out.println("this page title is " + webDriver.getTitle());
        Assert.assertEquals("百度一下，你就知道",webDriver.getTitle());
        Thread.sleep(2000);
        webDriver.quit();
        
    }
    
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void testThreads(){
        System.out.printf("Thread is %s%n",Thread.currentThread().getId());
    }
}
