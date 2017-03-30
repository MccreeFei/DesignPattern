package cn.mccreefei;

import cn.mccreefei.facade.Facade;
import cn.mccreefei.facade.SwitchFacade;
import cn.mccreefei.system.AirConditioning;
import cn.mccreefei.system.Light;
import cn.mccreefei.system.TV;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main {
    public static void main(String[] args) {
        AirConditioning airConditioning = new AirConditioning();
        Light light = new Light();
        TV tv = new TV();

        Facade facade = new SwitchFacade(airConditioning, light, tv);
        facade.openAll();
        facade.closeAll();
    }
}
