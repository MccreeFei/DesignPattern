package cn.mccreefei.command;

import cn.mccreefei.been.Light;

/**
 * Created by Administrator on 2017/3/29.
 */
public class CloseLightCommand implements Command {
    private Light light;
    public CloseLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.close();
    }
}
