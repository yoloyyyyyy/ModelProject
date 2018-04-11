import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yolo on 2018/4/8.
 */
public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException, IOException, BiffException {

        String url = "http://sg.65emall.net/Account/Login?ReturnUrl=http%3A%2F%2Fsg.65emall.net%2F";

        ExcelData excelData = new ExcelData("testcase", "Sheet1");
//        Map<String,String>[][] arr = excelData.getExcelData();
        Object[][] arr = excelData.getExcelData();

        for (Object[] anArr : arr) {//控制行数
            WebDriver webDriver = new ChromeDriver();
            LoginPage loginPage = new LoginPage(webDriver);
            webDriver.get(url);
            Thread.sleep(3);
            Map<String, String> map = (HashMap) anArr[0];
            loginPage.login(map.get("username"), map.get("password"));
            Thread.sleep(5000);
            webDriver.quit();
        }


    }
   

}
