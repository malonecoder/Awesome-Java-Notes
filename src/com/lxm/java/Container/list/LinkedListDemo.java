package com.lxm.java.Container.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 双向链表结构存储
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        // 插入操作的时间复杂度O(1), 直接找到要插入链接的位置，其它元素不需要移动。
        linkedList.add(2, "B");
        //查找操作需要循环遍历整个链表，从前或从后，时间复杂度为O（n）
        String element = linkedList.get(1);

        //当做栈来使用
        linkedList.addFirst("1");
        linkedList.removeFirst();
        linkedList.peekFirst();
        linkedList.isEmpty();

        //当做队列来使用
        Queue<String> queue = new LinkedList();
        queue.offer("1");//添加到队列底部
        queue.poll(); // 移除头部元素
        queue.peek();//查找头部元素 queue.element();


    }
}
