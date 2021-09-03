package com.lxm.java.Concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
//        executorService.shutdownNow();//shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法
        executorService.shutdown();//等线程执行完成后关闭。




    }
}
