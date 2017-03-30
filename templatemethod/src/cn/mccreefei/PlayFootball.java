package cn.mccreefei;

/**
 * Created by Administrator on 2017/3/30.
 */
public class PlayFootball extends PlayBall {
    @Override
    public void prepareBall() {
        System.out.println("准备足球！");
    }

    @Override
    public void startPlayBall() {
        System.out.println("开始踢足球！");
    }
}
