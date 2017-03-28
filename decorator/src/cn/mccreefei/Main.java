package cn.mccreefei;

import cn.mccreefei.coffee.CappuccinoCoffee;
import cn.mccreefei.coffee.Coffee;
import cn.mccreefei.coffee.LatteCoffee;
import cn.mccreefei.coffeedecorator.Milk;
import cn.mccreefei.coffeedecorator.Mocha;
import cn.mccreefei.coffeedecorator.Sugar;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Milk(new Mocha(new LatteCoffee()));
        System.out.println("coffee1:" + coffee1.getDescription() + ",总金额：" + coffee1.cost() + "元");
        Coffee coffee2 = new Mocha(new Milk(new Sugar(new CappuccinoCoffee())));
        System.out.println("coffee2:" + coffee2.getDescription() + ",总金额：" + coffee2.cost() + "元");

    }
}
