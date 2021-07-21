package com.lxm.java.Container.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 使用的TreeMap的key来进行存储 value是固定的PRESENT；
 * 使用的是红黑树的数据结构，在插入时会进行左右旋转来达到平衡，最多旋转3次
 * TreeSet/TreeMap 查找 插入 删除的时间复杂度O(logN)
 */

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("O");
        treeSet.add("H");
        treeSet.add("Z");
        treeSet.add("1");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
