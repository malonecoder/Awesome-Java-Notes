package com.lxm.java.Container.map;

import java.util.*;

/*
 * LinkedHashMap在hashmap的基础上，维护了一个插入顺序的链表，可以在取出的时候也是按插入的顺序取出的，而不是按key排序的顺序取出
 * TreeMap是排序的map,取出的时候是按key来进行排序好再输出
 * */
public class LinkHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("2", "lxm");
        map.put("D", "蔡晓倩");
        map.put("3", "刘唯希");
        map.put("S", "刘唯希");
        map.put("O", "刘唯希");
        map.put("A", "刘唯希");
        map.put("J", "刘唯希");
        map.put("10", "刘唯希");
        map.put("8", "刘唯希");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println("key:" + next.getKey() + ",value:" + next.getValue());
        }

    }
}
