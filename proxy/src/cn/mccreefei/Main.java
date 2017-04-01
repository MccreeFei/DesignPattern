package cn.mccreefei;

import cn.mccreefei.dynamic.ProxyHandler;
import cn.mccreefei.normal.SubjectProxy;
import cn.mccreefei.subject.RealSubject;
import cn.mccreefei.subject.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/4/1.
 */
public class Main {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        System.out.println("dynamic proxy-------------------------");
        InvocationHandler proxyHandler = new ProxyHandler(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                new Class[]{Subject.class}, proxyHandler);
        System.out.println(subject.getClass().getName());
        subject.sendRequest();

        System.out.println();
        System.out.println("normal proxy-----------------------");
        Subject subjectProxy = new SubjectProxy(realSubject);
        subject.sendRequest();
    }
}
