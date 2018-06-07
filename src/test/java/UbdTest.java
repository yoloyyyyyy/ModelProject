import java.sql.SQLException;
import java.util.Set;

/**
 * Created by yolo on 2018/4/19.
 */
public class UbdTest {
    public static void main(String[] args) throws SQLException {
        UserBillDetail userBillDetail = new UserBillDetail();
        Set<Integer> ids = null;
        System.out.println(FactoryDAO.getInstanceOfUbdDAO().doCreate(userBillDetail));
        System.out.println(FactoryDAO.getInstanceOfUbdDAO().doUpdate(userBillDetail));
        System.out.println(FactoryDAO.getInstanceOfUbdDAO().remove(ids));
    }

    
}
