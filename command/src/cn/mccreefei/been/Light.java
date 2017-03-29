package cn.mccreefei.been;

/**
 * Created by Administrator on 2017/3/29.
 */

/**
 * 灯类
 */
public class Light {
    private String desc;
    public Light(String desc){
        this.desc = desc;
    }
    public void open(){
        System.out.println(desc + " light open!");
    }
    public void close(){
        System.out.println(desc + " light close!");
    }
}
