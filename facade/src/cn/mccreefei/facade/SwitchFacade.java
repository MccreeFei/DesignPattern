package cn.mccreefei.facade;

/**
 * Created by Administrator on 2017/3/30.
 */

import cn.mccreefei.system.AirConditioning;
import cn.mccreefei.system.Light;
import cn.mccreefei.system.TV;

/**
 * 开关外观，封装子系统
 * 实现一次开启关闭全部子系统
 */
public class SwitchFacade implements Facade {
    private AirConditioning airConditioning;
    private Light light;
    private TV tv;
    public SwitchFacade(AirConditioning airConditioning, Light light, TV tv){
        this.airConditioning = airConditioning;
        this.light = light;
        this.tv = tv;
    }
    @Override
    public void openAll() {
        airConditioning.open();
        light.open();
        tv.open();
    }

    @Override
    public void closeAll() {
        airConditioning.close();
        light.close();
        tv.close();
    }
}
