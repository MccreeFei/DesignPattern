package cn.mccreefei.coffeedecorator;

import cn.mccreefei.coffee.Coffee;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 咖啡装饰器
 */
public abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;
    @Override
    public abstract String getDescription();

    protected CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
