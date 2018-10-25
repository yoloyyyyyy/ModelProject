import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yolo on 2018/9/13.
 */
public class CartPage {
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[1]/div[1]")
    private WebElement selectAllUp;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[3]/div[2]/div[1]")
    private WebElement selectAllDown;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[4]/div[3]/div/a[2]")
    private WebElement qtyplus;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[4]/div[3]/div/input")
    private WebElement qtyinput;
    
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[4]/div[3]/div/a[2]")
    private WebElement qtyreduce;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[5]/a[1]")
    private WebElement addfav;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[5]/a[2]")
    private WebElement delete;
    
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[3]/div[2]/div[2]/a")
    private WebElement checkout;

    

}
