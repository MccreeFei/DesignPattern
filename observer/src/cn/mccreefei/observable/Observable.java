package cn.mccreefei.observable;

/**
 * Created by Administrator on 2017/3/28.
 */

import cn.mccreefei.observer.Observer;

/**
 * 主题接口，拥有增加、减少观察者方法，以及更新通知观察者方法
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers();
}
