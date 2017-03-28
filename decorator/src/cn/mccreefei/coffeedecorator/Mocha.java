package cn.mccreefei.coffeedecorator;

import cn.mccreefei.coffee.Coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 咖啡加摩卡
 */
public class Mocha extends CoffeeDecorator {
    private float price = 2;
    public Mocha(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return price + coffee.cost();
    }
}
