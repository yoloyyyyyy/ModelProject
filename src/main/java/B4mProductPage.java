import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by yolo on 2018/10/25.
 */
public class B4mProductPage {
    String taobao = "https://item.taobao.com/item.htm?spm=a219r.lm895.14.133.2dfd5f46sXEASd&id=574058285482&ns=1&abbucket=11";

    @FindBy(id = "web_search")
    private WebElement web_search;

    @FindBy(id = "webSearch")
    private WebElement searchButton;
    
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[3]/div[3]/div[2]/span")
    private WebElement buy4me;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[3]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]")
    private WebElement skuSize;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[3]/div[1]/div/div[2]/div/div[2]/div[1]/div[1]")
    private WebElement skuColor;

    @FindBy(className = "addToCartButton" )
    private  WebElement addButton;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[3]/div[2]/div[2]/div/div[2]/input")
    private WebElement qty;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[4]/div/div/a/svg")
    private WebElement cartDeleteButton;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[4]/div/div/div[1]/div/button[1]")
    private WebElement goCart;

    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[1]/div[2]/div/div[4]/div/div/div[1]/div/button[2]")
    private WebElement continueshop;

    public B4mProductPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void addBuy4me(){
        skuSize.click();
        skuColor.click();
        qty.clear();
        qty.sendKeys("9");
        buy4me.click();
        addButton.click();
    }

    public void goToCart(){
        goCart.click();
    }

    public void cotinueShop(){
        continueshop.click();
    }

    public void searchB4m(){
        web_search.clear();
        web_search.sendKeys(taobao);
        searchButton.click();
    }
}
