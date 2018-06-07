/**
 * Created by yolo on 2018/5/14.
 */
public class EnumTest {
    public static void main(String[] args) {
        Constants constants = Constants.MON;
        System.out.println(constants.getClass());
        for(Constants constants1 : Constants.values()){
            System.out.println(constants1.toString());
        }
    }
}
