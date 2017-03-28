package cn.mccreefei.machinefactory;

import cn.mccreefei.machine.AirConditioning;
import cn.mccreefei.machine.HaierAirConditioning;
import cn.mccreefei.machine.HaierRefrigerator;
import cn.mccreefei.machine.Refrigerator;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 海尔工厂，创建海尔冰箱、海尔空调
 */
public class HaierFactory extends MachineFactory {
    @Override
    public AirConditioning createAirConditioning() {
        return new HaierAirConditioning();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }
}
