package cn.mccreefei.coffeedecorator;

import cn.mccreefei.coffee.Coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 咖啡加糖
 */
public class Sugar extends CoffeeDecorator {
    private float price = 1;
    public Sugar(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugur";
    }

    @Override
    public float cost() {
        return price + coffee.cost();
    }
}
