package cn.mccreefei;

/**
 * Created by Administrator on 2017/3/30.
 */

/**
 * 模板方法，分装了一系列算法，定义了算法的步骤，将步骤的实现延迟到子类
 * 打球模板方法：1.准备球 2.打球 3.打完洗澡
 * 打任何球都是这三个步骤，所以封装这些步骤，有些步骤让子类去实现。实现代码复用
 */
public abstract class PlayBall {
    public final void playBall(){
        prepareBall();
        startPlayBall();
        takeShower();
    }
    public abstract void prepareBall();
    public abstract void startPlayBall();
    public final void takeShower(){ //洗澡统一实现，使用final不让子类去覆盖
        System.out.println("take shower!");
    }
}
