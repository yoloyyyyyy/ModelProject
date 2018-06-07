import java.io.Serializable;

/**
 * Created by yolo on 2018/4/18.
 */
public class UserBillDetail implements Serializable {
    private int id;
    private long billid;
    private int billcateid;
    private String code;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBillid() {
        return billid;
    }

    public void setBillid(long billid) {
        this.billid = billid;
    }

    public int getBillcateid() {
        return billcateid;
    }

    public void setBillcateid(int billcateid) {
        this.billcateid = billcateid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
