package testcase;

import Util.HttpUtil;
import net.sf.json.JSONObject;

/**
 * Created by yolo on 2018/6/1.
 */
public class LoginTest {
    private static String url = "http://sg-en-web-api.65emall.net/api/Account/Login";
    private static String params= "{\"area\":\"SG\",\"userNameOrEmail\":\"sglocal01\",\"password\":\"111111\",\"platform\":\"Website\",\"deviceToken\":\"\",\"UDID\":\"\",\"deviceInfo\":\"\"}";
/*    public static void main(String[] args) {
        String result = HttpUtil.doPost(url, params);
        System.out.println(result);
    }*/
    public static String getCookie(){
        String result = HttpUtil.doPost(url, params);
        JSONObject jsonobj = JSONObject.fromObject(result);
        String cookie = "65_customer="+jsonobj.getString("customerCookie");
        return  cookie;
    }
}
