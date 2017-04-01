package cn.mccreefei;

/**
 * Created by Administrator on 2017/4/1.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式，在一些集合中，进行每一项的迭代而不需要知道具体的实现方式
 * java集合框架中几乎处处都能见到Iterator迭代器
 * 集合只需要各自实现这个Iterator接口就能被统一地迭代
 * 因为非常常见只需在集合中看看源码就理解这个模式，我就不实现迭代器了
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 7, 9, 10};
        List arrayList = Arrays.asList(array);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
