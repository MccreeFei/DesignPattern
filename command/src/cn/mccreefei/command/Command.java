package cn.mccreefei.command;

/**
 * Created by Administrator on 2017/3/29.
 */

/**
 * 命令接口，命令都必须实现此接口
 * 封装执行请求的对象
 */
public interface Command {
    public void execute();
}
