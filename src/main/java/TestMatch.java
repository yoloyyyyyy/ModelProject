import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yolo on 2018/6/2.
 */
public class TestMatch {
    public static void main(String[] args) {
        String str = "Use 384397 (ezbuy OTP) to proceed. Key in the OTP within 15 minutes";
        Pattern pt = Pattern.compile("[0-9]+");
        Matcher match = pt.matcher(str);
        match.find();
        System.out.println(match.group());
        while (match.find()){
            System.out.println(match.group());
        }
    }


    
    
    
}
