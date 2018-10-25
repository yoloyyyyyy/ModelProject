import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by yolo on 2018/4/8.
 */
public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException, IOException, BiffException {

        String url = "http://sg.65emall.net/Account/Login?ReturnUrl=http%3A%2F%2Fsg.65emall.net%2F";

        ExcelData excelData = new ExcelData("testcase", "Sheet1");
//        Map<String,String>[][] arr = excelData.getExcelData();
        HashMap<String,String>[][] arr = excelData.getExcelData();
        System.out.println(arr[0][0]);
        
        for (int m = 0; m < arr.length; m++) {//控制行数
            WebDriver webDriver = new ChromeDriver();
            LoginPage loginPage = new LoginPage(webDriver);
            webDriver.get(url);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Thread.sleep(3);
            Map<String,String> map = (HashMap)arr[m][0];
            loginPage.login(map.get("username"),map.get("password"));
            Thread.sleep(5000);
            webDriver.quit();
        }


    }
   

}
