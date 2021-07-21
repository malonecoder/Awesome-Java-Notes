package com.lxm.java.Container.list;

import java.util.Stack;
import java.util.Vector;

/**
 * 和ArrayList一样 采用底层数组结构
 * 大部分操作方法采用了synchronized来修饰，性能比ArrayList低。
 * ArrayList中的数组使用了transient关键字,来提高序列化的效率。如果数组中只有3个元素，则不会序列化 初始化大小为10的数组，而是直接序列化3个元素。
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add(2, "B");
        vector.remove("A");

        Stack<String > strings = new Stack<>();


    }
}
