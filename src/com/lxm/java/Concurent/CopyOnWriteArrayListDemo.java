package com.lxm.java.Concurent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 使用了Reentrant Lock实现了线程安全的arrayList
 *
 * 在添加或移除操作时，会直接将原数组复现一份新的数组，将新添加的元素添加到新数组中，再赋值给原数组，采用了读写分离的思想。
 * 适用场景：读多写少的场景。
 *
 * 缺点：
 * 1.内存占用比较大
 * 2.不能保证数据实时性
 */
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        strings.add("A");//写操作加了Reentrant来保证线程安全，防止复制多份数据
        strings.get(0);//读操作不需要加锁，一直读的是原来的数据
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
