package cn.mccreefei.observer;

import cn.mccreefei.observable.Observable;
import cn.mccreefei.observable.WeatherDate;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 当前天气通报观察者，显示最新天气情况
 */
public class CurrentWeather implements Observer {
    private Observable observable;
    public CurrentWeather(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(WeatherDate weatherDate) {
        float temp = weatherDate.getTemp();
        float humidity = weatherDate.getHumidity();
        float pressure = weatherDate.getPressure();
        System.out.println("Current: temp = " + temp + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
