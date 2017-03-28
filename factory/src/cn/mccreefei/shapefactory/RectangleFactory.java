package cn.mccreefei.shapefactory;

import cn.mccreefei.shape.Rectangle;
import cn.mccreefei.shape.Shape;

/**
 * Created by Administrator on 2017/3/28.
 */
public class RectangleFactory extends ShapeFactory {
    private Rectangle rectangle = new Rectangle();
    @Override
    public Shape createShape() {
        return rectangle;
    }
}
