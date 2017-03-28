package cn.mccreefei.shapefactory;

import cn.mccreefei.shape.Circle;
import cn.mccreefei.shape.Shape;

/**
 * Created by Administrator on 2017/3/28.
 */
public class CircleFactory extends ShapeFactory {
    private Circle circle = new Circle();
    @Override
    public Shape createShape() {
        return circle;
    }
}
