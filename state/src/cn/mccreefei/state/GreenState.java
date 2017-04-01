package cn.mccreefei.state;

import cn.mccreefei.Light;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/4/1.
 */

/**
 * 绿灯状态，5s后切换为红灯状态
 */
public class GreenState implements State {
    private Light light;
    public GreenState(Light light){
        this.light = light;
    }
    @Override
    public void work() {
        System.out.println("绿灯行！");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.setState(light.getRedState());
    }
}
