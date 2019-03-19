package com.liyong.demo.thread_pool.demo;

import java.util.concurrent.*;

/**
 * 创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下：
 * 表示延迟3秒执行
 */
public class NewScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //for (int i = 0; i < 100; i++) {
            test1(scheduledThreadPool);
        //}

    }

    /**
     * 每三秒执行一次
     * @param scheduledThreadPool
     */
    public void test(ScheduledExecutorService scheduledThreadPool){
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +  "  delay 3 second");
            }
        }, 3, TimeUnit.SECONDS);
    }

    public static void test1(ScheduledExecutorService scheduledThreadPool){
        scheduledThreadPool.scheduleAtFixedRate((Runnable) () -> System.out.println(Thread.currentThread().getName() +  "  delay 3 second"), 1,3, TimeUnit.SECONDS);
    }
}
