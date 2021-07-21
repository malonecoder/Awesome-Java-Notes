package com.lxm.java.Concurent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * 线程安全的hashSet
 * CopyOnWriteArraySet使用的CopyOnWriteArrayList  底层是动态数组
 * 因为set是集合，是不允许重复的，如果CopyOnWriteArrayList提供了addIfAbsent方法帮助CopyOnWriteArraySet实现去重操作
 * */
public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet();
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("D");
        set.add("C");
        set.add("G");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
