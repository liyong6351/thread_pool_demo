package com.liyong.demo.thread_pool.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
 */
public class NewCachedThreadPoolDemo {

    public static void main(String[] args) {
        int c = 100;
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < c; i++) {
            final int index = i;
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(() -> {
                System.out.println(Thread.currentThread().getId() + " is runing " + index);
            });
        }
        System.out.println("end");
    }
}
