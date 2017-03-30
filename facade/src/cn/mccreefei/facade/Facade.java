package cn.mccreefei.facade;

/**
 * Created by Administrator on 2017/3/30.
 */

/**
 * 外观模式，将子系统从主系统中解耦
 * 暴露出外观接口
 * 但不符合开闭原则，添加子系统需要修改外观类
 */
public interface Facade {
    public void openAll();
    public void closeAll();
}
