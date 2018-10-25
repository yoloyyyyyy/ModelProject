import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by yolo on 2018/10/24.
 */
public class ProductTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://sg.65emall.net/product/388781.html";
        int[] type = {1,2};
        WebDriver webDriver = new ChromeDriver();
        ProductPage productPage = new ProductPage(webDriver);
        for (int i=0 ;i<type.length;i++){
            switch (type[i]){
                case  1:
                    webDriver.get(url);
                    webDriver.manage().window().maximize();
                    Thread.sleep(3000);
                    productPage.addEzbuy();
                    productPage.goToCart();
                    WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"test01\"]/div[2]/div/div/div/div[4]/div[3]/div/input"));
                    Thread.sleep(3000);
                    System.out.println(webElement.getAttribute("value") );
                    break;
                case 2 :
                    webDriver.get(url);
                    webDriver.manage().window().maximize();
                    Thread.sleep(3000);
                    productPage.addPrime();
                    productPage.goToCart();
                    WebElement webElement1 = webDriver.findElement(By.xpath("//*[@id=\"test01\"]/div[2]/div/div/div/div[4]/div[3]/div/input"));
                    Thread.sleep(3000);
                    System.out.println(webElement1.getAttribute("value") );
                    break;
                    default:
                        System.out.println("cannot find element");
            }
            
                
        }

        
//        ShoppingCart
//        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"test01\"]/div[2]/div/div/div/div[4]/div[3]/div/input"));
//          B4mCart
//        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"Playboy Company Business Store\"]/div[2]/div/div[1]/div/div[4]/div[3]/div/input"));
        
/*        Thread.sleep(3000);
        String qty = webElement.getAttribute("value");
        System.out.println(qty );*/
        //        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        productPage.searchB4m();
//        String sreach_handle = webDriver.getWindowHandle();
//        System.out.println(sreach_handle);
//        webDriver.switchTo().window(sreach_handle);
//        productPage.addBuy4me();
    }
}
