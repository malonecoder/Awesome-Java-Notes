package com.lxm.java.Container.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("A");
        //数组结构存储，插入或删除数据的时间复杂度为O（n）,其它数据需要跟随一起移动。
        list.add(1, "B");
        //随机查找的时间复杂度为O(1),可直接通过下标定位到元素
        String element = list.get(1);

        //生成线程安全的List  使用synchronized代码块使用了线程安全
        List<String> stringList = Collections.synchronizedList(list);
        stringList.add("a");
    }
}
