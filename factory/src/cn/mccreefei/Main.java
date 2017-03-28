package cn.mccreefei;

import cn.mccreefei.shape.Shape;
import cn.mccreefei.shapefactory.CircleFactory;
import cn.mccreefei.shapefactory.RectangleFactory;
import cn.mccreefei.shapefactory.ShapeFactory;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = new CircleFactory();
        ShapeFactory shapeFactory2 = new RectangleFactory();
        Shape shape1 = shapeFactory1.createShape();
        Shape shape2 = shapeFactory2.createShape();

        shape1.draw();
        shape2.draw();
    }
}
