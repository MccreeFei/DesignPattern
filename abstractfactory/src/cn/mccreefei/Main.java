package cn.mccreefei;

import cn.mccreefei.machinefactory.HaierFactory;
import cn.mccreefei.machinefactory.MachineFactory;
import cn.mccreefei.machinefactory.MeidiFactory;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
        MachineFactory machineFactory1 = new HaierFactory();
        machineFactory1.createAirConditioning().display();
        machineFactory1.createRefrigerator().display();

        MachineFactory machineFactory2 = new MeidiFactory();
        machineFactory2.createAirConditioning().display();
        machineFactory2.createRefrigerator().display();
    }
}
