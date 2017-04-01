package cn.mccreefei.normal;

import cn.mccreefei.subject.Subject;

/**
 * Created by Administrator on 2017/4/1.
 */

/**
 * 代理模式，客户不是直接和主题交流而是和代理
 * 代理可以预先做一些事情然后向真正的主题发送请求
 * 也可以请求发送后做一些事情
 */
public class SubjectProxy implements Subject {
    private Subject subject;
    public SubjectProxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void sendRequest() {
        System.out.println("before send!");
        subject.sendRequest();
        System.out.println("after send!");
    }
}
