package cn.mccreefei.command;

/**
 * Created by Administrator on 2017/3/29.
 */

/**
 * 空操作，运用到单例模式，只返回一个空命令对象
 */
public class EmptyCommand implements Command {
    private static EmptyCommand emptyCommand = null;
    private EmptyCommand(){}
    public static EmptyCommand getInstance(){
        if (emptyCommand == null) {
            synchronized (EmptyCommand.class){
                if (emptyCommand == null){
                    emptyCommand = new EmptyCommand();
                }
            }
        }
        return emptyCommand;
    }
    @Override
    public void execute() {
        System.out.println("nothing");
    }
}
