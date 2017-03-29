package cn.mccreefei;

import cn.mccreefei.been.AirConditioning;
import cn.mccreefei.been.Light;
import cn.mccreefei.been.RemoteControl;
import cn.mccreefei.command.*;

/**
 * Created by Administrator on 2017/3/29.
 */
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("living room"); //寝室灯
        Light kitchenLight = new Light("kitchen");  //厨房灯
        AirConditioning airConditioning = new AirConditioning(); //空调

        Command openLivingRoomLightCommand = new OpenLightCommand(livingRoomLight);//new一个开寝室灯的命令
        Command closeLivingRoomLightCommand = new CloseLightCommand(livingRoomLight);

        Command openKitchenLightCommand = new OpenLightCommand(kitchenLight);
        Command closeKitchenLightCommand = new CloseLightCommand(kitchenLight);

        Command openAirConditioningCommand = new OpenAirConditioningCommand(airConditioning);
        Command closeAirConditioningCommand = new CloseAirConditioningCommand(airConditioning);

        remoteControl.setCommand(0, openLivingRoomLightCommand, closeLivingRoomLightCommand);//将开关寝室灯操作绑定在遥控器位置0上
        remoteControl.setCommand(1, openKitchenLightCommand, closeKitchenLightCommand);
        remoteControl.setCommand(2, openAirConditioningCommand, closeAirConditioningCommand);

        remoteControl.pressOpenCommand(1); //遥控器按下位置1上的open按钮
        remoteControl.pressCloseCommand(1);

        remoteControl.pressOpenCommand(2);
        remoteControl.pressCloseCommand(2);

        remoteControl.pressOpenCommand(4);
    }
}
