package Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yolo on 2018/6/5.
 */
public class MatchUtil {
    public static String getVerifyCode(String result){
        Pattern pt = Pattern.compile("[0-9]+");
        Matcher match = pt.matcher(result);
        String sms = null; 
        while (match.find()){
            if(match.group().length() == 6){
                sms = match.group();
            }
        }
        return sms;
    }
}
