package cn.mccreefei.shapefactory;

import cn.mccreefei.shape.Shape;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 工厂封装子类的实现，实现解耦
 * 遵循开放-关闭原则：即对扩展开放对修改关闭
 */
public abstract class ShapeFactory {
    public abstract Shape createShape();
}
