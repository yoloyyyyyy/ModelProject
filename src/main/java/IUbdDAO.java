import java.sql.SQLException;
import java.util.Set;

/**
 * Created by yolo on 2018/4/18.
 */
public interface IUbdDAO {
    public boolean doCreate(UserBillDetail userBillDetail) throws SQLException;
    public boolean doUpdate(UserBillDetail userBillDetail) throws SQLException;
    public boolean remove(Set<Integer> ids);
    public UserBillDetail findById(Integer id);
    public  UserBillDetail findAll(UserBillDetail userBillDetail);
    
    
}
