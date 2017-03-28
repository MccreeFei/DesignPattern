package cn.mccreefei.observable;

import cn.mccreefei.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 气象数据源主题，一旦气象更新就会通知观察者。
 */
public class WeatherDataSource implements Observable, WeatherDate{
    private List<Observer> observers;

    private float temp;    //气温
    private float humidity;//湿度
    private float pressure;//温度

    public WeatherDataSource(){
        observers = new ArrayList<Observer>();
    }

    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }
}
