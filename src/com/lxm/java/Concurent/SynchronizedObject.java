package com.lxm.java.Concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedObject {

    public void func1() {
        synchronized (SynchronizedObject.class) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedObject synchronizedExample = new SynchronizedObject();
        SynchronizedObject synchronizedExample1 = new SynchronizedObject();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            synchronizedExample.func1();
        });
        service.execute(() -> {
            synchronizedExample1.func1();
        });
    }
}