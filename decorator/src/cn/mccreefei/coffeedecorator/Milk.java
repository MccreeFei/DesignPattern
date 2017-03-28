package cn.mccreefei.coffeedecorator;

import cn.mccreefei.coffee.Coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 咖啡加牛奶
 */
public class Milk extends CoffeeDecorator {
    private float price = 5;
    public Milk(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return price + coffee.cost();
    }
}
