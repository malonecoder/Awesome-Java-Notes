package com.lxm.java.Container.set;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 使用的hashmap来存储数据，所以为 数组(散列表)+链表或红黑树的数据结构
 *
 * 无序，不能重复，只能有一个null, hashset就像一个罐子，扔进去的元素没有什么区别，
 *
 * 插入时是无序的放在一起，取出时也是无序的
 *
 * */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("B");
        hashSet.add("B");//重复的数据不能插入
        hashSet.add("K");
        hashSet.add("F");
        hashSet.add("E");
        hashSet.add("D");
        hashSet.add("S");
        hashSet.add("A");
        hashSet.add("H");
        hashSet.add("O");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
