package cn.mccreefei.coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 拿铁咖啡，售价20
 */
public class LatteCoffee extends Coffee {
    private float price = 20;
    public LatteCoffee(){
        description = "LatteCoffee";
    }
    @Override
    public float cost() {
        return price;
    }
}
