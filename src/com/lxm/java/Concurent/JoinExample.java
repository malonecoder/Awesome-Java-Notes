package com.lxm.java.Concurent;

/*
 * 当前运行在ThreadB的情况下，在ThreadB线程中调用ThreadA中的join（）方法，
 * 相当于先执行ThreadA,ThreadB执行挂起，ThreadA执行完再继续执行ThreadB
 * */
public class JoinExample {

    private static class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private static class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                System.out.println("当前在B线程中");
                a.join();
                System.out.println("当前在B线程中");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        b.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        a.start();
    }
}
