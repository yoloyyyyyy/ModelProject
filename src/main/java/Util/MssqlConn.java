package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by yolo on 2018/6/2.
 */
public class MssqlConn {
    private final static String URL = "jdbc:sqlserver://192.168.199.66:1433;DatabaseName=Pro";
    private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String username = "manager";
    private static String password = "65ezbuy@nicemanager";
    public Connection conn = null;
    public PreparedStatement pst = null;

    public MssqlConn(String sql) throws SQLException {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,username,password);
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
