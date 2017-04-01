package cn.mccreefei.state;

/**
 * Created by Administrator on 2017/4/1.
 */

/**
 * 状态模式，允许一个对象基于不同的状态有不同的行为
 * 这里是一个红绿灯的状态接口
 */
public interface State {
    public void work();
}
