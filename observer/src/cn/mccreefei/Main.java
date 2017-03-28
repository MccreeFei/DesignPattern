package cn.mccreefei;

import cn.mccreefei.observable.Observable;
import cn.mccreefei.observable.WeatherDataSource;
import cn.mccreefei.observer.CurrentWeather;
import cn.mccreefei.observer.Observer;
import cn.mccreefei.observer.StatisticWeather;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
        WeatherDataSource weatherDataSource = new WeatherDataSource();
        Observer currentWeather = new CurrentWeather(weatherDataSource);
        Observer statisticWeather = new StatisticWeather(weatherDataSource);

        weatherDataSource.update((float)14.5, 20, 30);
        weatherDataSource.update(17, 10, 25);
        weatherDataSource.update(13, 20, 10);
    }
}
