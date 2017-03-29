package cn.mccreefei.command;

import cn.mccreefei.been.AirConditioning;

/**
 * Created by Administrator on 2017/3/29.
 */
public class CloseAirConditioningCommand implements Command {
    private AirConditioning airConditioning;
    public CloseAirConditioningCommand(AirConditioning airConditioning){
        this.airConditioning = airConditioning;
    }
    @Override
    public void execute() {
        airConditioning.close();
    }
}
