package cn.mccreefei.command;

import cn.mccreefei.been.Light;

/**
 * Created by Administrator on 2017/3/29.
 */
public class OpenLightCommand implements Command {
    private Light light;
    public OpenLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.open();
    }
}
