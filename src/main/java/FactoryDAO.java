/**
 * Created by yolo on 2018/4/19.
 */
public class FactoryDAO {
    public static IUbdDAO getInstanceOfUbdDAO(){
        return  new IUbdDAOImpl();
    }
}
