package cn.mccreefei.coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 卡布奇洛咖啡，售价30
 */
public class CappuccinoCoffee extends Coffee {
    private float price = 30;
    public CappuccinoCoffee(){
        description = "CappuccinoCoffee";
    }
    @Override
    public float cost() {
        return price;
    }
}
