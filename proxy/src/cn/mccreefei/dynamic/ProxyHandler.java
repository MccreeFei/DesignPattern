package cn.mccreefei.dynamic;

import cn.mccreefei.subject.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/1.
 */

/**
 * 动态代理，由虚拟机动态生成代理对象，代理对象需要关联一个InvocationHandler
 * 代理对象调用方法时，都会转发到关联的InvocationHandler对象中处理
 */
public class ProxyHandler implements InvocationHandler {
    private Subject subject;
    public ProxyHandler(Subject subject){
        this.subject = subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (proxy instanceof Subject){
            System.out.println("before send!");
            method.invoke(subject, args);
            System.out.println("after send!");
        }
        return null;
    }
}
