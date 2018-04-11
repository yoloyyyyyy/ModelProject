import java.sql.*;


/**
 * Created by yolo on 2018/4/11.
 */
public class MysqlConn {
    public static final String url = "jdbc:mysql://192.168.199.112:3306";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String username = "root";
    public static final String password = "ezbuyisthebest";
    
    private Connection conn = null;
    private PreparedStatement pst = null;
    private Statement statement = null;
    
    public MysqlConn(String sql) throws SQLException {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url,username,password);
                pst = conn.prepareStatement(sql);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }
    
    public void close(){
        try{
            this.conn.close();
            this.pst.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
