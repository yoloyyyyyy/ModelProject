import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by yolo on 2018/4/8.
 */
public class LoginPage {
//    @FindBy(xpath = ".//*[@id='needLogin']/a[1]")
//    private WebElement loginButton;
    @FindBy(xpath = ".//*[@id='reactAppContainer']/div/div/div/div/form/div[1]/div/div[2]/div[1]/input")
    private WebElement username;
    @FindBy(xpath = ".//*[@id='reactAppContainer']/div/div/div/div/form/div[2]/div/div[2]/div[1]/input")
    private WebElement password;
    @FindBy(xpath = ".//*[@id='reactAppContainer']/div/div/div/div/form/a[2]")
    private WebElement loginButton;
    @FindBy(xpath = ".//*[@id='ezbuySignOut']")
    private WebElement loginOutButton;
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    
    public void login(String userName,String passPord){
        
        username.sendKeys(userName);
        password.sendKeys(passPord);
        loginButton.click();
    }
    
    public void loginOut(){
        loginOutButton.click();
    }
    
}
