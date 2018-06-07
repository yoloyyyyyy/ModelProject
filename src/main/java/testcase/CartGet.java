package testcase;

import Util.HttpUtil;

import java.io.IOException;

/**
 * Created by yolo on 2018/6/1.
 */
public class CartGet {
    public static void main(String[] args) throws IOException {
        String url = "http://sg-en-web-api.65emall.net/api/cart.CartPublic/Get";
        String params = "{\"cartType\":2}";
        String result = HttpUtil.doPostWithcookie(url,params, LoginTest.getCookie());
        System.out.println(result);
    }

}
