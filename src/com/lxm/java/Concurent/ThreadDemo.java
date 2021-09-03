package com.lxm.java.Concurent;

import java.util.concurrent.*;

/*
 * Thread开启的方式
 *
 * */
public class ThreadDemo {
    public static class MyRunnable implements Runnable {
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            //...
            System.out.println("MyThread线程运行");
            while (!Thread.interrupted()) {

            }
            System.out.println("MyThread线程结束");
        }
    }

    public static class MyCallable implements Callable<Integer> {
        public Integer call() {
            return 123;
        }
    }

    public static void main(String[] args) {
        //第一种：实现runnable接口  推荐
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        //第二种 继承Thread
        MyThread myThread = new MyThread();
        myThread.start();
        //第三种 实现Callable接口
        FutureTask futureTask = new FutureTask(new MyCallable());
        new Thread(futureTask).run();


        /**====================**/
        //中断当前线程  interrupt并不能马上中断当前线程，会把当前线程做一个结束的标记，需要通过Thread.interrupted()标记来控制逻辑。
        thread.interrupt();
        myThread.interrupt();
    }
}
