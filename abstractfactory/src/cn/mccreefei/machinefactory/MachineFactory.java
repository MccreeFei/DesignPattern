package cn.mccreefei.machinefactory;

/**
 * Created by Administrator on 2017/3/28.
 */

import cn.mccreefei.machine.AirConditioning;
import cn.mccreefei.machine.Refrigerator;

/**
 * 抽象工厂模式，和工厂模式的区别是：它生产出不同的产品族
 * 机器工厂，工厂的父类，创建空调和冰箱
 */
public abstract class MachineFactory {
    public abstract AirConditioning createAirConditioning();
    public abstract Refrigerator createRefrigerator();
}
