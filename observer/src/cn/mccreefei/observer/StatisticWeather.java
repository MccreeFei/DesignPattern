package cn.mccreefei.observer;

import cn.mccreefei.observable.Observable;
import cn.mccreefei.observable.WeatherDate;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 统计最高和最低温度
 */
public class StatisticWeather implements Observer {
    private float maxTemp = Short.MIN_VALUE;
    private float minTemp = Short.MAX_VALUE;
    private Observable observable;
    public StatisticWeather(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(WeatherDate weatherDate) {
        float temp = weatherDate.getTemp();
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;
        System.out.println("minTemp = " + minTemp + ", maxTemp = " + maxTemp);
    }
}
