package com.lxm.java.Container.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashset也是按存入数据的hash值去存放的,内部使用的LinkHashMap来进行存储
 * 但LinkedHashset会维护一个存入顺序的链表，来记录插入的顺序，在取出时也是按插入顺序取出的
 * */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("O");
        linkedHashSet.add("H");
        linkedHashSet.add("Z");
        linkedHashSet.add("1");

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
