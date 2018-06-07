import Util.MysqlConn;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

/**
 * Created by yolo on 2018/4/19.
 */
public class IUbdDAOImpl implements IUbdDAO {
    private PreparedStatement pst;
    private MysqlConn mysqlConn ;
//    public IUbdDAOImpl (Util.MysqlConn mysqlConn){
//        this.mysqlConn = mysqlConn;
//    }
    public boolean doCreate(UserBillDetail userBillDetail) throws SQLException {
        String sql = "insert into userorder.user_bill_detail  (id,bill_id,bill_category_id,currency_code,bill_amount) VALUES (?,?,?,?,?)";
        try {
            pst =  mysqlConn.pst;
            pst.setInt(1,15);
            pst.setLong(2,21);
            pst.setInt(3,2);
            pst.setString(4,"te1");
            pst.setInt(5,300);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pst.executeUpdate() > 0;
    }

    public boolean doUpdate(UserBillDetail userBillDetail) throws SQLException {
        String sql = "update user_bill_detail set currency_code=? where id = ?";
        try {
            pst = new MysqlConn(sql).pst;
            pst.setString(1,"SS2");
            pst.setInt(2,userBillDetail.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pst.executeUpdate() > 0;
    }

    public boolean remove(Set<Integer> ids) {
        
        return false;
    }

    public UserBillDetail findById(Integer id) {
        return null;
    }

    public UserBillDetail findAll(UserBillDetail userBillDetail) {
        return userBillDetail;
    }
}
