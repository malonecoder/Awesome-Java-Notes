package com.lxm.java.Concurent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread run");
            }
        },0,3, TimeUnit.SECONDS);

//        executorService.shutdownNow();//shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法
//        scheduledThreadPoolExecutor.shutdown();//等线程执行完成后关闭。




    }
}
