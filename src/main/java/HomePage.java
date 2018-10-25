import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by yolo on 2018/10/24.
 */
public class HomePage {
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div/div[1]/div/div/input")
    private WebElement keyword;
    
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div[2]/div[2]/div/a")
    private WebElement alertwindow;
    
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div/div[1]/div/div/button")
    private WebElement searchButton;
    
    @FindBy(xpath = "//*[@id=\"reactAppContainer\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/a/img")
    private WebElement prodcutPic;

    public HomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void serch(String keyWord){
        keyword.sendKeys(keyWord);
        searchButton.click();
    }
    
    public void closeWindow(){
        alertwindow.click();
    }
    
    public void openProduct(){
        prodcutPic.click();
    }
}
