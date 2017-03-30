package cn.mccreefei;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main {
    public static void main(String[] args) {
        PlayBall playBasketball = new PlayBasketball();
        PlayBall playFootball = new PlayFootball();

        playBasketball.playBall();
        playFootball.playBall();
    }
}
