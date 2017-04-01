package cn.mccreefei.subject;

import cn.mccreefei.subject.Subject;

/**
 * Created by Administrator on 2017/4/1.
 */
public class RealSubject implements Subject {
    @Override
    public void sendRequest() {
        System.out.println("this is server, send you subject!");
    }
}
