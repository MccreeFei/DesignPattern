package cn.mccreefei.coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 咖啡抽象类，价格与描述
 */
public abstract class Coffee {
    protected String description;
    public String getDescription(){
        return description;
    }
    public abstract float cost();
}
