import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by yolo on 2018/5/9.
 */
public class TestParameterConn {
    public Connection conn = null;

    @Test
    @Parameters({"dbconfig","poolsize"})
    public void creatConnection(String dbconfig,int poolsize) throws ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        System.out.println(poolsize);
        try {
            properties.load(new FileInputStream(dbconfig));
            String driver = properties.getProperty("jdbc.driver");
            String url = properties.getProperty("jdbc.url");
            String username = properties.getProperty("jdbc.username");
            String password = properties.getProperty("jdbc.password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(conn);
        } catch (IOException e) {
            e.printStackTrace();
        } 


    }
}
