package com.lxm.java.Concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {
    public synchronized void before() {
        System.out.println(Thread.currentThread().getName() + ":before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            System.out.println(Thread.currentThread().getName() + "正在执行");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "准备释放锁");
            wait();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":after");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());

    }
}
