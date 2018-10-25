import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by yolo on 2018/10/24.
 */
public class WebLogin {
    
    public static void main(String[] args) throws InterruptedException {
        String url = "http://sg.65emall.net/Account/Login?ReturnUrl=http%3A%2F%2Fsg.65emall.net%2F";
        WebDriver webDriver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(webDriver);
        webDriver.get(url);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
        loginPage.login("sglocal01","111111");
        
    }
}
