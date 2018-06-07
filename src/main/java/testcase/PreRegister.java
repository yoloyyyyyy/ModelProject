package testcase;

import Util.HttpUtil;

/**
 * Created by yolo on 2018/6/2.
 */
public class PreRegister {
    public static void main(String[] args) {
        String url = "http://sg-en-web-api.65emall.net/api/Account/PreRegister";
        String params = "{\"area\":\"SG\",\"email\":\"autotest01@ezbuy.com\",\"password\":\"111111\",\"userName\":\"autotest01\",\"platform\":\"Website\",\"voucherIds\":\"\",\"stats\":{\"identityId\":\"\"}}";
        String result = HttpUtil.doPost(url,params);
        System.out.println(result);
    }
}
