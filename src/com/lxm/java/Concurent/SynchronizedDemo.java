package com.lxm.java.Concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* synchronized 一个方法或一个代码块  同步作用于一个同一个对象
* synchronized 使用Synchronized（类.class) 或修饰一个静态方法 则同步使用于整个类
* */
public class SynchronizedDemo {

    public static void main(String[] args) {
        SynchronizedObject synchronizedObject = new SynchronizedObject();
        SynchronizedObject synchronizedObject1 = new SynchronizedObject();
        LockObject lockExample = new LockObject();
        LockObject lockExample2 = new LockObject();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            lockExample.func();
        });
        service.execute(() -> {
            lockExample2.func();
        });
    }
}