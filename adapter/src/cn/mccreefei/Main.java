package cn.mccreefei;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        Iterator<Integer> iterator = new EnumerationIteratorAdapter<Integer>(vector.elements());
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
