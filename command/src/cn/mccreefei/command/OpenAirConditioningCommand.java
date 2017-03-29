package cn.mccreefei.command;

import cn.mccreefei.been.AirConditioning;

/**
 * Created by Administrator on 2017/3/29.
 */
public class OpenAirConditioningCommand implements Command {
    private AirConditioning airConditioning;
    public OpenAirConditioningCommand(AirConditioning airConditioning){
        this.airConditioning = airConditioning;
    }
    @Override
    public void execute() {
        airConditioning.open();
    }
}
