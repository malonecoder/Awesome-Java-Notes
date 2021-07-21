package com.lxm.java.Container.map;

import java.util.*;

/**
 * TreeMap是SortedMap的实现类，按key的大小顺序（可自定义排序规则compare接口）进行输出
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
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
