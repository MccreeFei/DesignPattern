package cn.mccreefei.been;

import cn.mccreefei.command.Command;
import cn.mccreefei.command.EmptyCommand;

/**
 * Created by Administrator on 2017/3/29.
 */

/**
 * 遥控器类，有5个开光按钮，按下相应的按钮就有就相应的动作
 * 是命令模式中调用者的身份，并不需要知道命令由谁去执行，以及用何种方式执行
 * 命令模式将调用者与接收请求者解耦
 */
public class RemoteControl {
    private Command[] openCommands;
    private Command[] closeCommands;

    public RemoteControl(){
        openCommands = new Command[5];
        closeCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            openCommands[i] = EmptyCommand.getInstance();
            closeCommands[i] = EmptyCommand.getInstance();
        }
    }
    //将命令与位置相关联
    public void setCommand(int position, Command openCommand, Command closeCommand){
        openCommands[position] = openCommand;
        closeCommands[position] = closeCommand;
    }

    public void pressOpenCommand(int position){
        openCommands[position].execute();
    }

    public void pressCloseCommand(int position){
        closeCommands[position].execute();
    }
}
