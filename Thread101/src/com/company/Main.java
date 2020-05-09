package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main.main");
        MyThreadClass myThreadClassObj = new MyThreadClass();

        Thread t1 = new Thread(myThreadClassObj);
        t1.start();

        Thread t2 = new Thread(() -> System.out.println(String.format("ThreadName: %s and Thread Id: %d",
                Thread.currentThread()
                        .getName(),
                Thread.currentThread()
                    .getId())), "Lambda thread");
        t2.start();

        System.out.println(String.format("ThreadName: %s and Thread Id: %d", Thread.currentThread().getName(), Thread.currentThread().getId()));
        Thread.sleep(2000);
    }
}
