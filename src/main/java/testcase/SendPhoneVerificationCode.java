package testcase;

import Util.HttpUtil;
import Util.MatchUtil;
import Util.MssqlConn;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yolo on 2018/6/2.
 */
public class SendPhoneVerificationCode {
    static MssqlConn mssqlConn = null;
    static ResultSet resultSet = null;
    public static void main(String[] args) {
        String url = "http://sg-en-web-api.65emall.net/api/Account/SendPhoneVerificationCode";
        String params = "{\"area\":\"SG\",\"phone\":\" +65 80809931\"}";
        String result = HttpUtil.doPost(url,params);
        System.out.println(getVerifyCode());
    }
    public static String getVerifyCode(){
        String sql = "select top 1 * from CustomerSms where SentTo like '%80809931' order by CreateDate desc";
        String sms = null;
        try {
            mssqlConn = new MssqlConn(sql);
            resultSet = mssqlConn.pst.executeQuery();
            while (resultSet.next()){
                 sms = resultSet.getString(4);
                System.out.println(sms);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  MatchUtil.getVerifyCode(sms);
    }
}
