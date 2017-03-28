package cn.mccreefei.observer;

/**
 * Created by Administrator on 2017/3/28.
 */

import cn.mccreefei.observable.WeatherDate;

/**
 * 观察者接口，拥有update方法，主题更新时会被调用
 */
public interface Observer {
    public void update(WeatherDate weatherDate);
}
