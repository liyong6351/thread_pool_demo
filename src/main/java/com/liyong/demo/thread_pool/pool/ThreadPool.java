package com.liyong.demo.thread_pool.pool;

public interface ThreadPool<Job extends Runnable> {
    //执行一个任务，这个Job必须实现Runnable
    void execute(Job job);
    //关闭线程池
    void shutdown();
    //增加工作线程，即用来执行任务的线程
    void addWorks(int num);
    //减少工作线程
    void removeWorker(int num) throws IllegalAccessException;
    //获取正在等待执行的任务数量
    int getJobSize();
}
