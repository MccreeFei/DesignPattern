package cn.mccreefei.state;

import cn.mccreefei.Light;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/4/1.
 */

/**
 * 红灯状态，3s后切换为黄灯状态
 */
public class RedState implements State {
    private Light light;
    public RedState(Light light){
        this.light = light;
    }
    @Override
    public void work() {
        System.out.println("红灯停！");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.setState(light.getYellowState());
    }
}
