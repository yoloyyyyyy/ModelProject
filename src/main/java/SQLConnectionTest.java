import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yolo on 2018/4/11.
 */
public class SQLConnectionTest {
    static String sql = null;
    static MysqlConn mysqlConn = null;
    static ResultSet resultSet = null;

    public static void main(String[] args) throws SQLException {
        sql = "select * from userorder_sg.user_order_item where order_id=25386633889054720 ";
        mysqlConn = new MysqlConn(sql);
        resultSet = mysqlConn.pst.executeQuery();
        System.out.println(resultSet);
        while (resultSet.next()){
            String orderId = resultSet.getString(1);
            System.out.println("orderid: "+orderId);
        }
        resultSet.close();
        mysqlConn.close();

    }
}
