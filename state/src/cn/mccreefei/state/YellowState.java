package cn.mccreefei.state;

import cn.mccreefei.Light;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/4/1.
 */

/**
 * 黄灯状态,1s后切换为绿灯状态
 */
public class YellowState implements State {
    private Light light;
    public YellowState(Light light){
        this.light = light;
    }
    @Override
    public void work() {
        System.out.println("黄灯，请稍等。。。");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.setState(light.getGreenState());
    }
}
