package com.lxm.java.Container.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 数组（散列表+链表或红黑树（冲突后））存储
 * 因为是根据hash函数计算的存储位置，所以是无序的，key不可以重复
 * 当链表个数达到8个时，冲突的拉链法（查询O(n)）会转为红黑树结构，提高查询效率(O(logN))
 * hashmap采用的扩容因子为0.75,是在空间和时间上采取的一种折中值。
 * 如果扩容因子越小如0.5，0.3，越容易扩容，使用空间越大，如果扩容因子越大0.9 ,1.0,则越不容易扩容，则发生冲突的机率就会变大，查询效率变低。
 * 一旦扩容了，将会扩容到原来存储空间的2倍，原因是：//TODO   冲突机率会更小
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
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
