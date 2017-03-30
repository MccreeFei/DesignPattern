package cn.mccreefei;

/**
 * Created by Administrator on 2017/3/30.
 */

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 适配器模式，将被调用的接口转化成需要的接口
 * 这里将Enumeration接口转化成Iterator接口
 */
public class EnumerationIteratorAdapter<E> implements Iterator<E>{
    private Enumeration<E> enumeration;
    public EnumerationIteratorAdapter(Enumeration<E> e){
        enumeration = e;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
