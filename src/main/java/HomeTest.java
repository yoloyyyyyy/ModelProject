import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by yolo on 2018/10/24.
 */
public class HomeTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://sg.65emall.net/category?ezspm=1.10000000.3.0.0";
        WebDriver webDriver = new ChromeDriver();
        HomePage homePage = new HomePage(webDriver);
        webDriver.get(url);
        Thread.sleep(3000);
        webDriver.manage().window().maximize();
        homePage.closeWindow();
        homePage.openProduct();
//        homePage.serch("沙发");
        Thread.sleep(3000);
        webDriver.quit();
    }
}
