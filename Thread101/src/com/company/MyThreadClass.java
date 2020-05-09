package com.company;

public class MyThreadClass implements Runnable {
    @Override public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadClass.run");
        System.out.println(String.format("ThreadName: %s and Thread Id: %d", Thread.currentThread().getName(), Thread.currentThread().getId()));
    }
}
