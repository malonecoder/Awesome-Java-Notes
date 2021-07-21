package com.lxm.java.Concurent;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * 线程安全的treeMap
 */
public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap map = new ConcurrentSkipListMap();
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

        //线程同步的treeSet  有序的
        ConcurrentSkipListSet set = new ConcurrentSkipListSet();
        set.add("A");
        set.add("D");
        set.add("C");
        set.add("A");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
