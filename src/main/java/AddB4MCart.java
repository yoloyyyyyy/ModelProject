import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by yolo on 2018/10/25.
 */
public class AddB4MCart {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://sg.65emall.net/product/buyforme.html?url=https%3A%2F%2Fitem.taobao.com%2Fitem.htm%3Fspm%3Da219r.lm895.14.133.2dfd5f46sXEASd%26id%3D574058285482%26ns%3D1%26abbucket%3D11&src=10001";
        WebDriver webDriver = new ChromeDriver();
        B4mProductPage b4mProductPage = new B4mProductPage(webDriver);
        webDriver.get(url);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
//        b4mProductPage.searchB4m();
        b4mProductPage.addBuy4me();
        b4mProductPage.goToCart();
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[4]/div[3]/div/input"));
        //*[@id="reactAppContainer"]/div/div[2]/div/div[2]/div  ====第一个店铺的ID层级
        System.out.println(webElement.getAttribute("value"));
        webDriver.quit();
    }
}
