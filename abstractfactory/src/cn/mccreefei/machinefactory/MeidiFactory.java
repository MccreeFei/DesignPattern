package cn.mccreefei.machinefactory;

import cn.mccreefei.machine.AirConditioning;
import cn.mccreefei.machine.MeidiAirConditioning;
import cn.mccreefei.machine.MeidiRefrigerator;
import cn.mccreefei.machine.Refrigerator;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 美的工厂，创建美的冰箱，美的空调
 */
public class MeidiFactory extends MachineFactory {
    @Override
    public AirConditioning createAirConditioning() {
        return new MeidiAirConditioning();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new MeidiRefrigerator();
    }
}
