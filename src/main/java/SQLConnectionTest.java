import Util.MysqlConn;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yolo on 2018/4/11.
 */
public class SQLConnectionTest {
    static String sql = null;
    static MysqlConn mysqlConn = null;
    static ResultSet resultSet = null;
    private  List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();

    public static void main(String[] args) throws SQLException {
        sql = "select * from userorder_sg.user_order_item where order_id=25386633889054720 ";
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        mysqlConn = new MysqlConn(sql);
        resultSet = mysqlConn.pst.executeQuery();
        System.out.println(resultSet);
        resultSet.next();
        System.out.println(resultSet.getString(4));
        ResultSetMetaData rsm = resultSet.getMetaData();
        int countNum = rsm.getColumnCount();
        System.out.println(countNum);
        while (resultSet.next()){
            Map<String,Object> map = new HashMap<String,Object>();
            for (int i = 1; i < countNum; i++) {
                map.put(rsm.getColumnName(i),resultSet.getObject(i));
            }
            list.add(map);
/*            Long orderId = resultSet.getLong(1);
            Integer id = resultSet.getInt(2);
            System.out.println("orderid: "+orderId+"  id:"+id);*/
        }
        resultSet.close();
        mysqlConn.close();
        int rows = 1;
        for (Map<String,Object> map : list) {
            System.out.println("第"+rows+"行------------------------");
            for(String key : map.keySet()){
                System.out.println(key+": "+map.get(key));
            }
            rows++;
        }
    }
}
