package com.lxm.java.Concurent;

import java.util.concurrent.*;

/**
 * 数组阻塞对列
 * 单端阻塞队列/双端阻塞队列
 * 有界的单端队列/有界的双端队列
 */
public class QueueDemo {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue(10);
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.poll();
        queue.poll();
        queue.peek();

        //单端阻塞队列  FIFO
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.offer("A");
        linkedBlockingQueue.offer("B");
        linkedBlockingQueue.offer("C");

        //双端阻塞队列 FIFO FILO 先进先出 先进后出两种操作方式
        LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>();
        linkedBlockingDeque.offerFirst("A");
        linkedBlockingDeque.offerLast("B");
        linkedBlockingDeque.pollFirst();
        linkedBlockingDeque.pollLast();
        linkedBlockingDeque.peekFirst();
        linkedBlockingDeque.peekLast();

        //CAS比较存入，有界的单端队列 //没有使用ReentrantLock
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.offer("A");
        concurrentLinkedQueue.offer("B");
        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
        concurrentLinkedDeque.offer("A");
        concurrentLinkedDeque.offer("B");
    }
}
