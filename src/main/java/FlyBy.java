import java.io.Serializable;

/**
 * Created by yolo on 2018/5/26.
 */
public class FlyBy implements Serializable {
    private  static int age =29;
    private String name ;
    private String color;
    transient private String car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
    
    @Override
    public String toString(){
        return "FlyPig{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", car='" + car + '\'' +
                ", age='" + age + '\'' +
                '}';

    }
}
