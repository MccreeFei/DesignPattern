package cn.mccreefei;

/**
 * Created by Administrator on 2017/4/1.
 */

import cn.mccreefei.state.GreenState;
import cn.mccreefei.state.RedState;
import cn.mccreefei.state.State;
import cn.mccreefei.state.YellowState;

/**
 * 红绿灯对象，将行为委托给当前状态，对于不同灯状态有不同的行为
 */
public class Light {
    private State redState = new RedState(this);
    private State yellowState = new YellowState(this);
    private State greenState = new GreenState(this);
    private State curState;
    public Light(){
        curState = redState;
    }

    public void work(){
        while (true){
            curState.work();
        }
    }

    public void setState(State state){
        curState = state;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getGreenState() {
        return greenState;
    }

    public State getCurState() {
        return curState;
    }
}
